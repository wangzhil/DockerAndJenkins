package com.guobao.ifp.enums;

/**
 * 
 * 【批扣种类】
 * 
 * @author guobao
 * @date 2018年1月23日 上午9:52:09
 * @version V1.0
 */
public enum ENUM_RISK_PARAMSTYPE {
	GETINTV("getintv", "领取频率"), 
	GETYEAR("getyear", "年龄年期"),
	GETYEARFLAG("getyearflag", "年龄年期标志"),
	LIVEGETMODE("livegetmode", "生存金领取方式"),
	PAYENDYEAR("payendyear", "交费年期"),
	PAYENDYEARFLAG("payendyearflag", "交费期间标志"),
	PAYINTV("payintv", "交费间隔"),
	INSUYEARFLAG("insuyearflag", "保险期间标志"),
	INSUYEAR("insuyear", "保险期间");
	private final String code;
	private final String desc;

	ENUM_RISK_PARAMSTYPE(String code, String desc) {
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
		for (ENUM_RISK_PARAMSTYPE enumItem : ENUM_RISK_PARAMSTYPE.values()) {
			if (key.equals(enumItem.code())) {
				return enumItem.desc();
			}
		}
		return "";
	}

}
