package com.guobao.dto.finance.charge.res;

import javax.xml.bind.annotation.XmlElement;

public class OUT {

	//收款指令流水号                             必录        
	private String RdSeq;
	//收款状态                             必录
	private String TransState;
	//总部集中收款的标识                             必录
	private String RecOrgFlag;
	//企业方收款实体账号
	private String CorpAct;
	//实体账号所属组织
	private String CorpEntity;
	//实体账号所属银行
	private String CorpBank;
	//收款渠道名称
	private String RecChannel;
	//企业方收款虚拟账号
	private String VCorpAct;
	//虚拟账号所属组织
	private String VCorpEntity;
	//虚拟账户所属银行
	private String VCorpBank;
	//付款人账号
	private String OppAct;
	//金额                             必录
	private String Amount;
	//对账码
	private String Abstract;
	//支付信息码
	private String PayInfoCode;
	//支付信息描述
	private String PayInfo;
	//支付确认时间
	private String PayMadeDate;
	//作废状态                             必录
	private String CancelState;
	//作废原因
	private String CancelInfo;
	//保留字段
	private String RespReserved1;
	//保留字段
	private String RespReserved2;
	//签名
	private String S3Sign;
	
	@XmlElement(name="RdSeq")
	public String getRdSeq() {
		return RdSeq;
	}
	public void setRdSeq(String rdSeq) {
		RdSeq = rdSeq;
	}
	@XmlElement(name="TransState")
	public String getTransState() {
		return TransState;
	}
	public void setTransState(String transState) {
		TransState = transState;
	}
	@XmlElement(name="RecOrgFlag")
	public String getRecOrgFlag() {
		return RecOrgFlag;
	}
	public void setRecOrgFlag(String recOrgFlag) {
		RecOrgFlag = recOrgFlag;
	}
	@XmlElement(name="CorpAct")
	public String getCorpAct() {
		return CorpAct;
	}
	public void setCorpAct(String corpAct) {
		CorpAct = corpAct;
	}
	@XmlElement(name="CorpEntity")
	public String getCorpEntity() {
		return CorpEntity;
	}
	public void setCorpEntity(String corpEntity) {
		CorpEntity = corpEntity;
	}
	@XmlElement(name="CorpBank")
	public String getCorpBank() {
		return CorpBank;
	}
	public void setCorpBank(String corpBank) {
		CorpBank = corpBank;
	}
	@XmlElement(name="RecChannel")
	public String getRecChannel() {
		return RecChannel;
	}
	public void setRecChannel(String recChannel) {
		RecChannel = recChannel;
	}
	@XmlElement(name="VCorpAct")
	public String getVCorpAct() {
		return VCorpAct;
	}
	public void setVCorpAct(String vCorpAct) {
		VCorpAct = vCorpAct;
	}
	@XmlElement(name="VCorpEntity")
	public String getVCorpEntity() {
		return VCorpEntity;
	}
	public void setVCorpEntity(String vCorpEntity) {
		VCorpEntity = vCorpEntity;
	}
	@XmlElement(name="VCorpBank")
	public String getVCorpBank() {
		return VCorpBank;
	}
	public void setVCorpBank(String vCorpBank) {
		VCorpBank = vCorpBank;
	}
	@XmlElement(name="OppAct")
	public String getOppAct() {
		return OppAct;
	}
	public void setOppAct(String oppAct) {
		OppAct = oppAct;
	}
	@XmlElement(name="Amount")
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	@XmlElement(name="Abstract")
	public String getAbstract() {
		return Abstract;
	}
	public void setAbstract(String abstract1) {
		Abstract = abstract1;
	}
	@XmlElement(name="PayInfoCode")
	public String getPayInfoCode() {
		return PayInfoCode;
	}
	public void setPayInfoCode(String payInfoCode) {
		PayInfoCode = payInfoCode;
	}
	@XmlElement(name="PayInfo")
	public String getPayInfo() {
		return PayInfo;
	}
	public void setPayInfo(String payInfo) {
		PayInfo = payInfo;
	}
	@XmlElement(name="PayMadeDate")
	public String getPayMadeDate() {
		return PayMadeDate;
	}
	public void setPayMadeDate(String payMadeDate) {
		PayMadeDate = payMadeDate;
	}
	@XmlElement(name="CancelState")
	public String getCancelState() {
		return CancelState;
	}
	public void setCancelState(String cancelState) {
		CancelState = cancelState;
	}
	@XmlElement(name="CancelInfo")
	public String getCancelInfo() {
		return CancelInfo;
	}
	public void setCancelInfo(String cancelInfo) {
		CancelInfo = cancelInfo;
	}
	@XmlElement(name="RespReserved1")
	public String getRespReserved1() {
		return RespReserved1;
	}
	public void setRespReserved1(String respReserved1) {
		RespReserved1 = respReserved1;
	}
	@XmlElement(name="RespReserved2")
	public String getRespReserved2() {
		return RespReserved2;
	}
	public void setRespReserved2(String respReserved2) {
		RespReserved2 = respReserved2;
	}
	@XmlElement(name="S3Sign")
	public String getS3Sign() {
		return S3Sign;
	}
	public void setS3Sign(String s3Sign) {
		S3Sign = s3Sign;
	}
	
	
}
