package com.guobao.dto.common;

import com.alibaba.fastjson.annotation.JSONField;

public class InputData {

	private String EdorAcceptNo;

	@JSONField(name = "EdorAcceptNo")
	public String getEdorAcceptNo() {
		return EdorAcceptNo;
	}

	public void setEdorAcceptNo(String edorAcceptNo) {
		EdorAcceptNo = edorAcceptNo;
	}

}
