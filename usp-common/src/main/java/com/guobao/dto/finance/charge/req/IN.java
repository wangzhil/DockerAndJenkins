package com.guobao.dto.finance.charge.req;

public class IN {
  
	//收款指令流水号                     必录            
	private String RdSeq;
	//收付业务号                     必录            
	private String PaymentCode;
	//申请组织                     必录            
	private String ApplyEntity;
	//交易类型                     必录            
	private String PayType;
	//企业方收款账号
	private String CorpAct;   
	//付款人账号                     必录            
	private String OppAct;
	//付款人名称                     必录            
	private String OppActName;
	//付款账号区域
	private String OppArea;
	//付款账号银行                     必录            
	private String OppBank;
	//币种                     必录            
	private String Cur;
	//金额                     必录            
	private String Amount;
    //公私标志                     必录            
	private String PrivateFlag;
	//用途
	private String Purpose;
	//备注
	private String Memo;
	//摘要
	private String Description;
	//付款银行卡(折)类型                     必录            
	private String CardType;
	//付款人证件类型                     必录            
	private String CertType;
	//付款人证件号码                     必录            
	private String CertNumber;
	//付款人手机号                     必录            
	private String CellPhone;
	//投保人名称
	private String Insurer;
	//被保险人名称
	private String Insured;
    //来源系统单据号码
	private String SourceNoteCode;
	//资金用途
	private String Category;
	//明细保留字段
	private String ReqReserved1;
	private String ReqReserved2;
	private String ReqReserved3;
	private String ReqReserved4;
	private String ReqReserved5;
	//销售渠道
	private String SaleChannel;
	//密钥版本
	private String KeyVersion;
	//签名信息
	private String S3Sign;
	public String getRdSeq() {
		return RdSeq;
	}
	public void setRdSeq(String rdSeq) {
		RdSeq = rdSeq;
	}
	public String getPaymentCode() {
		return PaymentCode;
	}
	public void setPaymentCode(String paymentCode) {
		PaymentCode = paymentCode;
	}
	public String getApplyEntity() {
		return ApplyEntity;
	}
	public void setApplyEntity(String applyEntity) {
		ApplyEntity = applyEntity;
	}
	public String getPayType() {
		return PayType;
	}
	public void setPayType(String payType) {
		PayType = payType;
	}
	public String getCorpAct() {
		return CorpAct;
	}
	public void setCorpAct(String corpAct) {
		CorpAct = corpAct;
	}
	public String getOppAct() {
		return OppAct;
	}
	public void setOppAct(String oppAct) {
		OppAct = oppAct;
	}
	public String getOppActName() {
		return OppActName;
	}
	public void setOppActName(String oppActName) {
		OppActName = oppActName;
	}
	public String getOppArea() {
		return OppArea;
	}
	public void setOppArea(String oppArea) {
		OppArea = oppArea;
	}
	public String getOppBank() {
		return OppBank;
	}
	public void setOppBank(String oppBank) {
		OppBank = oppBank;
	}
	public String getCur() {
		return Cur;
	}
	public void setCur(String cur) {
		Cur = cur;
	}
	public String getAmount() {
		return Amount;
	}
	public void setAmount(String amount) {
		Amount = amount;
	}
	public String getPrivateFlag() {
		return PrivateFlag;
	}
	public void setPrivateFlag(String privateFlag) {
		PrivateFlag = privateFlag;
	}
	public String getPurpose() {
		return Purpose;
	}
	public void setPurpose(String purpose) {
		Purpose = purpose;
	}
	public String getMemo() {
		return Memo;
	}
	public void setMemo(String memo) {
		Memo = memo;
	}
	public String getDescription() {
		return Description;
	}
	public void setDescription(String description) {
		Description = description;
	}
	public String getCardType() {
		return CardType;
	}
	public void setCardType(String cardType) {
		CardType = cardType;
	}
	public String getCertType() {
		return CertType;
	}
	public void setCertType(String certType) {
		CertType = certType;
	}
	public String getCertNumber() {
		return CertNumber;
	}
	public void setCertNumber(String certNumber) {
		CertNumber = certNumber;
	}
	public String getCellPhone() {
		return CellPhone;
	}
	public void setCellPhone(String cellPhone) {
		CellPhone = cellPhone;
	}
	public String getInsurer() {
		return Insurer;
	}
	public void setInsurer(String insurer) {
		Insurer = insurer;
	}
	public String getInsured() {
		return Insured;
	}
	public void setInsured(String insured) {
		Insured = insured;
	}
	public String getSourceNoteCode() {
		return SourceNoteCode;
	}
	public void setSourceNoteCode(String sourceNoteCode) {
		SourceNoteCode = sourceNoteCode;
	}
	public String getCategory() {
		return Category;
	}
	public void setCategory(String category) {
		Category = category;
	}
	public String getReqReserved1() {
		return ReqReserved1;
	}
	public void setReqReserved1(String reqReserved1) {
		ReqReserved1 = reqReserved1;
	}
	public String getReqReserved2() {
		return ReqReserved2;
	}
	public void setReqReserved2(String reqReserved2) {
		ReqReserved2 = reqReserved2;
	}
	public String getReqReserved3() {
		return ReqReserved3;
	}
	public void setReqReserved3(String reqReserved3) {
		ReqReserved3 = reqReserved3;
	}
	public String getReqReserved4() {
		return ReqReserved4;
	}
	public void setReqReserved4(String reqReserved4) {
		ReqReserved4 = reqReserved4;
	}
	public String getReqReserved5() {
		return ReqReserved5;
	}
	public void setReqReserved5(String reqReserved5) {
		ReqReserved5 = reqReserved5;
	}
	public String getSaleChannel() {
		return SaleChannel;
	}
	public void setSaleChannel(String saleChannel) {
		SaleChannel = saleChannel;
	}
	public String getKeyVersion() {
		return KeyVersion;
	}
	public void setKeyVersion(String keyVersion) {
		KeyVersion = keyVersion;
	}
	public String getS3Sign() {
		return S3Sign;
	}
	public void setS3Sign(String s3Sign) {
		S3Sign = s3Sign;
	}	
	
	
	
	
}
