package samples.test;

import java.io.File;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.AltChunkType;
import org.junit.Test;

public class AltChunkAddOfTypeHtmlTest {

	@Test
	public void testAltChunkAddOfTypeHtml() throws Docx4JException {
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();

		String html = "<html><head><title>Import me</title></head><body><p>Hello World!</p></body></html>"; 

		wordMLPackage.getMainDocumentPart().addAltChunk(AltChunkType.Html, html.getBytes()); 

		wordMLPackage.save(new File(System.getProperty("user.dir") + "/docs/AltChunkAddOfTypeHtml/output/test.docx"));		
	}

}
