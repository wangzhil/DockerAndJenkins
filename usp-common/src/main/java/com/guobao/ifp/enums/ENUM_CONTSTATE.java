package com.guobao.ifp.enums;

/**
 * 
 * 【投保单状态】
 * 
 * @author gbifp
 * @date 2018年3月25日 上午9:20:27
 * @version V1.0
 */
public enum ENUM_CONTSTATE {
	NOFOUNDDATA("0", "未查询到投保单"),
	UWCOMPELETENOTE("1", "人工核保中有未完成照会"), 
	UWUNCOMPELETENOTE("2", "人工核保中无未完成照会"), 
	WAITPAY("3", "待缴费"), 
	WAITPRTINT("4", "待打印"), 
	UNCUSGETPOL("5", "已承保待回执"), 
	UNBACKCALL("6","已承保待回访"), 
	EFFECTIVE("7", "有效(已承保)"),
	DECLINATURE("8", "终止-人核拒保"),
	CANCELCONT("9", "终止-撤单"),
	TERMINATION("10", "终止-其他"),
	SUSPEND("11", "中止"),
	RENEWAL("12", "续期中"),
	DELAY("13","延期");
	private final String code;
	private final String desc;

	ENUM_CONTSTATE(String code, String desc) {
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
		for (ENUM_CONTSTATE enumItem : ENUM_CONTSTATE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}
}
