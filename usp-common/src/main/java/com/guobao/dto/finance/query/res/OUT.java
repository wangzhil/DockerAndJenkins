package com.guobao.dto.finance.query.res;

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
	public String getRdSeq() {
		return RdSeq;
	}
	public void setRdSeq(String rdSeq) {
		RdSeq = rdSeq;
	}
	public String getTransState() {
		return TransState;
	}
	public void setTransState(String transState) {
		TransState = transState;
	}
	public String getRecOrgFlag() {
		return RecOrgFlag;
	}
	public void setRecOrgFlag(String recOrgFlag) {
		RecOrgFlag = recOrgFlag;
	}
	public String getCorpAct() {
		return CorpAct;
	}
	public void setCorpAct(String corpAct) {
		CorpAct = corpAct;
	}
	public String getCorpEntity() {
		return CorpEntity;
	}
	public void setCorpEntity(String corpEntity) {
		CorpEntity = corpEntity;
	}
	public String getCorpBank() {
		return CorpBank;
	}
	public void setCorpBank(String corpBank) {
		CorpBank = corpBank;
	}
	public String getRecChannel() {
		return RecChannel;
	}
	public void setRecChannel(String recChannel) {
		RecChannel = recChannel;
	}
	public String getVCorpAct() {
		return VCorpAct;
	}
	public void setVCorpAct(String vCorpAct) {
		VCorpAct = vCorpAct;
	}
	public String getVCorpEntity() {
		return VCorpEntity;
	}
	public void setVCorpEntity(String vCorpEntity) {
		VCorpEntity = vCorpEntity;
	}
	public String getVCorpBank() {
		return VCorpBank;
	}
	public void setVCorpBank(String vCorpBank) {
		VCorpBank = vCorpBank;
	}
	public String getOppAct() {
		return OppAct;
	}
	public void setOppAct(String oppAct) {
		OppAct = oppAct;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getAbstract() {
		return Abstract;
	}
	public void setAbstract(String abstract1) {
		Abstract = abstract1;
	}
	public String getPayInfoCode() {
		return PayInfoCode;
	}
	public void setPayInfoCode(String payInfoCode) {
		PayInfoCode = payInfoCode;
	}
	public String getPayInfo() {
		return PayInfo;
	}
	public void setPayInfo(String payInfo) {
		PayInfo = payInfo;
	}
	public String getPayMadeDate() {
		return PayMadeDate;
	}
	public void setPayMadeDate(String payMadeDate) {
		PayMadeDate = payMadeDate;
	}
	public String getCancelState() {
		return CancelState;
	}
	public void setCancelState(String cancelState) {
		CancelState = cancelState;
	}
	public String getCancelInfo() {
		return CancelInfo;
	}
	public void setCancelInfo(String cancelInfo) {
		CancelInfo = cancelInfo;
	}
	public String getRespReserved1() {
		return RespReserved1;
	}
	public void setRespReserved1(String respReserved1) {
		RespReserved1 = respReserved1;
	}
	public String getRespReserved2() {
		return RespReserved2;
	}
	public void setRespReserved2(String respReserved2) {
		RespReserved2 = respReserved2;
	}
	public String getS3Sign() {
		return S3Sign;
	}
	public void setS3Sign(String s3Sign) {
		S3Sign = s3Sign;
	}
	
	
}
