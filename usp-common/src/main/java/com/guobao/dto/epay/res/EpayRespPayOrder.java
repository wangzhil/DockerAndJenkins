package com.guobao.dto.epay.res;
/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 下午2:13:51
 * @version V1.0
 */
public class EpayRespPayOrder {
	/** 支付订单号 非空 */
	private String payOrderId;
	/** 支付状态（100-处理中，200-支付成功，500支付失败） 非空 */
	private String status;
	/** 支付金额（元） 非空 */
	private String amount;
	/** 渠道返回状态 非空 */
	private String channelstatus;
	/** 渠道状态描述 非空 */
	private String channelmsg;
	/** 支付时间（yyyy-mm-dd hh:mm:ss） 非空 */
	private String paymentTime;
	
	public String getPayOrderId() {
		return payOrderId;
	}
	public void setPayOrderId(String payOrderId) {
		this.payOrderId = payOrderId;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getChannelstatus() {
		return channelstatus;
	}
	public void setChannelstatus(String channelstatus) {
		this.channelstatus = channelstatus;
	}
	public String getChannelmsg() {
		return channelmsg;
	}
	public void setChannelmsg(String channelmsg) {
		this.channelmsg = channelmsg;
	}
	public String getPaymentTime() {
		return paymentTime;
	}
	public void setPaymentTime(String paymentTime) {
		this.paymentTime = paymentTime;
	}
	@Override
	public String toString() {
		return "EpayRespPayOrder [payOrderId=" + payOrderId + ", status=" + status + ", amount=" + amount
				+ ", channelstatus=" + channelstatus + ", channelmsg=" + channelmsg + ", paymentTime=" + paymentTime
				+ ", getPayOrderId()=" + getPayOrderId() + ", getStatus()=" + getStatus() + ", getAmount()="
				+ getAmount() + ", getChannelstatus()=" + getChannelstatus() + ", getChannelmsg()=" + getChannelmsg()
				+ ", getPaymentTime()=" + getPaymentTime() + ", getClass()=" + getClass() + ", hashCode()=" + hashCode()
				+ ", toString()=" + super.toString() + "]";
	}
	
	
	

}
