package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【统一接口异常返回报文】
 * 
 * @author gbifp
 * @date 2018年3月25日 下午3:43:17
 * @version V1.0
 */
public class ExceptionRes {

	private QryTransData TransData;

	@JSONField(name = "TransData")
	public QryTransData getTransData() {
		return TransData;
	}

	public void setTransData(QryTransData transData) {
		TransData = transData;
	}

}
