package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class QryResContentData {

	private String CustomerNo;

	private String PrtNo;

	@JSONField(name = "PrtNo")
	public String getPrtNo() {
		return PrtNo;
	}

	public void setPrtNo(String prtNo) {
		PrtNo = prtNo;
	}

	@JSONField(name = "CustomerNo")
	public String getCustomerNo() {
		return CustomerNo;
	}

	public void setCustomerNo(String CustomerNo) {
		this.CustomerNo = CustomerNo;
	}
}
