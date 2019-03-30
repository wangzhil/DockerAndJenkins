package com.guobao.ifp.enums;
/**
 * 通知书类型
 * @author 
 *
 */
public enum ENUM_NOTICE {
	
	REFUSECONT("00", "拒保通知书");
	private final String code;
	private final String desc;

	ENUM_NOTICE(String code, String desc) {
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
		for (ENUM_NOTICE enumItem : ENUM_NOTICE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}
}
