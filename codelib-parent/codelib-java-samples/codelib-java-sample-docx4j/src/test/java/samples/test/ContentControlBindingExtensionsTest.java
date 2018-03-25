package samples.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.concurrent.atomic.AtomicInteger;

import javax.xml.bind.JAXBContext;

import org.docx4j.model.datastorage.BindingHandler;
import org.docx4j.model.datastorage.CustomXmlDataStoragePartSelector;
import org.docx4j.model.datastorage.OpenDoPEHandler;
import org.docx4j.model.datastorage.OpenDoPEIntegrity;
import org.docx4j.model.datastorage.OpenDoPEReverter;
import org.docx4j.model.datastorage.RemovalHandler;
import org.docx4j.model.datastorage.RemovalHandler.Quantifier;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.CustomXmlDataStoragePart;
import org.junit.Test;

public class ContentControlBindingExtensionsTest {

	public static JAXBContext context = org.docx4j.jaxb.Context.jc;

	static String filepathprefix;

	@Test
	public void testContentControlBindingExtensions() throws Docx4JException, FileNotFoundException {
		String inputfilepath = System.getProperty("user.dir") + "/docs/ContentControlBindingExtensions/input/invoice.docx";

		String data = System.getProperty("user.dir") + "/docs/ContentControlBindingExtensions/input/invoice-data.xml";

		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));

		filepathprefix = inputfilepath.substring(0, inputfilepath.lastIndexOf("."));
		System.out.println(filepathprefix);

		StringBuilder timingSummary = new StringBuilder();

		// Find custom xml item id and inject data_file.xml
		long startTime = System.currentTimeMillis();
		CustomXmlDataStoragePart customXmlDataStoragePart = CustomXmlDataStoragePartSelector
				.getCustomXmlDataStoragePart(wordMLPackage);
		if (customXmlDataStoragePart == null) {
			throw new RuntimeException("no xml");
		}
		customXmlDataStoragePart.getData().setDocument(new FileInputStream(new File(data)));
		long endTime = System.currentTimeMillis();
		timingSummary.append("\nmerge data: " + (endTime - startTime));
		System.out.println("data merged");

		wordMLPackage.save(new File(System.getProperty("user.dir") + "/docs/ContentControlBindingExtensions/output/OUT_injected.docx"));

		// Process conditionals and repeats
		startTime = System.currentTimeMillis();
		OpenDoPEHandler odh = new OpenDoPEHandler(wordMLPackage);
		odh.preprocess();
		endTime = System.currentTimeMillis();
		timingSummary.append("OpenDoPEHandler: " + (endTime - startTime));

		// System.out.println(
		// XmlUtils.marshaltoString(wordMLPackage.getMainDocumentPart().getJaxbElement(),
		// true, true)
		// );
		wordMLPackage.save(new File(filepathprefix + "_1_preprocessed.docx"));
		System.out.println("Saved: " + filepathprefix + "_1_preprocessed.docx");

		startTime = System.currentTimeMillis();
		OpenDoPEIntegrity odi = new OpenDoPEIntegrity();
		odi.process(wordMLPackage);
		endTime = System.currentTimeMillis();
		timingSummary.append("\nOpenDoPEIntegrity: " + (endTime - startTime));

		// System.out.println(
		// XmlUtils.marshaltoString(wordMLPackage.getMainDocumentPart().getJaxbElement(),
		// true, true)
		// );
		wordMLPackage.save(new File(filepathprefix + "_2_integrity.docx"));
		System.out.println("Saved: " + filepathprefix + "_2_integrity.docx");

		// Apply the bindings

		BindingHandler. getHyperlinkResolver().setHyperlinkStyle("Hyperlink");
		startTime = System.currentTimeMillis();

		// AtomicInteger bookmarkId = odh.getNextBookmarkId();
		AtomicInteger bookmarkId = new AtomicInteger();

		BindingHandler bh = new BindingHandler(wordMLPackage);
		bh.setStartingIdForNewBookmarks(bookmarkId);
		bh.applyBindings(wordMLPackage.getMainDocumentPart());

		endTime = System.currentTimeMillis();
		timingSummary.append("\nBindingHandler.applyBindings: " + (endTime - startTime));
		// System.out.println(
		// XmlUtils.marshaltoString(wordMLPackage.getMainDocumentPart().getJaxbElement(),
		// true, true)
		// );
		wordMLPackage.save(new File(filepathprefix + "_3_bound.docx"));
		System.out.println("Saved: " + filepathprefix + "_3_bound.docx");

		// Either demonstrate reverter, or stripping of controls;
		// you can't do both. So comment out one or the other.
		// reverter(inputfilepath, filepathprefix + "_bound.docx");
		//
		// Strip content controls
		startTime = System.currentTimeMillis();
		RemovalHandler rh = new RemovalHandler();
		rh.removeSDTs(wordMLPackage, Quantifier.ALL);
		endTime = System.currentTimeMillis();
		timingSummary.append("\nRemovalHandler: " + (endTime - startTime));

		wordMLPackage.save(new File(filepathprefix + "_4_stripped.docx"));
		System.out.println("Saved: " + filepathprefix + "_4_stripped.docx");

		System.out.println(timingSummary);
	}

	public static void reverter(String inputfilepath, String instancePath) throws Docx4JException {

		WordprocessingMLPackage instancePkg = WordprocessingMLPackage.load(new java.io.File(instancePath));

		OpenDoPEReverter reverter = new OpenDoPEReverter(WordprocessingMLPackage.load(new java.io.File(inputfilepath)),
				instancePkg);

		System.out.println("reverted? " + reverter.revert());

		instancePkg.save(new File(filepathprefix + "_5_reverted.docx"));
		System.out.println("Saved: " + filepathprefix + "_5_reverted.docx");

	}

}
