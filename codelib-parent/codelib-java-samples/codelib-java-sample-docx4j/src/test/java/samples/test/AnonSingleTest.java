package samples.test;

import java.io.File;

import org.docx4j.Docx4J;
import org.docx4j.anon.Anonymize;
import org.docx4j.anon.AnonymizeResult;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.Part;
import org.junit.Test;

public class AnonSingleTest {

	@Test
	public void testAnonSingle() throws Docx4JException {
		String inputfilepath = System.getProperty("user.dir") + "/docs/AnonSingle/input/sample-docxv2.docx";

		String outputfilepath = System.getProperty("user.dir") + "/docs/AnonSingle/output/OUT_Anon.docx";

		WordprocessingMLPackage pkg = Docx4J.load(new File(inputfilepath));

		Anonymize anon = new Anonymize(pkg);
		AnonymizeResult result = anon.go();

		Docx4J.save(pkg, new File(outputfilepath));

		// Report
		System.out.println("\n\n REPORT for " + inputfilepath + "\n\n");
		if (result.isOK()) {
			System.out.println("document successfully anonymised.");
		} else {
			System.out.println("document partially anonymised; please check " + outputfilepath);

			if (result.getUnsafeParts().size() > 0) {
				System.out.println("The following parts may leak info:");
				for (Part p : result.getUnsafeParts()) {
					System.out.println(p.getPartName().getName() + ", of type " + p.getClass().getName());
				}
			}

			// unsafe objects
			System.out.println(result.reportUnsafeObjects());
		}

		System.out.println("\n\n .. end REPORT for " + inputfilepath + "\n\n");
	}

}
