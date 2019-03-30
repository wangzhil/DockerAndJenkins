package com.guobao.ifp.enums;

/**
 * 
 * 【批扣种类】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_BAT {
	BAT("0", "批扣"), PAY("1", "线上支付");
	private final String code;
	private final String desc;

	ENUM_BAT(String code, String desc) {
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
		for (ENUM_BAT enumItem : ENUM_BAT.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

}
