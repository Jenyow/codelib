package samples.test;

import java.io.File;

import org.docx4j.XmlUtils;
import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.AltChunkType;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.junit.Test;

public class AltChunkXHTMLRoundTripTest {

	/**
	 * 合并内容到同一个文档中
	 * @throws Docx4JException
	 */
	@Test
	public void testAltChunkXHTMLRoundTrip() throws Docx4JException {
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();
		MainDocumentPart mdp = wordMLPackage.getMainDocumentPart();
		
		mdp.addParagraphOfText("Paragraph 1");

		// Add the XHTML altChunk
		String xhtml = "<html><head><title>Import me</title></head><body><p>Hello World!</p></body></html>"; 
		mdp.addAltChunk(AltChunkType.Xhtml, xhtml.getBytes());
		
		mdp.addParagraphOfText("Paragraph 3");
		
		wordMLPackage.save(new File(System.getProperty("user.dir") + "/docs/AltChunkXHTMLRoundTrip/output/test.docx"));	
		
		// Round trip
		WordprocessingMLPackage pkgOut = mdp.convertAltChunks();
		
		// Display result
		System.out.println(
				XmlUtils.marshaltoString(pkgOut.getMainDocumentPart().getContents(), true, true));
	}

}
