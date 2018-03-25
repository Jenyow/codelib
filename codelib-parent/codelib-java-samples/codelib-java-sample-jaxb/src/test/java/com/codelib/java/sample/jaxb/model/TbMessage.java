package com.codelib.java.sample.jaxb.model;

import java.util.Date;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlType(propOrder = { "msgId", "content", "createDate" })
@XmlAccessorType(XmlAccessType.FIELD)
@XmlRootElement(name = "Message")
public class TbMessage {

	@XmlElement(name = "MsgID")
	private Integer msgId;

	@XmlElement(name = "Content")
	private String content;

	@XmlElement(name = "CreateDate")
	private Date createDate;

	public Integer getMsgId() {
		return msgId;
	}

	public void setMsgId(Integer msgId) {
		this.msgId = msgId;
	}

	public String getContent() {
		return content;
	}

	public void setContent(String content) {
		this.content = content;
	}

	public Date getCreateDate() {
		return createDate;
	}

	public void setCreateDate(Date createDate) {
		this.createDate = createDate;
	}
	
}