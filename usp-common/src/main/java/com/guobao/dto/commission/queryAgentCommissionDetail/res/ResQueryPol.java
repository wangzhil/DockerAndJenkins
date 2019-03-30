/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年7月19日
 * 修改历史 : 
 *     1. [2017年7月19日]创建文件 by guobao
 */
package com.guobao.dto.commission.queryAgentCommissionDetail.res;

public class ResQueryPol {

    private String riskcode;

    private String riskname;

    private String amnt;

    private String prem;

    private String payendyearflag;

    private String payendyear;

    private String insureyearflag;

    private String insureyear;

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode;
    }

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname;
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

    public String getPayendyearflag() {
        return payendyearflag;
    }

    public void setPayendyearflag(String payendyearflag) {
        this.payendyearflag = payendyearflag;
    }

    public String getPayendyear() {
        return payendyear;
    }

    public void setPayendyear(String payendyear) {
        this.payendyear = payendyear;
    }

    public String getInsureyearflag() {
        return insureyearflag;
    }

    public void setInsureyearflag(String insureyearflag) {
        this.insureyearflag = insureyearflag;
    }

    public String getInsureyear() {
        return insureyear;
    }

    public void setInsureyear(String insureyear) {
        this.insureyear = insureyear;
    }

}
