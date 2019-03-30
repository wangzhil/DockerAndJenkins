package com.guobao.dto.common.lis;

import java.util.ArrayList;
import java.util.List;

public class TransInfo {

	private String prtNo;// 投保单号

	private String uwFlag;// 核保结果
	
	private String Amnt;// 总保额
	
	private String PayMoney;// 期交保费
	
	private String desc;// 描述
	
	private String OnlyCalFlag;//是否是试算
	
	private String appFlag;//签单结果
	
	private String contNo;//合同号
	
	private String callDate;//在线回访日期

	private List<LisUnPassRuleInfo> unPassRuleInfos = new ArrayList<LisUnPassRuleInfo>();// 规则信息
	
	private List<BillInfo> BillInfo = new ArrayList<BillInfo>();

	public List<BillInfo> getBillInfo() {
		return BillInfo;
	}

	public void setBillInfo(List<BillInfo> billInfo) {
		BillInfo = billInfo;
	}

	public String getOnlyCalFlag() {
		return OnlyCalFlag;
	}

	public void setOnlyCalFlag(String onlyCalFlag) {
		OnlyCalFlag = onlyCalFlag;
	}
	
	public String getDesc() {
		return desc;
	}

	public void setDesc(String desc) {
		this.desc = desc;
	}

	public String getUwFlag() {
		return uwFlag;
	}

	public void setUwFlag(String uwFlag) {
		this.uwFlag = uwFlag;
	}

	public String getAmnt() {
		return Amnt;
	}

	public void setAmnt(String amnt) {
		Amnt = amnt;
	}

	public String getPayMoney() {
		return PayMoney;
	}

	public void setPayMoney(String payMoney) {
		PayMoney = payMoney;
	}

	public List<LisUnPassRuleInfo> getUnPassRuleInfos() {
		return unPassRuleInfos;
	}

	public void setUnPassRuleInfos(List<LisUnPassRuleInfo> unPassRuleInfos) {
		this.unPassRuleInfos = unPassRuleInfos;
	}

	public String getPrtNo() {
		return prtNo;
	}

	public void setPrtNo(String prtNo) {
		this.prtNo = prtNo;
	}

	public String getAppFlag() {
		return appFlag;
	}

	public void setAppFlag(String appFlag) {
		this.appFlag = appFlag;
	}

	public String getContNo() {
		return contNo;
	}

	public void setContNo(String contNo) {
		this.contNo = contNo;
	}

	public String getCallDate() {
		return callDate;
	}

	public void setCallDate(String callDate) {
		this.callDate = callDate;
	}

}
