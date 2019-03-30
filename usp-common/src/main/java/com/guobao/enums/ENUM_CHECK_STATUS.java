package com.guobao.enums;

public enum ENUM_CHECK_STATUS {
	WAIT("01","待对账"),ENDING("02","对账结束"),NOCHECKDATA("03","签单失败,没有生成对账数据"),REPEAT("04","多次对账");
	private final String code;
	private final String desc;

	ENUM_CHECK_STATUS(String code ,String desc) {
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
	 * @param key
	 * @return
	 */
	public static String getEnumDescByKey(String key){
		for(ENUM_CHECK_STATUS enumItem:ENUM_CHECK_STATUS.values()){
			if(key.equals(enumItem.code())){
				return enumItem.desc();
			}
		}
		return "";
	}
}
