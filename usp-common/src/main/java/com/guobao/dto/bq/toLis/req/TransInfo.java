package com.guobao.dto.bq.toLis.req;

/**
 * 
 * 【业务包头】
 * @author guobao
 * @date 2018年1月26日 上午10:26:06 
 * @version V1.0
 */
public class TransInfo {

    //地区代码
    private String zoneNo;

    //网点代码
    private String branchNo;

    //营销柜员代码
    private String sellTeller;

    //申请渠道
    private String applyChannel;

    //保单号
    private String contractNo;

    //申请人姓名
    private String proposerName;

    //证件类型
    private String cardType;

    //证件号码
    private String cardNo;

    //开户银行
    private String bankCode;

    //开户银行账号
    private String bankAccNo;

    //账户所有人姓名
    private String bankAccName;

    //领取金额
    private String getPrem;

    //业务类型 
    private String busiType;

    //投保人姓名
    private String appName;

    //投保人证件类型
    private String appCardType;

    //投保人证件号码
    private String appCardNo;

    //被保人姓名
    private String insuredName;

    //被保人证件类型
    private String insuredCardType;

    //被保人证件号码
    private String insuredCardNo;

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

    public String getZoneNo() {
        return zoneNo;
    }

    public void setZoneNo(String zoneNo) {
        this.zoneNo = zoneNo;
    }

    public String getBranchNo() {
        return branchNo;
    }

    public void setBranchNo(String branchNo) {
        this.branchNo = branchNo;
    }

    public String getSellTeller() {
        return sellTeller;
    }

    public void setSellTeller(String sellTeller) {
        this.sellTeller = sellTeller;
    }

    public String getApplyChannel() {
        return applyChannel;
    }

    public void setApplyChannel(String applyChannel) {
        this.applyChannel = applyChannel;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getProposerName() {
        return proposerName;
    }

    public void setProposerName(String proposerName) {
        this.proposerName = proposerName;
    }

    public String getCardType() {
        return cardType;
    }

    public void setCardType(String cardType) {
        this.cardType = cardType;
    }

    public String getCardNo() {
        return cardNo;
    }

    public void setCardNo(String cardNo) {
        this.cardNo = cardNo;
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

    public String getBankAccName() {
        return bankAccName;
    }

    public void setBankAccName(String bankAccName) {
        this.bankAccName = bankAccName;
    }

    public String getGetPrem() {
        return getPrem;
    }

    public void setGetPrem(String getPrem) {
        this.getPrem = getPrem;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

}
