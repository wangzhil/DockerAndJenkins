package com.guobao.ifp.enums;

/**
 * 
 * 【投保单状态】
 * 
 * @author gbifp
 * @date 2018年3月25日 上午9:20:27
 * @version V1.0
 */
public enum ENUM_LISCONTSTATE {
	APPFLAG0("0", "投保"),
	APPFLAG1("1", "承保"),
	APPFLAG4("4", "终止");
	private final String code;
	private final String desc;

	ENUM_LISCONTSTATE(String code, String desc) {
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
		for (ENUM_LISCONTSTATE enumItem : ENUM_LISCONTSTATE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}
}
