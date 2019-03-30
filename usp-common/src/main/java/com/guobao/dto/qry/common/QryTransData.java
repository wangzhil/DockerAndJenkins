package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class QryTransData {

	private HeadData HeadData;

	@JSONField(name = "HeadData")
	public HeadData getHeadData() {
		return HeadData;
	}

	public void setHeadData(HeadData headData) {
		HeadData = headData;
	}

}
