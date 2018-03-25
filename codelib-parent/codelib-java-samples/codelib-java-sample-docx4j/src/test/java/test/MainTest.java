package test;

import java.io.BufferedOutputStream;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.docx4j.Docx4J;
import org.docx4j.jaxb.Context;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.io3.Save;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.AltChunkType;
import org.docx4j.openpackaging.parts.WordprocessingML.HeaderPart;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.docx4j.wml.Body;
import org.docx4j.wml.Document;
import org.docx4j.wml.ObjectFactory;
import org.junit.Test;

public class MainTest {

	@Test
	public void testRead() {
		String inputfilepath = "D:/Desktop/Desktop/docx/test.docx";
		try {
			WordprocessingMLPackage wordMLPackage = Docx4J.load(new File(inputfilepath));
			MainDocumentPart documentPart = wordMLPackage.getMainDocumentPart();
			System.out.println(documentPart.getContents().getBody().getContent());
		} catch (Docx4JException e) {
			e.printStackTrace();
		}
	}

	@Test
	public void testWrite() {
		String inputfilepath = "D:/Desktop/Desktop/docx/writeTest.docx";
		try {
			WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
			MainDocumentPart wordDocumentPart = new MainDocumentPart();

			ObjectFactory factory = Context.getWmlObjectFactory();
			Body body = factory.createBody();
			Document wmlDocumentEl = factory.createDocument();
			wmlDocumentEl.setBody(body);

			wordDocumentPart.setJaxbElement(wmlDocumentEl);

			wordMLPackage.addTargetPart(wordDocumentPart);
			wordMLPackage.save(new File(inputfilepath));
		} catch (Docx4JException e) {
			e.printStackTrace();
		}
	}

}
