package com.guobao.dto.epay.req;

import java.util.List;

/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 上午10:02:48
 * @version V1.0
 */
public class EpayRequestDTO {
	
	/** 订单信息 */
	private EpayReqOrder order;
	/** 支付账户信息 */
	private EpayReqAccount account;
	/** 扩展字段列表 */
	private List<EpayReqExtension> extension;
	
	public EpayReqOrder getOrder() {
		return order;
	}
	public void setOrder(EpayReqOrder order) {
		this.order = order;
	}
	public EpayReqAccount getAccount() {
		return account;
	}
	public void setAccount(EpayReqAccount account) {
		this.account = account;
	}
	public List<EpayReqExtension> getExtension() {
		return extension;
	}
	public void setExtension(List<EpayReqExtension> extension) {
		this.extension = extension;
	}
	@Override
	public String toString() {
		return "EpayRequestDTO [order=" + order + ", account=" + account + ", extension=" + extension + "]";
	}
	
	
}
