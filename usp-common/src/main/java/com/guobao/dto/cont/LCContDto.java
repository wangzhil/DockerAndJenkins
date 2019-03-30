/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.cont;

import java.math.BigDecimal;

/**
 * 保单信息DTO
 * 
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
public class LCContDto {
	/** 订单号 */
	private String orderno;
	/** 保单号 */
	private String contno;
	/** 投保单号 */
	private String prtno;
	/** 客户经理 */
	private String agentcode;
	/** 客户经理归属的机构 */
	private String managecom;
	/** 投保人编号 */
	private String appntno;
	/** 客户地址号码 */
	private String addressno;
	/** 缴费方式，首期缴费 */
	private String paymode;
	/** 银行编码 */
	private String bankcode;
	/** 银行账户 */
	private String bankaccno;
	/** 银行账户名 */
	private String bankaccname;
	/** 支付状态 */
	private String paystatus;
	/** 支付时间 */
	private String paydate;
	/** 支付结果或失败原因 */
	private String paymessage;
	/** 保单申请日 */
	private String polapplydate;
	/** 核保状态 */
	private String uwflag;
	/** 核保日期 */
	private String uwdate;
	/** 保单状态 */
	private String contstate;
	/** 保单生效日 */
	private String cvalidate;
	/** 保单签单日 */
	private String signdate;
	/** 保单回执日 */
	private String receiptdate;
	/** 总保额 */
	private BigDecimal amnt;
	/** 总保费 */
	private BigDecimal prem;
	/** 户主证件号 */
	private String holderidnumber;
	/** 户主证件类型 */
	private String holderidtype;
	/** 户主手机号 */
	private String holdermobile;
	/** 银行卡类型 */
	private String banktype;
	//////////////////// 新增字段，满足承保推送核心接口使用
	/** 是否制定生效日,默认N */
	private String specifyvalidate;
	/** 续期付费方式 */
	private String repaymode;
	/** 渠道20-兼职代理人 */
	private String salechnl;
	/** 出单方式 21-客户经理APP投保 */
	private String contorigin;
	/** 是否存在其他影像 */
	private String isexistsotherimg;
	//// 新增字段
	/** 溢交 1 退费 2 抵交续期保费 。默认 退费 */
	private String outpayflag;
	/** 银行名称 */
	private String bankname;
	/** 网点地址 */
	private String agentaddress;
	/** 是否自动发送纸质合同 */
	private String ispapercont;

	//// 传规则引擎需要
	/** 有无投保提示书 */
	private String haveinsuretips;
	/** 被保人最小允许投保年龄单位 */
	private String insminapplyageflag;
	/** 被保人最小允许投保年龄 */
	private String insminapplyage;
	/** 被保人最大允许投保年龄 */
	private String insmaxapplyage;
	/** 保单计划编码 */
	private String contplancode;
	/** 保单计划名称 */
	private String contplanname;

	private String issign;
	/** 个团标记 */
	private String contsource;
	/** 是否申请续保 */
	private String rnewflag;

	public String getPaystatus() {
		return paystatus;
	}

	public void setPaystatus(String paystatus) {
		this.paystatus = paystatus;
	}

	public String getPaydate() {
		return paydate;
	}

	public void setPaydate(String paydate) {
		this.paydate = paydate;
	}

	public String getPaymessage() {
		return paymessage;
	}

	public void setPaymessage(String paymessage) {
		this.paymessage = paymessage;
	}

	public String getRepaymode() {
		return repaymode;
	}

	public void setRepaymode(String repaymode) {
		this.repaymode = repaymode;
	}

	public String getBankname() {
		return bankname;
	}

	public void setBankname(String bankname) {
		this.bankname = bankname;
	}

	public String getOrderno() {
		return orderno;
	}

	public void setOrderno(String orderno) {
		this.orderno = orderno;
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

	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

	public String getManagecom() {
		return managecom;
	}

	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}

	public String getAppntno() {
		return appntno;
	}

	public void setAppntno(String appntno) {
		this.appntno = appntno;
	}

	public String getAddressno() {
		return addressno;
	}

	public void setAddressno(String addressno) {
		this.addressno = addressno;
	}

	public String getPaymode() {
		return paymode;
	}

	public void setPaymode(String paymode) {
		this.paymode = paymode;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public String getBankaccname() {
		return bankaccname;
	}

	public void setBankaccname(String bankaccname) {
		this.bankaccname = bankaccname;
	}

	public String getPolapplydate() {
		return polapplydate;
	}

	public void setPolapplydate(String polapplydate) {
		this.polapplydate = polapplydate;
	}

	public String getUwflag() {
		return uwflag;
	}

	public void setUwflag(String uwflag) {
		this.uwflag = uwflag;
	}

	public String getContstate() {
		return contstate;
	}

	public void setContstate(String contstate) {
		this.contstate = contstate;
	}

	public BigDecimal getAmnt() {
		return amnt;
	}

	public void setAmnt(BigDecimal amnt) {
		this.amnt = amnt;
	}

	public BigDecimal getPrem() {
		return prem;
	}

	public void setPrem(BigDecimal prem) {
		this.prem = prem;
	}

	public String getHolderidnumber() {
		return holderidnumber;
	}

	public void setHolderidnumber(String holderidnumber) {
		this.holderidnumber = holderidnumber;
	}

	public String getHolderidtype() {
		return holderidtype;
	}

	public void setHolderidtype(String holderidtype) {
		this.holderidtype = holderidtype;
	}

	public String getHoldermobile() {
		return holdermobile;
	}

	public void setHoldermobile(String holdermobile) {
		this.holdermobile = holdermobile;
	}

	public String getBanktype() {
		return banktype;
	}

	public void setBanktype(String banktype) {
		this.banktype = banktype;
	}

	public String getSpecifyvalidate() {
		return specifyvalidate;
	}

	public void setSpecifyvalidate(String specifyvalidate) {
		this.specifyvalidate = specifyvalidate;
	}

	public String getSalechnl() {
		return salechnl;
	}

	public void setSalechnl(String salechnl) {
		this.salechnl = salechnl;
	}

	public String getContorigin() {
		return contorigin;
	}

	public void setContorigin(String contorigin) {
		this.contorigin = contorigin;
	}

	public String getOutpayflag() {
		return outpayflag;
	}

	public void setOutpayflag(String outpayflag) {
		this.outpayflag = outpayflag;
	}

	public String getAgentaddress() {
		return agentaddress;
	}

	public void setAgentaddress(String agentaddress) {
		this.agentaddress = agentaddress;
	}

	public String getIspapercont() {
		return ispapercont;
	}

	public void setIspapercont(String ispapercont) {
		this.ispapercont = ispapercont;
	}

	public String getHaveinsuretips() {
		return haveinsuretips;
	}

	public void setHaveinsuretips(String haveinsuretips) {
		this.haveinsuretips = haveinsuretips;
	}

	public String getInsminapplyageflag() {
		return insminapplyageflag;
	}

	public void setInsminapplyageflag(String insminapplyageflag) {
		this.insminapplyageflag = insminapplyageflag;
	}

	public String getInsminapplyage() {
		return insminapplyage;
	}

	public void setInsminapplyage(String insminapplyage) {
		this.insminapplyage = insminapplyage;
	}

	public String getInsmaxapplyage() {
		return insmaxapplyage;
	}

	public void setInsmaxapplyage(String insmaxapplyage) {
		this.insmaxapplyage = insmaxapplyage;
	}

	public String getCvalidate() {
		return cvalidate;
	}

	public void setCvalidate(String cvalidate) {
		this.cvalidate = cvalidate;
	}

	public String getSigndate() {
		return signdate;
	}

	public void setSigndate(String signdate) {
		this.signdate = signdate;
	}

	public String getReceiptdate() {
		return receiptdate;
	}

	public void setReceiptdate(String receiptdate) {
		this.receiptdate = receiptdate;
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

	public String getIssign() {
		return issign;
	}

	public void setIssign(String issign) {
		this.issign = issign;
	}

	public String getIsexistsotherimg() {
		return isexistsotherimg;
	}

	public void setIsexistsotherimg(String isexistsotherimg) {
		this.isexistsotherimg = isexistsotherimg;
	}

	public String getUwdate() {
		return uwdate;
	}

	public void setUwdate(String uwdate) {
		this.uwdate = uwdate;
	}

	public String getContsource() {
		return contsource;
	}

	public void setContsource(String contsource) {
		this.contsource = contsource;
	}

	public String getRnewflag() {
		return rnewflag;
	}

	public void setRnewflag(String rnewflag) {
		this.rnewflag = rnewflag;
	}

}
