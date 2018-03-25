package com.codelib.java.sample.jaxb;

import static org.junit.Assert.*;

import java.util.Date;

import org.junit.Test;

import com.codelib.java.sample.jaxb.model.TbMessage;

public class XmlBuilderTest {

	@Test
	public void testConvertToXml() {
		TbMessage message = new TbMessage();
	    message.setMsgId(110);
	    message.setContent("这是一个测试消息");
	    message.setCreateDate(new Date());

		String string = XmlBuilder.convertToXml(message);

	    System.out.println(string);
	}

	@Test
	public void testConvertToXmlFile() {
		fail("Not yet implemented");
	}

	@Test
	public void testXmlFileToObject() {
		fail("Not yet implemented");
	}

	@Test
	public void testXmlStrToObject() {
		fail("Not yet implemented");
	}

}
