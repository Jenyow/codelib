package samples.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;

import org.docx4j.openpackaging.exceptions.Docx4JException;
import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.AltChunkType;
import org.docx4j.openpackaging.parts.WordprocessingML.HeaderPart;
import org.docx4j.openpackaging.parts.WordprocessingML.MainDocumentPart;
import org.junit.Test;

public class AltChunkAddOfTypeDocxTest {
	
	@Test
	public void testAltChunkAddOfTypeDocx() throws Docx4JException, FileNotFoundException {
		// 设置为 true 则将 chunk.docx 插入到页眉 
		boolean ADD_TO_HEADER = false;

		String inputfilepath = System.getProperty("user.dir") + "/docs/AltChunkAddOfTypeDocx/input/sample-docx.xml";
		String chunkPath = System.getProperty("user.dir") + "/docs/AltChunkAddOfTypeDocx/input/chunk.docx";

		boolean save = true;
		String outputfilepath = System.getProperty("user.dir") + "/docs/AltChunkAddOfTypeDocx/output/OUT_AltChunkAddOfTypeDocx.docx";

		// Open a document from the file system
		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.load(new java.io.File(inputfilepath));

		if (ADD_TO_HEADER) {
			HeaderPart hp = wordMLPackage.getDocumentModel().getSections().get(0).getHeaderFooterPolicy()
					.getDefaultHeader();
			hp.addAltChunk(AltChunkType.WordprocessingML, new FileInputStream(chunkPath));
		} else {
			MainDocumentPart main = wordMLPackage.getMainDocumentPart();
			main.addAltChunk(AltChunkType.WordprocessingML, new FileInputStream(chunkPath));
		}

		if (save) {
			wordMLPackage.save(new File(outputfilepath));
			System.out.println("Saved " + outputfilepath);
		}
	}

}
