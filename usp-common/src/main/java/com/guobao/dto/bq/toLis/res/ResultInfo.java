package com.guobao.dto.bq.toLis.res;

import java.util.List;

/**
 * 
 * 【犹退试算返回信息】
 * @author guobao
 * @date 2018年1月26日 上午10:19:08 
 * @version V1.0
 */
public class ResultInfo {

    /**
     * 犹退试算
     */
    //险种名称
    private String riskName;

    //保单号
    private String contractNo;

    //业务类型   
    private String busiType;

    //退保金额
    private String prem;

    //提示信息
    private String comments;

    //退保手续费
    private String chargeFee;

    //累计红利
    private String bonusGetMoney;

    //给付方式（支付方式）
    private String payMode;

    //保单生效日
    private String validDate;

    //保单到期日
    private String expireDate;

    /**
     * 犹退确认
     */

    //业务受理号
    private String serviceAcceptNo;

    //下期应缴保费
    private String nextPayPrem;

    //被保人姓名
    private String insuredName;

    //偿还自垫利息
    private String cushionInterest;

    //应退保费余额
    private String restPrem;

    //偿还贷款利息
    private String loanInterest;

    //领款人
    private String drawer;

    //偿还自垫本金
    private String cushionPrincipal;

    //合计支付金额
    private String sumGetMoney;

    //投保人姓名
    private String appntName;

    //偿还贷款本金
    private String loanPrincipal;

    //应退累计生息红利
    private String cumulativeEarning;

    //险种信息
    private List<Risk> riskList;

    //账号
    private String bankAccNo;

    //保全生效日
    private String edorValidDate;

    //审批人
    private String approveOperator;

    //开户银行
    private String bankName;

    //受理时间
    private String edorAppDate;

    //经办人
    private String operator;

    //应扣退保费用
    private String charge;

    //批单号
    private String attachmentNo;

    //户名
    private String accName;

    //拟领取金额
    private String occurBala;

    //证件号码
    private String drawerID;

    //证件类型
    private String drawerType;

    public String getServiceAcceptNo() {
        return serviceAcceptNo;
    }

    public void setServiceAcceptNo(String serviceAcceptNo) {
        this.serviceAcceptNo = serviceAcceptNo;
    }

    public String getNextPayPrem() {
        return nextPayPrem;
    }

    public void setNextPayPrem(String nextPayPrem) {
        this.nextPayPrem = nextPayPrem;
    }

    public String getInsuredName() {
        return insuredName;
    }

    public void setInsuredName(String insuredName) {
        this.insuredName = insuredName;
    }

    public String getCushionInterest() {
        return cushionInterest;
    }

    public void setCushionInterest(String cushionInterest) {
        this.cushionInterest = cushionInterest;
    }

    public String getRestPrem() {
        return restPrem;
    }

    public void setRestPrem(String restPrem) {
        this.restPrem = restPrem;
    }

    public String getLoanInterest() {
        return loanInterest;
    }

    public void setLoanInterest(String loanInterest) {
        this.loanInterest = loanInterest;
    }

    public String getDrawer() {
        return drawer;
    }

    public void setDrawer(String drawer) {
        this.drawer = drawer;
    }

    public String getCushionPrincipal() {
        return cushionPrincipal;
    }

    public void setCushionPrincipal(String cushionPrincipal) {
        this.cushionPrincipal = cushionPrincipal;
    }

    public String getSumGetMoney() {
        return sumGetMoney;
    }

    public void setSumGetMoney(String sumGetMoney) {
        this.sumGetMoney = sumGetMoney;
    }

    public String getAppntName() {
        return appntName;
    }

    public void setAppntName(String appntName) {
        this.appntName = appntName;
    }

    public String getLoanPrincipal() {
        return loanPrincipal;
    }

    public void setLoanPrincipal(String loanPrincipal) {
        this.loanPrincipal = loanPrincipal;
    }

    public String getCumulativeEarning() {
        return cumulativeEarning;
    }

    public void setCumulativeEarning(String cumulativeEarning) {
        this.cumulativeEarning = cumulativeEarning;
    }

    public List<Risk> getRiskList() {
        return riskList;
    }

    public void setRiskList(List<Risk> riskList) {
        this.riskList = riskList;
    }

    public String getBankAccNo() {
        return bankAccNo;
    }

    public void setBankAccNo(String bankAccNo) {
        this.bankAccNo = bankAccNo;
    }

    public String getEdorValidDate() {
        return edorValidDate;
    }

    public void setEdorValidDate(String edorValidDate) {
        this.edorValidDate = edorValidDate;
    }

    public String getApproveOperator() {
        return approveOperator;
    }

    public void setApproveOperator(String approveOperator) {
        this.approveOperator = approveOperator;
    }

    public String getBankName() {
        return bankName;
    }

    public void setBankName(String bankName) {
        this.bankName = bankName;
    }

    public String getEdorAppDate() {
        return edorAppDate;
    }

    public void setEdorAppDate(String edorAppDate) {
        this.edorAppDate = edorAppDate;
    }

    public String getOperator() {
        return operator;
    }

    public void setOperator(String operator) {
        this.operator = operator;
    }

    public String getCharge() {
        return charge;
    }

    public void setCharge(String charge) {
        this.charge = charge;
    }

    public String getAttachmentNo() {
        return attachmentNo;
    }

    public void setAttachmentNo(String attachmentNo) {
        this.attachmentNo = attachmentNo;
    }

    public String getAccName() {
        return accName;
    }

    public void setAccName(String accName) {
        this.accName = accName;
    }

    public String getOccurBala() {
        return occurBala;
    }

    public void setOccurBala(String occurBala) {
        this.occurBala = occurBala;
    }

    public String getDrawerID() {
        return drawerID;
    }

    public void setDrawerID(String drawerID) {
        this.drawerID = drawerID;
    }

    public String getDrawerType() {
        return drawerType;
    }

    public void setDrawerType(String drawerType) {
        this.drawerType = drawerType;
    }

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public String getContractNo() {
        return contractNo;
    }

    public void setContractNo(String contractNo) {
        this.contractNo = contractNo;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getPrem() {
        return prem;
    }

    public void setPrem(String prem) {
        this.prem = prem;
    }

    public String getComments() {
        return comments;
    }

    public void setComments(String comments) {
        this.comments = comments;
    }

    public String getChargeFee() {
        return chargeFee;
    }

    public void setChargeFee(String chargeFee) {
        this.chargeFee = chargeFee;
    }

    public String getBonusGetMoney() {
        return bonusGetMoney;
    }

    public void setBonusGetMoney(String bonusGetMoney) {
        this.bonusGetMoney = bonusGetMoney;
    }

    public String getPayMode() {
        return payMode;
    }

    public void setPayMode(String payMode) {
        this.payMode = payMode;
    }

    public String getValidDate() {
        return validDate;
    }

    public void setValidDate(String validDate) {
        this.validDate = validDate;
    }

    public String getExpireDate() {
        return expireDate;
    }

    public void setExpireDate(String expireDate) {
        this.expireDate = expireDate;
    }

}
