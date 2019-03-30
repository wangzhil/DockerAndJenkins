package com.guobao.ifp.enums;

/**
 * 
 * 【核保状态】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_UWFLAG {
	UNPASS("0", "自核不通过,需要人核"), PASS("1", "自核通过"), FAIL("2", "自核处理失败");
	private final String code;
	private final String desc;

	ENUM_UWFLAG(String code, String desc) {
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
		for (ENUM_UWFLAG enumItem : ENUM_UWFLAG.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

}
