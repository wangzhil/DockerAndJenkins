package com.guobao.ifp.enums;

/**
 * 
 * 【批扣种类】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_RISKTYPE {
	RISKTYPE_L("L", "寿险"), 
	RISKTYPE_A("A", "意外险"),
	RISKTYPE_H("H", "健康险"),
	RISKTYPE_R("R", "责任险 "),
	RISKMAIN("M", "主险"),
	RISKTYPE_O("O", "其他");
	private final String code;
	private final String desc;

	ENUM_RISKTYPE(String code, String desc) {
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
		for (ENUM_RISKTYPE enumItem : ENUM_RISKTYPE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

}
