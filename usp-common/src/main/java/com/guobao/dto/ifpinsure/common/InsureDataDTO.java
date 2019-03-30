package com.guobao.dto.ifpinsure.common;

import java.util.Date;

/**
 * 
 * 【查询insure服务数据】
 * 
 * @author guobao
 * @date 2018年1月29日 下午2:35:57
 * @version V1.0
 */
public class InsureDataDTO {

	/**
	 * 保单信息
	 */
	// 保单状态
	private String contState;

	// 保单状态
	private String SaleChnl;

	// 保单生效日期
	private Date CvaliDate;

	// 保单回执日期
	private Date CustomGetPolDate;

	// 保单投保单号
	private String PrtNo;

	// 保单号
	private String ContNo;

	// 领取人开户行代号
	private String bankCode;

	// 领取人银行账户
	private String bankAccNo;

	// 领取人姓名
	private String accName;

	// 机构号
	private String manageCom;

	// 保额
	private String amnt;

	// 保费
	private String prem;

	/**
	 * 投保人信息
	 */
	// 投保人姓名
	private String appName;

	// 投保人证件类型
	private String appCardType;

	// 投保人证件号码
	private String appCardNo;

	// 投保人证件有效期
	private String idExpade;

	/**
	 * 投保人地址信息
	 */
	private String appProvince;

	private String appCity;

	private String appCounty;

	private String appPlace;

	private String appPostalAddress;

	private String appZipCode;

	private String appPhone;

	/**
	 * 被保人信息
	 */
	// 被保人姓名
	private String insuredName;

	// 被保人证件类型
	private String insuredCardType;

	// 被保人证件号码
	private String insuredCardNo;

	// 被保人客户号
	private String insuredNo;

	/**
	 * 被保人地址信息
	 */
	private String insProvince;

	private String insCity;

	private String insCounty;

	private String insPlace;

	private String insPostalAddress;

	private String insZipCode;

	private String insphone;

	/**
	 * 
	 * 险种信息
	 */

	// 主险编码
	private String mainRiskCode;
	

	public String getInsuredNo() {
		return insuredNo;
	}

	public void setInsuredNo(String insuredNo) {
		this.insuredNo = insuredNo;
	}

	// 附加险代码
	private String riskCode;

	public String getIdExpade() {
		return idExpade;
	}

	public void setIdExpade(String idExpade) {
		this.idExpade = idExpade;
	}
	
	//险种号码
	private String polNo;
	
	public String getPolNo() {
		return polNo;
	}

	public void setPolNo(String polNo) {
		this.polNo = polNo;
	}

	public String getSaleChnl() {
		return SaleChnl;
	}

	public void setSaleChnl(String saleChnl) {
		SaleChnl = saleChnl;
	}

	public String getContState() {
		return contState;
	}

	public void setContState(String contState) {
		this.contState = contState;
	}

	public String getAppName() {
		return appName;
	}

	public void setAppName(String appName) {
		this.appName = appName;
	}

	public String getAppCardType() {
		return appCardType;
	}

	public void setAppCardType(String appCardType) {
		this.appCardType = appCardType;
	}

	public String getAppCardNo() {
		return appCardNo;
	}

	public void setAppCardNo(String appCardNo) {
		this.appCardNo = appCardNo;
	}

	public String getInsuredName() {
		return insuredName;
	}

	public void setInsuredName(String insuredName) {
		this.insuredName = insuredName;
	}

	public String getInsuredCardType() {
		return insuredCardType;
	}

	public void setInsuredCardType(String insuredCardType) {
		this.insuredCardType = insuredCardType;
	}

	public String getInsuredCardNo() {
		return insuredCardNo;
	}

	public void setInsuredCardNo(String insuredCardNo) {
		this.insuredCardNo = insuredCardNo;
	}

	public String getPrtNo() {
		return PrtNo;
	}

	public void setPrtNo(String prtNo) {
		PrtNo = prtNo;
	}

	public String getContNo() {
		return ContNo;
	}

	public void setContNo(String contNo) {
		ContNo = contNo;
	}

	public Date getCvaliDate() {
		return CvaliDate;
	}

	public void setCvaliDate(Date cvaliDate) {
		CvaliDate = cvaliDate;
	}

	public String getMainRiskCode() {
		return mainRiskCode;
	}

	public void setMainRiskCode(String mainRiskCode) {
		this.mainRiskCode = mainRiskCode;
	}

	public String getRiskCode() {
		return riskCode;
	}

	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}

	public String getBankCode() {
		return bankCode;
	}

	public void setBankCode(String bankCode) {
		this.bankCode = bankCode;
	}

	public String getBankAccNo() {
		return bankAccNo;
	}

	public void setBankAccNo(String bankAccNo) {
		this.bankAccNo = bankAccNo;
	}

	public String getAccName() {
		return accName;
	}

	public void setAccName(String accName) {
		this.accName = accName;
	}

	public String getManageCom() {
		return manageCom;
	}

	public void setManageCom(String manageCom) {
		this.manageCom = manageCom;
	}

	public String getAmnt() {
		return amnt;
	}

	public void setAmnt(String amnt) {
		this.amnt = amnt;
	}

	public String getPrem() {
		return prem;
	}

	public void setPrem(String prem) {
		this.prem = prem;
	}

	public String getAppPostalAddress() {
		return appPostalAddress;
	}

	public void setAppPostalAddress(String appPostalAddress) {
		this.appPostalAddress = appPostalAddress;
	}

	public String getAppZipCode() {
		return appZipCode;
	}

	public void setAppZipCode(String appZipCode) {
		this.appZipCode = appZipCode;
	}

	public String getInsPostalAddress() {
		return insPostalAddress;
	}

	public void setInsPostalAddress(String insPostalAddress) {
		this.insPostalAddress = insPostalAddress;
	}

	public String getInsZipCode() {
		return insZipCode;
	}

	public void setInsZipCode(String insZipCode) {
		this.insZipCode = insZipCode;
	}

	public String getAppPhone() {
		return appPhone;
	}

	public void setAppPhone(String appPhone) {
		this.appPhone = appPhone;
	}

	public String getInsphone() {
		return insphone;
	}

	public void setInsphone(String insphone) {
		this.insphone = insphone;
	}

	public String getAppProvince() {
		return appProvince;
	}

	public void setAppProvince(String appProvince) {
		this.appProvince = appProvince;
	}

	public String getAppCity() {
		return appCity;
	}

	public void setAppCity(String appCity) {
		this.appCity = appCity;
	}

	public String getAppCounty() {
		return appCounty;
	}

	public void setAppCounty(String appCounty) {
		this.appCounty = appCounty;
	}

	public String getAppPlace() {
		return appPlace;
	}

	public void setAppPlace(String appPlace) {
		this.appPlace = appPlace;
	}

	public String getInsProvince() {
		return insProvince;
	}

	public void setInsProvince(String insProvince) {
		this.insProvince = insProvince;
	}

	public String getInsCity() {
		return insCity;
	}

	public void setInsCity(String insCity) {
		this.insCity = insCity;
	}

	public String getInsCounty() {
		return insCounty;
	}

	public void setInsCounty(String insCounty) {
		this.insCounty = insCounty;
	}

	public String getInsPlace() {
		return insPlace;
	}

	public void setInsPlace(String insPlace) {
		this.insPlace = insPlace;
	}

	public Date getCustomGetPolDate() {
		return CustomGetPolDate;
	}

	public void setCustomGetPolDate(Date customGetPolDate) {
		CustomGetPolDate = customGetPolDate;
	}
}
