package com.guobao.dto.epay.req;
/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 上午10:07:15
 * @version V1.0
 */
public class EpayReqOrder {

	/** 商户ID 非空 */
	private String mchId;
	/** 商户订单号（应用系统） 非空 */
	private String mchOrderId;
	/** 订单金额(元) 非空 */
	private String amount;
	/** 货币类型（cny） 非空 */
	private String currency;
	/** 说明信息 */
	private String summary;
	/** 投保单号 非空 */
	private String applicationNo;
	/** 保全申请单号 */
	private String POSNo;
	/** 创建时间（yyyy-mm-dd hh:mm:ss） 非空 */
	private String createTime;
	/** 客户端IP */
	private String clientIp;
	/** 客户端设备 */
	private String device;
	
	public String getMchId() {
		return mchId;
	}
	public void setMchId(String mchId) {
		this.mchId = mchId;
	}
	public String getMchOrderId() {
		return mchOrderId;
	}
	public void setMchOrderId(String mchOrderId) {
		this.mchOrderId = mchOrderId;
	}
	public String getAmount() {
		return amount;
	}
	public void setAmount(String amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public String getSummary() {
		return summary;
	}
	public void setSummary(String summary) {
		this.summary = summary;
	}
	public String getApplicationNo() {
		return applicationNo;
	}
	public void setApplicationNo(String applicationNo) {
		this.applicationNo = applicationNo;
	}
	public String getPOSNo() {
		return POSNo;
	}
	public void setPOSNo(String pOSNo) {
		POSNo = pOSNo;
	}
	public String getCreateTime() {
		return createTime;
	}
	public void setCreateTime(String createTime) {
		this.createTime = createTime;
	}
	public String getClientIp() {
		return clientIp;
	}
	public void setClientIp(String clientIp) {
		this.clientIp = clientIp;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	
	@Override
	public String toString() {
		return "EpayReqOrder [mchId=" + mchId + ", mchOrderId=" + mchOrderId + ", amount=" + amount + ", currency="
				+ currency + ", summary=" + summary + ", applicationNo=" + applicationNo + ", POSNo=" + POSNo
				+ ", createTime=" + createTime + ", clientIp=" + clientIp + ", device=" + device + "]";
	}
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}