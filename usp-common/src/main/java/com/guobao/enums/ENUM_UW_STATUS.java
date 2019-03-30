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
 * @author guobao
 * @date 2018年4月5日 下午3:41:30 
 * @version V1.0
 */
public enum ENUM_UW_STATUS {
	PASS("01","通过"),UNPASS("02","未通过");
	private final String code;
	private final String desc;

	ENUM_UW_STATUS(String code ,String desc) {
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
		for(ENUM_UW_STATUS enumItem:ENUM_UW_STATUS.values()){
			if(key.equals(enumItem.code())){
				return enumItem.desc();
			}
		}
		return "";
	}
}
