package com.guobao.dto.lis;

import java.util.Date;

public class LcAgent_LisResultMap {
    
	private String AgentCode;
	
	private Date PayDate;
	
	private String OtherNo;
	
	private String OtherNoType;
	
	private String SumduePayMoney;

	public String getAgentCode() {
		return AgentCode;
	}

	public void setAgentCode(String agentCode) {
		AgentCode = agentCode;
	}

	public Date getPayDate() {
		return PayDate;
	}

	public void setPayDate(Date payDate) {
		PayDate = payDate;
	}

	public String getOtherNo() {
		return OtherNo;
	}

	public void setOtherNo(String otherNo) {
		OtherNo = otherNo;
	}

	public String getOtherNoType() {
		return OtherNoType;
	}

	public void setOtherNoType(String otherNoType) {
		OtherNoType = otherNoType;
	}

	public String getSumduePayMoney() {
		return SumduePayMoney;
	}

	public void setSumduePayMoney(String sumduePayMoney) {
		SumduePayMoney = sumduePayMoney;
	}
	
	
}
