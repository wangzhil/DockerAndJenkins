package com.guobao.dto.common.lis;

/**
 * 
 * 【核心接口返回报文体】
 * 
 * @author gbifp
 * @date 2018年4月1日 下午4:43:23
 * @version V1.0
 */
public class EbizRes {

	private EbizHead ebizHead;

	private TransInfo transInfo;

	public TransInfo getTransInfo() {
		return transInfo;
	}

	public void setTransInfo(TransInfo transInfo) {
		this.transInfo = transInfo;
	}

	public EbizHead getEbizHead() {
		return ebizHead;
	}

	public void setEbizHead(EbizHead ebizHead) {
		this.ebizHead = ebizHead;
	}

}
