package com.guobao.dto.finance.pub.req;

public class PUB {

	//交易来源
	private String TransSource;
	//交易编码
	private String TransCode;
	//交易日期
	private String TransDate;
	//交易时间
	private String TransTime;
	//交易流水号
	private String TransSeq;
	//版本号
	private String Version;
	public String getTransSource() {
		return TransSource;
	}
	public void setTransSource(String transSource) {
		TransSource = transSource;
	}
	public String getTransCode() {
		return TransCode;
	}
	public void setTransCode(String transCode) {
		TransCode = transCode;
	}
	public String getTransDate() {
		return TransDate;
	}
	public void setTransDate(String transDate) {
		TransDate = transDate;
	}
	public String getTransTime() {
		return TransTime;
	}
	public void setTransTime(String transTime) {
		TransTime = transTime;
	}
	public String getTransSeq() {
		return TransSeq;
	}
	public void setTransSeq(String transSeq) {
		TransSeq = transSeq;
	}
	public String getVersion() {
		return Version;
	}
	public void setVersion(String version) {
		Version = version;
	}
		
	
}
