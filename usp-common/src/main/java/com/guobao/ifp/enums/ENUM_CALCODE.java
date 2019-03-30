package com.guobao.ifp.enums;

/**
 * 
 * 【计算方向】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_CALCODE {
	CALCODE_O("O", "其他因素算保费保额"),
	CALCODE_P("P", "保费算保额");
	private final String code;
	private final String desc;

	ENUM_CALCODE(String code, String desc) {
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
		for (ENUM_CALCODE enumItem : ENUM_CALCODE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

}
