package com.guobao.dto.epay.res;
/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 下午2:03:40
 * @version V1.0
 */
public class EpayRespOrder {
	/** 商户订单号（应用系统） 非空 */
	private String mchOrderId;
	/** 创建日期（yyyy-mm-dd hh:mm:ss） 非空 */
	private String createTime;
	/** 订单金额（元） 非空 */
	private String amount;
	/** 商户订单支付结果(100-处理中，200-支付成功，500-支付失败) 非空 */
	private String status;
	/** 支付订单信息 非空 */
	private EpayRespPayOrder payOrder;
	
	public String getMchOrderId() {
		return mchOrderId;
	}
	public void setMchOrderId(String mchOrderId) {
		this.mchOrderId = mchOrderId;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public EpayRespPayOrder getPayOrder() {
		return payOrder;
	}
	public void setPayOrder(EpayRespPayOrder payOrder) {
		this.payOrder = payOrder;
	}
	@Override
	public String toString() {
		return "EpayRespOrder [mchOrderId=" + mchOrderId + ", createTime=" + createTime + ", amount=" + amount
				+ ", status=" + status + ", payOrder=" + payOrder + "]";
	}
	
	
	
}























