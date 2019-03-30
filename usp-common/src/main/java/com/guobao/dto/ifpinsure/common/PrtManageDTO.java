package com.guobao.dto.ifpinsure.common;

public class PrtManageDTO {
	private String PrtNo;// 投保单号

	private String IssueCode;// 问题件编码

	private String IssueType;// 问题件类型

	private String IssueState;// 问题件状态

	public String getPrtNo() {
		return PrtNo;
	}

	public void setPrtNo(String prtNo) {
		PrtNo = prtNo;
	}

	public String getIssueCode() {
		return IssueCode;
	}

	public void setIssueCode(String issueCode) {
		IssueCode = issueCode;
	}

	public String getIssueType() {
		return IssueType;
	}

	public void setIssueType(String issueType) {
		IssueType = issueType;
	}

	public String getIssueState() {
		return IssueState;
	}

	public void setIssueState(String issueState) {
		IssueState = issueState;
	}

}
