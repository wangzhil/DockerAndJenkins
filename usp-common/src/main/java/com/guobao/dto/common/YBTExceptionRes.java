package com.guobao.dto.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【银保通异常返回信息】
 * 
 * @author gbifp
 * @date 2018年3月25日 下午3:38:23
 * @version V1.0
 */
public class YBTExceptionRes {

	private TransData TransData;

	@JSONField(name = "TransData")
	public TransData getTransData() {
		return TransData;
	}

	public void setTransData(TransData transData) {
		TransData = transData;
	}

}
