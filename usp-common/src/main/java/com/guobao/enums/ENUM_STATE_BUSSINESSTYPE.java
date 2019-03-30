package com.guobao.enums;

public enum ENUM_STATE_BUSSINESSTYPE {

	TYPE01("20001","核心泛华新契约收费");
//	TYPE02("10002","团险契约收费"),
//	TYPE03("10003","保全收费"),
//	TYPE04("10004","续期收费"),
//	TYPE05("10005","团险定期结算收费");

	
	private String code;
	
	private String desc;
	
	
	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}

	ENUM_STATE_BUSSINESSTYPE(String code,String desc){
	     this.code = code;
	     this.desc = desc;
	}
	
	public static String getEnumDescByKey(String code){
		for(ENUM_STATE_BUSSINESSTYPE enumItem : ENUM_STATE_BUSSINESSTYPE.values()){
			if(enumItem.getCode().equals(code)){
				return enumItem.getDesc();
			}
		}
		return "";
	}
	
	
}
