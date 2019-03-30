package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class QryReq {

	private QryReqTransData TransData;

	@JSONField(name = "TransData")
	public QryReqTransData getTransData() {
		return TransData;
	}

	public void setTransData(QryReqTransData transData) {
		TransData = transData;
	}

}
