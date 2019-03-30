package com.guobao.ifp.enums;

/**
 * 
 * 【核心业务类型】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_BUSITYPE {
	WT("01", "犹撤", "WT"), CT("02", "退保", "CT"), XT("03", "协议退保", "XT"), AM("04", "基本联系方式变更", "AM"),PC("05","银行账户变更","PC");
	private final String code;
	private final String desc;
	private final String flag;

	ENUM_BUSITYPE(String code, String desc, String flag) {
		this.code = code;
		this.desc = desc;
		this.flag = flag;
	}

	public String code() {
		return code;
	}

	public String desc() {
		return desc;
	}

	public String flag() {
		return flag;
	}

	/**
	 * 根据key获得desc
	 * 
	 * @param key
	 * @return
	 */
	public static String getEnumDescByKey(String key) {
		for (ENUM_BUSITYPE enumItem : ENUM_BUSITYPE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

	/**
	 * 根据key获得flag
	 * 
	 * @param key
	 * @return
	 */
	public static String getEnumFlagByKey(String key) {
		for (ENUM_BUSITYPE enumItem : ENUM_BUSITYPE.values()) {
			if (key.equals(enumItem.flag())) {
				return enumItem.flag();
			}
		}
		return "";
	}

}
