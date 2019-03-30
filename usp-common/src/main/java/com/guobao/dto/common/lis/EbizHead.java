package com.guobao.dto.common.lis;

/**
 * 
 * 【核心请求报文】
 * 
 * @author gbifp
 * @date 2018年4月1日 下午4:39:50
 * @version V1.0
 */
public class EbizHead {

	// 渠道编码
	private String channelCode;

	// 序列号
	private String serialNo;

	// 交易编码
	private String transCode;

	// 交易时间
	private String transTime;

	// 返回编码
	private String resultCode;

	// 返回内容
	private String resultDesc;

	public String getResultCode() {
		return resultCode;
	}

	public void setResultCode(String resultCode) {
		this.resultCode = resultCode;
	}

	public String getResultDesc() {
		return resultDesc;
	}

	public void setResultDesc(String resultDesc) {
		this.resultDesc = resultDesc;
	}

	public String getChannelCode() {
		return channelCode;
	}

	public void setChannelCode(String channelCode) {
		this.channelCode = channelCode;
	}

	public String getSerialNo() {
		return serialNo;
	}

	public void setSerialNo(String serialNo) {
		this.serialNo = serialNo;
	}

	public String getTransCode() {
		return transCode;
	}

	public void setTransCode(String transCode) {
		this.transCode = transCode;
	}

	public String getTransTime() {
		return transTime;
	}

	public void setTransTime(String transTime) {
		this.transTime = transTime;
	}

}
