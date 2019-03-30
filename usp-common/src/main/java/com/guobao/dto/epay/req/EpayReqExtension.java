package com.guobao.dto.epay.req;
/**  
 * 【Description】
 * @Developer guobao
 * @Date 2018年1月3日
 * @Time 上午10:07:15
 * @version V1.0
 */
public class EpayReqExtension {

	/** 扩展字段 key */
	private String key;
	/** 扩展字段 value */
	private String value;
	public String getKey() {
		return key;
	}
	public void setKey(String key) {
		this.key = key;
	}
	public String getValue() {
		return value;
	}
	public void setValue(String value) {
		this.value = value;
	}
	@Override
	public String toString() {
		return "EpayReqExtension [key=" + key + ", value=" + value + "]";
	}
	
	
	
		
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}