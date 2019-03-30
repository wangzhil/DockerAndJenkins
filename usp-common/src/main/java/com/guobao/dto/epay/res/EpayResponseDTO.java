package com.guobao.dto.epay.res;

/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 上午10:02:48
 * @version V1.0
 */
public class EpayResponseDTO {
	
	/** 请求错误码(0为成功 其他为失败) 非空 */
	private String errCode;
	/** 请求错误描述 非空 */
	private String errMsg;
	/** 订单信息 非空 */
	private EpayRespOrder order;
	
	
	public String getErrCode() {
		return errCode;
	}
	public void setErrCode(String errCode) {
		this.errCode = errCode;
	}
	public String getErrMsg() {
		return errMsg;
	}
	public void setErrMsg(String errMsg) {
		this.errMsg = errMsg;
	}
	public EpayRespOrder getOrder() {
		return order;
	}
	public void setOrder(EpayRespOrder order) {
		this.order = order;
	}
	@Override
	public String toString() {
		return "EpayResponseDTO [errCode=" + errCode + ", errMsg=" + errMsg + ", order=" + order + "]";
	}

	
	
	
	
}



























