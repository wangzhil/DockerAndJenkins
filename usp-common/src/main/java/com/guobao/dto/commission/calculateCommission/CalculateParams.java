package com.guobao.dto.commission.calculateCommission;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

public class CalculateParams {
    /**订单号*/
    private String orderNo;
    /**订单号*/
    private String managecom;
    /**代理人编号*/
    private String agentCode;
    /**代理人级别*/
    private String agentGrade;
    /**代理人级别系数*/
    private String agentGradeCoefficient;
    /**业务日期*/
    private Date businessDate;
    /**业务类型*/
    private String businessType;
    /**缴费频次*/
    private String payintv;
    /**缴费年期*/
    private Integer payendyear;
    /**交易金额*/
    private BigDecimal totalprem;
    /**策略*/
    private String strategy;
    /**保单状态*/
    private String businessstate;

    private List<CalculatePol> polList;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getAgentCode() {
        return agentCode;
    }

    public void setAgentCode(String agentCode) {
        this.agentCode = agentCode;
    }

    public List<CalculatePol> getPolList() {
        return polList;
    }

    public void setPolList(List<CalculatePol> polList) {
        this.polList = polList;
    }

    public String getAgentGrade() {
        return agentGrade;
    }

    public void setAgentGrade(String agentGrade) {
        this.agentGrade = agentGrade;
    }

    public String getAgentGradeCoefficient() {
        return agentGradeCoefficient;
    }

    public void setAgentGradeCoefficient(String agentGradeCoefficient) {
        this.agentGradeCoefficient = agentGradeCoefficient;
    }

    public Date getBusinessDate() {
        return businessDate;
    }

    public void setBusinessDate(Date businessDate) {
        this.businessDate = businessDate;
    }

    public String getManagecom() {
        return managecom;
    }

    public void setManagecom(String managecom) {
        this.managecom = managecom;
    }

    public String getPayintv() {
        return payintv;
    }

    public void setPayintv(String payintv) {
        this.payintv = payintv;
    }

    public Integer getPayendyear() {
        return payendyear;
    }

    public void setPayendyear(Integer payendyear) {
        this.payendyear = payendyear;
    }

    public BigDecimal getTotalprem() {
        return totalprem;
    }

    public void setTotalprem(BigDecimal totalprem) {
        this.totalprem = totalprem;
    }

    public String getStrategy() {
        return strategy;
    }

    public void setStrategy(String strategy) {
        this.strategy = strategy;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getBusinessstate() {
        return businessstate;
    }

    public void setBusinessstate(String businessstate) {
        this.businessstate = businessstate;
    }

}
