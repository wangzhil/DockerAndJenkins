package com.guobao.dto.epay.req;
/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 上午10:07:15
 * @version V1.0
 */
public class EpayReqAccount {

	/** 银行代码 非空 */
	private String bankCode;
	/** 账户类型 00银行卡，01存折，02信用卡。默认银行卡00 */
	private String type;
	/** 账户号 非空 */
	private String userAcctId;
	/** 账户属性 0私人，1公司，默认为私人0  非空 */
	private String property;
	/** 账户持有人姓名 非空 */
	private String userName;
	/** 账户持有人证件类型  */
	private String holderIdType;
	/** 账户持有人证件号码类型  */
	private String holderIdNumber;
	
	public String getBankCode() {
		return bankCode;
	}
	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getUserAcctId() {
		return userAcctId;
	}
	public void setUserAcctId(String userAcctId) {
		this.userAcctId = userAcctId;
	}
	public String getProperty() {
		return property;
	}
	public void setProperty(String property) {
		this.property = property;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getHolderIdType() {
		return holderIdType;
	}
	public void setHolderIdType(String holderIdType) {
		this.holderIdType = holderIdType;
	}
	public String getHolderIdNumber() {
		return holderIdNumber;
	}
	public void setHolderIdNumber(String holderIdNumber) {
		this.holderIdNumber = holderIdNumber;
	}
	
	@Override
	public String toString() {
		return "EpayReqAccount [bankCode=" + bankCode + ", type=" + type + ", userAcctId=" + userAcctId + ", property="
				+ property + ", userName=" + userName + ", holderIdType=" + holderIdType + ", holderIdNumber="
				+ holderIdNumber + "]";
	}
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}