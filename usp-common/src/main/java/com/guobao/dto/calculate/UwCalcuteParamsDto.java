/**
 * @Copyright ®2018 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2018年3月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

import java.math.BigDecimal;
import java.util.Date;

public class UwCalcuteParamsDto {
	
	
	/**
     * 团单号
     */
    private String grpcontno;
	
	/**
     * 保单号
     */
    private String contno;
    
    /**
     * 投保单号
     */
    private String prtno;
    
    /**
     * 险种号
     */
    private String polno;
    
    /**
     * 主险种号
     */
    private String mainpolno;
    
    /**
     * 投保人编号
     */
    private String insuredno;
    
    /**
     * 投保人姓名
     */
    private String insuredname;
    
    /**
     * 投保人编号
     */
    private String appntno;
    
    /**
     * 投保人姓名
     */
    private String appntname;
    
    /**
     * 保单管理机构
     */
    private String managecom;   
    
    /**
     * 保单管理机构
     */
    private String  polapplydate;   
	
	/**
     * 终交年龄年期
     */
    private Integer payendyear;
    
   /**
    * 投保年龄
    */
    private Integer appage;
    
    /**
     * 领取年期
     */
    private Integer getyear;
    
    /**
     * 保额
     */
    private BigDecimal amnt;
    
    /**
     * 险种代码
     */
    private String riskcode;
    
    /**
     * 性别
     */
    private String sex;

    /**
     * 份数
     */
    private Integer mult;

    /**
     * 计算类型
     */
    private String algorithmtype;

    /**
     * 出生日期
     */
    private String appntbirthday;

    /**
     * 被保人职业（工种）
     */
    private String job;

    /**
     * 缴费间隔
     */
    private String payintv;

    /**
     * 保险年龄年期
     */
    private Integer insuyear;

    /**
     * 保险年龄年期标志
     */
    private String insuyearflag;

    /**
     * 保费
     */
    private BigDecimal prem;    

    /**
     * 终交年龄年期标志
     */
    private String payendyearflag;
    
    /**
     * 现金价值
     */
    private BigDecimal cashvalue;
    
    /**
    *保险年期
    */
    private Integer duration;
    
    /**
     *  险种类型
     * @return
     */
    private String risktype3;
    
    /**
     * 险种分类4
     * @return
     */
    private String risktype4;
    /**
     * 险种分类8
     */
    private String risktype8;
    /**
     * 被保人出生日期
     */
    private String insuredbirthday;
    
    
    private String payenddate;
	/**
	 * 投保人职业类型
	 */
    private String appntOccupationtype;
    /**
     * 被保人职业类型
     */
    private String insuredOccupationtype;
    
    /** 客户累计人身险风险保额 */
	private BigDecimal riskamount ;
    /**
     * 累计寿险风险保额
     */
    private BigDecimal riskamount1;
    /**
     * 累计重大疾病风险保额
     */
    private BigDecimal riskamount2;
    /**
     * 累计医疗险保额
     */
    private BigDecimal riskamount3;
    /**
     * 累计意外险风险保额
     */
    private BigDecimal riskamount4;
    /**
     * 累计残疾风险保额
     */
    private BigDecimal riskamount5;
    /**
     * 累计意外医疗保额
     */
    private BigDecimal riskamount6;
    /**
     * 累计医疗津贴保额
     */
    private BigDecimal riskamount7;
    /**
     * 累计自驾车意外风险保额
     */
    private BigDecimal riskamount8;
    /**
     * 累计公共交通意外风险保额
     */
    private BigDecimal riskamount9;
    /**
     * 累计航空意外风险保额
     */
    private BigDecimal riskamount10;
    /**
     * 累计未成年人风险保额(0-17岁)
     */
    private BigDecimal riskamount11;
   
    /**累计身故风险保额*/
    private BigDecimal unriskamount;
    
    /**
     * 添加fieldName用于后面传递值
     * @return
     */
    private String fieldname;
    /** 被保人职业类型 */
    private String occupation;
    /** 健康告知栏7-11条不全为“否”   */
    private String nonum;
    /** 投保人薪资 */
    private BigDecimal appntincome;
    /** 投保人薪资 */
    private BigDecimal insuredincome;
    /** 身故受益人与被保人关系,排除法定受益人 */
    private String bnfisinsured1;
    /** 身故受益人与被保人相同,排除法定受益人 */
    private String bnfisinsured;
    /** 与投保人关系 */
    private String relationtoappnt;
	/** 被保人体重 */
    private BigDecimal insuredweight;
    /** 被保人身高 */
    private BigDecimal insuredheight;
    /** 被保人告知 */
    private String insuredtb14;
    private String insuredtb15b;
    /** 业务员告知 */
    private String agentb3;
    private String agentb4;
    private String agentb5;
    /** 代理人和被保人之间的关系 */
    private  String agentrelationtoinsured;
    /** 每天吸烟数量 */
    private Double insuredsmokenum;
    /** 吸烟年数 */
	private Double insuredsmokeyears;
    /** 每天喝酒量 */
	private Double insureddrinkwinenum;
    /** 喝酒年份 */
	private Double insureddrinkwineyears;
    /** 被保人BMI值 */
    private BigDecimal insuredbmi;
	/** 投保人电话 */
    private String appntmobile;
    /** 被保人电话 */
    private String insuredmobile;
    /** 代理人电话 */
    private String agentmobile;
    /** 投保人 */
	private Integer appntage;
    /** 
     * 00030624
     */
	private String nsedortype;
	private String healthgrade;
	  /**
     * 投保人证件号码
     */
    private String appntidno;
    /**
     * 投保人证件类型
     */
    private String appntidtype;
    /**
     * 被保人证件号码
     */
    private String insuredidno;
    /**
     * 被保人证件类型
     */
    private String insuredidtype;
    /**
     * 承保标志
     */
    private String appflag;
    /**
     * 销售渠道
     */
	private String salechnl;
	
	private String appntemail;
	
	private String insuredemail;

	/**
	 * 豁免险标记
	 */
	private String exemptflag;
	/**
	 * 是否是投保人豁免险标识
	 */
	private String appntflag;
	/**
	 * 是否在黑名单标识
	 */
	private String blackflag;
	/**
	 * 投保人性别
	 */
	private String appntsex;
	/**
	 * 投保人累计年交保费
	 */
	private double yearprem;

	/**
	 * 险种类型标识
	 */
	private String riskflag;

	/**
	 * 险种分类7
	 */
	private String risktype7;

	/**
	 * 险种类别
	 */
	private String riskperiod;

	/**
	 * 计算方法
	 */
	private String calmode;
	
	public double getYearprem() {
		return yearprem;
	}

	public void setYearprem(double yearprem) {
		this.yearprem = yearprem;
	}
	
	public String getAppntsex() {
		return appntsex;
	}

	public void setAppntsex(String appntsex) {
		this.appntsex = appntsex;
	}

	public String getExemptflag() {
		return exemptflag;
	}

	public void setExemptflag(String exemptflag) {
		this.exemptflag = exemptflag;
	}

	public String getBlackflag() {
		return blackflag;
	}

	public void setBlackflag(String blackflag) {
		this.blackflag = blackflag;
	}


	public String getAppntflag() {
		return appntflag;
	}

	public void setAppntflag(String appntflag) {
		this.appntflag = appntflag;
	}

	public String getInsuredemail() {
		return insuredemail;
	}

	public void setInsuredemail(String insuredemail) {
		this.insuredemail = insuredemail;
	}

	public String getAppntemail() {
		return appntemail;
	}

	public void setAppntemail(String appntemail) {
		this.appntemail = appntemail;
	}

	public String getSalechnl() {
		return salechnl;
	}

	public void setSalechnl(String salechnl) {
		this.salechnl = salechnl;
	}

	public String getAppflag() {
		return appflag;
	}

	public void setAppflag(String appflag) {
		this.appflag = appflag;
	}

	public String getNsedortype() {
		return nsedortype;
	}

	public void setNsedortype(String nsedortype) {
		this.nsedortype = nsedortype;
	}

	public String getHealthgrade() {
		return healthgrade;
	}

	public void setHealthgrade(String healthgrade) {
		this.healthgrade = healthgrade;
	}

	public String getPayintv() {
		return payintv;
	}
	

	public void setPayintv(String payintv) {
		this.payintv = payintv;
	}

	public String getInsuredbirthday() {
		return insuredbirthday;
	}

	public void setInsuredbirthday(String insuredbirthday) {
		this.insuredbirthday = insuredbirthday;
	}

	public BigDecimal getRiskamount() {
		return riskamount;
	}

	public void setRiskamount(BigDecimal riskamount) {
		this.riskamount = riskamount;
	}

	public String getBnfisinsured() {
		return bnfisinsured;
	}

	public void setBnfisinsured(String bnfisinsured) {
		this.bnfisinsured = bnfisinsured;
	}

	public String getInsuredtb15b() {
		return insuredtb15b;
	}

	public void setInsuredtb15b(String insuredtb15b) {
		this.insuredtb15b = insuredtb15b;
	}

	public String getAgentb4() {
		return agentb4;
	}

	public void setAgentb4(String agentb4) {
		this.agentb4 = agentb4;
	}

	public String getAgentb5() {
		return agentb5;
	}

	public void setAgentb5(String agentb5) {
		this.agentb5 = agentb5;
	}

	public String getAppntOccupationtype() {
		return appntOccupationtype;
	}

	public void setAppntOccupationtype(String appntOccupationtype) {
		this.appntOccupationtype = appntOccupationtype;
	}

	public String getInsuredOccupationtype() {
		return insuredOccupationtype;
	}

	public void setInsuredOccupationtype(String insuredOccupationtype) {
		this.insuredOccupationtype = insuredOccupationtype;
	}

	public String getAppntmobile() {
		return appntmobile;
	}

	public void setAppntmobile(String appntmobile) {
		this.appntmobile = appntmobile;
	}

	public String getInsuredmobile() {
		return insuredmobile;
	}

	public void setInsuredmobile(String insuredmobile) {
		this.insuredmobile = insuredmobile;
	}

	public String getAgentmobile() {
		return agentmobile;
	}

	public void setAgentmobile(String agentmobile) {
		this.agentmobile = agentmobile;
	}

	public String getBnfisinsured1() {
		return bnfisinsured1;
	}

	public void setBnfisinsured1(String bnfisinsured1) {
		this.bnfisinsured1 = bnfisinsured1;
	}

	public Integer getAppntage() {
		return appntage;
	}

	public void setAppntage(Integer appntage) {
		this.appntage = appntage;
	}
	public Double getInsureddrinkwinenum() {
		return insureddrinkwinenum;
	}

	public void setInsureddrinkwinenum(Double insureddrinkwinenum) {
		this.insureddrinkwinenum = insureddrinkwinenum;
	}

	public Double getInsureddrinkwineyears() {
		return insureddrinkwineyears;
	}

	public void setInsureddrinkwineyears(Double insureddrinkwineyears) {
		this.insureddrinkwineyears = insureddrinkwineyears;
	}

	public BigDecimal getInsuredbmi() {
		return insuredbmi;
	}

	public void setInsuredbmi(BigDecimal insuredbmi) {
		this.insuredbmi = insuredbmi;
	}

	public Double getInsuredsmokenum() {
		return insuredsmokenum;
	}

	public void setInsuredsmokenum(Double insuredsmokenum) {
		this.insuredsmokenum = insuredsmokenum;
	}

	public Double getInsuredsmokeyears() {
		return insuredsmokeyears;
	}

	public void setInsuredsmokeyears(Double insuredsmokeyears) {
		this.insuredsmokeyears = insuredsmokeyears;
	}

	public String getAgentrelationtoinsured() {
		return agentrelationtoinsured;
	}

	public void setAgentrelationtoinsured(String agentrelationtoinsured) {
		this.agentrelationtoinsured = agentrelationtoinsured;
	}

	public String getAgentb3() {
		return agentb3;
	}

	public void setAgentb3(String agentb3) {
		this.agentb3 = agentb3;
	}

	public String getInsuredtb14() {
		return insuredtb14;
	}

	public void setInsuredtb14(String insuredtb14) {
		this.insuredtb14 = insuredtb14;
	}

	public BigDecimal getInsuredheight() {
		return insuredheight;
	}

	public void setInsuredheight(BigDecimal insuredheight) {
		this.insuredheight = insuredheight;
	}

	public BigDecimal getInsuredweight() {
		return insuredweight;
	}

	public void setInsuredweight(BigDecimal insuredweight) {
		this.insuredweight = insuredweight;
	}

	public String getRelationtoappnt() {
		return relationtoappnt;
	}

	public void setRelationtoappnt(String relationtoappnt) {
		this.relationtoappnt = relationtoappnt;
	}

	public BigDecimal getInsuredincome() {
		return insuredincome;
	}

	public void setInsuredincome(BigDecimal insuredincome) {
		this.insuredincome = insuredincome;
	}

	public BigDecimal getAppntincome() {
		return appntincome;
	}

	public void setAppntincome(BigDecimal appntincome) {
		this.appntincome = appntincome;
	}

	public String getNonum() {
		return nonum;
	}

	public void setNonum(String nonum) {
		this.nonum = nonum;
	}

	public BigDecimal getUnriskamount() {
		return unriskamount;
	}

	public void setUnriskamount(BigDecimal unriskamount) {
		this.unriskamount = unriskamount;
	}

	public String getOccupation() {
		return occupation;
	}

	public void setOccupation(String occupation) {
		this.occupation = occupation;
	}
	public String getPayenddate() {
		return payenddate;
	}

	public void setPayenddate(String payenddate) {
		this.payenddate = payenddate;
	}

	public String getRisktype3() {
		return risktype3;
	}

	public void setRisktype3(String risktype3) {
		this.risktype3 = risktype3;
	}

	public String getRisktype4() {
		return risktype4;
	}

	public void setRisktype4(String risktype4) {
		this.risktype4 = risktype4;
	}

	public String getGrpcontno() {
		return grpcontno;
	}

	public void setGrpcontno(String grpcontno) {
		this.grpcontno = grpcontno;
	}

	public String getContno() {
		return contno;
	}

	public void setContno(String contno) {
		this.contno = contno;
	}

	public String getPrtno() {
		return prtno;
	}

	public void setPrtno(String prtno) {
		this.prtno = prtno;
	}

	public String getPolno() {
		return polno;
	}

	public void setPolno(String polno) {
		this.polno = polno;
	}

	public String getMainpolno() {
		return mainpolno;
	}

	public void setMainpolno(String mainpolno) {
		this.mainpolno = mainpolno;
	}

	public String getInsuredno() {
		return insuredno;
	}

	public void setInsuredno(String insuredno) {
		this.insuredno = insuredno;
	}

	public String getInsuredname() {
		return insuredname;
	}

	public void setInsuredname(String insuredname) {
		this.insuredname = insuredname;
	}

	public String getAppntno() {
		return appntno;
	}

	public void setAppntno(String appntno) {
		this.appntno = appntno;
	}

	public String getAppntname() {
		return appntname;
	}

	public void setAppntname(String appntname) {
		this.appntname = appntname;
	}

	public String getManagecom() {
		return managecom;
	}

	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}

	public String getPolapplydate() {
		return polapplydate;
	}

	public void setPolapplydate(String polapplydate) {
		this.polapplydate = polapplydate;
	}

	public Integer getPayendyear() {
		return payendyear;
	}

	public void setPayendyear(Integer payendyear) {
		this.payendyear = payendyear;
	}

	public Integer getAppage() {
		return appage;
	}

	public void setAppage(Integer appage) {
		this.appage = appage;
	}

	public Integer getGetyear() {
		return getyear;
	}

	public void setGetyear(Integer getyear) {
		this.getyear = getyear;
	}

	public BigDecimal getAmnt() {
		return amnt;
	}

	public void setAmnt(BigDecimal amnt) {
		this.amnt = amnt;
	}

	public String getRiskcode() {
		return riskcode;
	}

	public void setRiskcode(String riskcode) {
		this.riskcode = riskcode;
	}

	public String getSex() {
		return sex;
	}

	public void setSex(String sex) {
		this.sex = sex;
	}

	public Integer getMult() {
		return mult;
	}

	public void setMult(Integer mult) {
		this.mult = mult;
	}

	public String getAlgorithmtype() {
		return algorithmtype;
	}

	public void setAlgorithmtype(String algorithmtype) {
		this.algorithmtype = algorithmtype;
	}

	public String getAppntbirthday() {
		return appntbirthday;
	}

	public void setAppntbirthday(String appntbirthday) {
		this.appntbirthday = appntbirthday;
	}

	public String getJob() {
		return job;
	}

	public void setJob(String job) {
		this.job = job;
	}

	public Integer getInsuyear() {
		return insuyear;
	}

	public void setInsuyear(Integer insuyear) {
		this.insuyear = insuyear;
	}

	public String getInsuyearflag() {
		return insuyearflag;
	}

	public void setInsuyearflag(String insuyearflag) {
		this.insuyearflag = insuyearflag;
	}

	public BigDecimal getPrem() {
		return prem;
	}

	public void setPrem(BigDecimal prem) {
		this.prem = prem;
	}

	public String getPayendyearflag() {
		return payendyearflag;
	}

	public void setPayendyearflag(String payendyearflag) {
		this.payendyearflag = payendyearflag;
	}

	public BigDecimal getCashvalue() {
		return cashvalue;
	}

	public void setCashvalue(BigDecimal cashvalue) {
		this.cashvalue = cashvalue;
	}

	public Integer getDuration() {
		return duration;
	}

	public void setDuration(Integer duration) {
		this.duration = duration;
	}

	public BigDecimal getRiskamount1() {
		return riskamount1;
	}

	public void setRiskamount1(BigDecimal riskamount1) {
		this.riskamount1 = riskamount1;
	}

	public BigDecimal getRiskamount2() {
		return riskamount2;
	}

	public void setRiskamount2(BigDecimal riskamount2) {
		this.riskamount2 = riskamount2;
	}

	public BigDecimal getRiskamount3() {
		return riskamount3;
	}

	public void setRiskamount3(BigDecimal riskamount3) {
		this.riskamount3 = riskamount3;
	}

	public BigDecimal getRiskamount4() {
		return riskamount4;
	}

	public void setRiskamount4(BigDecimal riskamount4) {
		this.riskamount4 = riskamount4;
	}

	public BigDecimal getRiskamount5() {
		return riskamount5;
	}

	public void setRiskamount5(BigDecimal riskamount5) {
		this.riskamount5 = riskamount5;
	}

	public BigDecimal getRiskamount6() {
		return riskamount6;
	}

	public void setRiskamount6(BigDecimal riskamount6) {
		this.riskamount6 = riskamount6;
	}

	public BigDecimal getRiskamount7() {
		return riskamount7;
	}

	public void setRiskamount7(BigDecimal riskamount7) {
		this.riskamount7 = riskamount7;
	}

	public BigDecimal getRiskamount8() {
		return riskamount8;
	}

	public void setRiskamount8(BigDecimal riskamount8) {
		this.riskamount8 = riskamount8;
	}

	public BigDecimal getRiskamount9() {
		return riskamount9;
	}

	public void setRiskamount9(BigDecimal riskamount9) {
		this.riskamount9 = riskamount9;
	}

	public BigDecimal getRiskamount10() {
		return riskamount10;
	}

	public void setRiskamount10(BigDecimal riskamount10) {
		this.riskamount10 = riskamount10;
	}

	public BigDecimal getRiskamount11() {
		return riskamount11;
	}

	public void setRiskamount11(BigDecimal riskamount11) {
		this.riskamount11 = riskamount11;
	}

	public String getFieldname() {
		return fieldname;
	}

	public void setFieldname(String fieldname) {
		this.fieldname = fieldname;
	}
	

	public String getAppntidno() {
		return appntidno;
	}

	public void setAppntidno(String appntidno) {
		this.appntidno = appntidno;
	}

	public String getAppntidtype() {
		return appntidtype;
	}

	public void setAppntidtype(String appntidtype) {
		this.appntidtype = appntidtype;
	}

	public String getInsuredidno() {
		return insuredidno;
	}

	public void setInsuredidno(String insuredidno) {
		this.insuredidno = insuredidno;
	}

	public String getInsuredidtype() {
		return insuredidtype;
	}

	public void setInsuredidtype(String insuredidtype) {
		this.insuredidtype = insuredidtype;
	}

	public String getRisktype8() {
		return risktype8;
	}

	public void setRisktype8(String risktype8) {
		this.risktype8 = risktype8;
	}

	public String getRiskflag() {
		return riskflag;
	}

	public void setRiskflag(String riskflag) {
		this.riskflag = riskflag;
	}

	public String getRisktype7() {
		return risktype7;
	}

	public void setRisktype7(String risktype7) {
		this.risktype7 = risktype7;
	}

	public String getRiskperiod() {
		return riskperiod;
	}

	public void setRiskperiod(String riskperiod) {
		this.riskperiod = riskperiod;
	}

	public String getCalmode() {
		return calmode;
	}

	public void setCalmode(String calmode) {
		this.calmode = calmode;
	}
}
