/**
* @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.enums;
/**
 * 
 *  【核保状态枚举类 】
 * @author zhanght
 * @date 2017年4月5日 下午3:41:30 
 * @version V1.0
 */
public enum ENUM_PAY_STATUS {
	PAYING("100","支付中"),SUCCESS("200","支付成功"),FAIL("500","支付失败"),UNPAYED("400","订单未支付"),LOCKED("999","订单支付锁定状态"),
	PAYED_2017("2017", "单笔交易金额超过单笔金额上限"),PAYED_2019("2019", "包总金额超过规定的包总金额上限"),PAYED_3055("3055", "当日通兑业务累计金额超过规定金额");
	private final String code;
	private final String desc;

	ENUM_PAY_STATUS(String code ,String desc) {
		this.code = code;
		this.desc = desc;
	}

	public String code() {
		return code;
	}

	public String desc() {
		return desc;
	}
	/**
	 * 根据key获得desc
	 * @param key
	 * @return
	 */
	public static String getEnumDescByKey(String key){
		for(ENUM_PAY_STATUS enumItem:ENUM_PAY_STATUS.values()){
			if(key.equals(enumItem.code())){
				return enumItem.desc();
			}
		}
		return "";
	}
}
