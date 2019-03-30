package com.guobao.dto.finance.pub.res;

import javax.xml.bind.annotation.XmlElement;

public class PUB {

private String TransCode;
	
	private String TransDate;
	private String TransTime;
	private String TransSeq;
	//交易返回码
	private String RtnCode;
	//交易返回描述
	private String RtnMsg;
	
	@XmlElement(name = "TransCode")
	public String getTransCode() {
		return TransCode;
	}
	public void setTransCode(String transCode) {
		TransCode = transCode;
	}
	@XmlElement(name = "TransDate")
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	@XmlElement(name = "TransTime")
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	
	@XmlElement(name = "TransSeq")
	public String getTransSeq() {
		return TransSeq;
	}
	public void setTransSeq(String transSeq) {
		TransSeq = transSeq;
	}
	@XmlElement(name = "RtnCode")
	public String getRtnCode() {
		return RtnCode;
	}
	public void setRtnCode(String rtnCode) {
		RtnCode = rtnCode;
	}
	@XmlElement(name = "RtnMsg")
	public String getRtnMsg() {
		return RtnMsg;
	}
	public void setRtnMsg(String rtnMsg) {
		RtnMsg = rtnMsg;
	}
	
	

}