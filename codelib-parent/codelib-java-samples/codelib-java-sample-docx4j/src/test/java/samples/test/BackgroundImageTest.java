package samples.test;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;

import javax.xml.bind.JAXBElement;

import org.docx4j.openpackaging.packages.WordprocessingMLPackage;
import org.docx4j.openpackaging.parts.WordprocessingML.BinaryPartAbstractImage;
import org.docx4j.vml.CTFill;
import org.docx4j.wml.CTBackground;
import org.docx4j.wml.ObjectFactory;
import org.junit.Test;

/**
 * 设置页面背景
 * 
 * @author zhanyao
 *
 */
public class BackgroundImageTest {

	// Save it to
	static String DOCX_IN = System.getProperty("user.dir") + "/docs/BackgroundImage/input/greentick.png";
	static String DOCX_OUT = System.getProperty("user.dir") + "/docs/BackgroundImage/output/OUT_BackgroundImage.docx";

	@Test
	public void testBackgroundImage() throws Exception {
		// The image to add
		File imageFile = new File(DOCX_IN);

		BackgroundImageTest sample = new BackgroundImageTest();
		sample.addBackground(imageFile);
	}

	public void addBackground(File imageFile) throws Exception {

		byte[] image = this.getImage(imageFile);

		WordprocessingMLPackage wordMLPackage = WordprocessingMLPackage.createPackage();

		BinaryPartAbstractImage imagePartBG = BinaryPartAbstractImage.createImagePart(wordMLPackage, image);

		wordMLPackage.getMainDocumentPart().getContents()
				.setBackground(createBackground(imagePartBG.getRelLast().getId()));

		wordMLPackage.getMainDocumentPart().addParagraphOfText(
				"To see your background, go to 'Web layout' or 'Full screen reading' document view!");

		File f = new File(DOCX_OUT);
		wordMLPackage.save(f);

	}

	private static CTBackground createBackground(String rId) {

		ObjectFactory wmlObjectFactory = new ObjectFactory();

		CTBackground background = wmlObjectFactory.createCTBackground();
		background.setColor("FFFFFF");
		org.docx4j.vml.ObjectFactory vmlObjectFactory = new org.docx4j.vml.ObjectFactory();
		// Create object for background (wrapped in JAXBElement)
		org.docx4j.vml.CTBackground background2 = vmlObjectFactory.createCTBackground();
		JAXBElement<org.docx4j.vml.CTBackground> backgroundWrapped = vmlObjectFactory.createBackground(background2);
		background.getAnyAndAny().add(backgroundWrapped);
		background2.setTargetscreensize("1024,768");
		background2.setVmlId("_x0000_s1025");
		background2.setBwmode(org.docx4j.vml.officedrawing.STBWMode.WHITE);
		// Create object for fill
		CTFill fill = vmlObjectFactory.createCTFill();
		background2.setFill(fill);
		fill.setTitle("Alien 1");
		fill.setId(rId);
		fill.setType(org.docx4j.vml.STFillType.FRAME);
		fill.setRecolor(org.docx4j.vml.STTrueFalse.T);

		return background;
	}

	private byte[] getImage(File imageFile) throws IOException {

		// Our utility method wants that as a byte array
		InputStream is = new FileInputStream(imageFile);
		long length = imageFile.length();
		// You cannot create an array using a long type.
		// It needs to be an int type.
		if (length > Integer.MAX_VALUE) {
			System.out.println("File too large!!");
		}
		byte[] bytes = new byte[(int) length];
		int offset = 0;
		int numRead = 0;
		while (offset < bytes.length && (numRead = is.read(bytes, offset, bytes.length - offset)) >= 0) {
			offset += numRead;
		}
		// Ensure all the bytes have been read in
		if (offset < bytes.length) {
			System.out.println("Could not completely read file " + imageFile.getName());
		}
		is.close();

		return bytes;
	}
}
