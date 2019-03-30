/**
 * @Copyright ®2015 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 交银康联智能运营平
 * 创建日期 : 2017年8月18日
 * 修改历史 : 
 *     1. [2017年8月18日]创建文件 by guobao
 */
package com.guobao.enums;

/**
 * 【性别枚举类】
 * 
 * @author guobao
 * @date 2017年8月18日 下午3:53:03
 * @version V1.0
 */
public enum ENUM_RELATIONTOINSURD_CODE {
	RELATION00("00", "本人"), RELATION01("01", "配偶"), RELATION02("02", "父母"), RELATION03("03", "子女"), RELATION04("04", "亲属"), RELATION05(
			"05", "雇佣关系"), RELATION99("99", "亲戚");

	private final String code;
	private final String desc;

	ENUM_RELATIONTOINSURD_CODE(String code, String desc) {
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
	 * 
	 * @param key
	 * @return
	 */
	public static String getEnumDescByKey(String key) {
		for (ENUM_RELATIONTOINSURD_CODE enumItem : ENUM_RELATIONTOINSURD_CODE.values()) {
			if (enumItem.code().equals(key)) {
				return enumItem.desc();
			}
		}
		return "";
	}
}
