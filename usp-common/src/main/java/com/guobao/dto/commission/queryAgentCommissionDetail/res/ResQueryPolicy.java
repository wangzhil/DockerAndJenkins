/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年7月19日
 * 修改历史 : 
 *     1. [2017年7月19日]创建文件 by guobao
 */
package com.guobao.dto.commission.queryAgentCommissionDetail.res;

import java.util.List;

public class ResQueryPolicy {

    private String contno;

    private String orderno;

    private String contplancode;

    private String contplanname;

    private String appntname;

    private String insuredname;

    private String mobile;

    private String payintv;

    private String payendyearflag;

    private String payendyear;

    private String insureyearflag;

    private String insureyear;

    private String prem;

    private String signdate;

    private String customgetpoldate;

    private String returnvisitflag;

    private String commission;

    private String businessstate;

    private String businessdate;

    private List<ResQueryPol> pollist;

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public String getContplancode() {
        return contplancode;
    }

    public void setContplancode(String contplancode) {
        this.contplancode = contplancode;
    }

    public String getContplanname() {
        return contplanname;
    }

    public void setContplanname(String contplanname) {
        this.contplanname = contplanname;
    }

    public String getAppntname() {
        return appntname;
    }

    public void setAppntname(String appntname) {
        this.appntname = appntname;
    }

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    public String getPayintv() {
        return payintv;
    }

    public void setPayintv(String payintv) {
        this.payintv = payintv;
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

    public String getPrem() {
        return prem;
    }

    public void setPrem(String prem) {
        this.prem = prem;
    }

    public String getSigndate() {
        return signdate;
    }

    public void setSigndate(String signdate) {
        this.signdate = signdate;
    }

    public String getCustomgetpoldate() {
        return customgetpoldate;
    }

    public void setCustomgetpoldate(String customgetpoldate) {
        this.customgetpoldate = customgetpoldate;
    }

    public String getReturnvisitflag() {
        return returnvisitflag;
    }

    public void setReturnvisitflag(String returnvisitflag) {
        this.returnvisitflag = returnvisitflag;
    }

    public String getCommission() {
        return commission;
    }

    public void setCommission(String commission) {
        this.commission = commission;
    }

    public List<ResQueryPol> getPollist() {
        return pollist;
    }

    public void setPollist(List<ResQueryPol> pollist) {
        this.pollist = pollist;
    }

    public String getBusinessstate() {
        return businessstate;
    }

    public void setBusinessstate(String businessstate) {
        this.businessstate = businessstate;
    }

    public String getBusinessdate() {
        return businessdate;
    }

    public void setBusinessdate(String businessdate) {
        this.businessdate = businessdate;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getOrderno() {
        return orderno;
    }

    public void setOrderno(String orderno) {
        this.orderno = orderno;
    }

}
