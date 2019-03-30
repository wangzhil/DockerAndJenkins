package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.guobao.dto.qry.common.QryTransData;

/**
 * 
 * 【国宝各接口统一规范】
 * 
 * @author gbifp
 * @date 2018年3月15日 下午8:17:51
 * @version V1.0
 */
public class QryReqTransData extends QryTransData {

	private QryReqContentData ContentData;

	@JSONField(name = "ContentData")
	public QryReqContentData getContentData() {
		return ContentData;
	}

	public void setContentData(QryReqContentData contentData) {
		ContentData = contentData;
	}

}
