package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class QryRes {

	private QryResTransData TransData;

	@JSONField(name = "TransData")
	public QryResTransData getTransData() {
		return TransData;
	}

	public void setTransData(QryResTransData transData) {
		TransData = transData;
	}

}
