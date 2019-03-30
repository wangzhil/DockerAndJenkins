package com.guobao.enums;

public enum ENUM_YBTSTATUS_RESULT {

	SUCCESS("0","查询成功"),FAIL("1","查询失败"),UNUSUAL("2","查询异常"),NODATA("3","没有对应的数据");
	
	private final String code;
	
	private final String desc;
	
	ENUM_YBTSTATUS_RESULT(String code,String desc){
		this.code = code;
		this.desc = desc;
	}

	public String getCode() {
		return code;
	}

	public String getDesc() {
		return desc;
	}
	
	public static String getENUM_YBTSTATUS_RESULTDesc(String code){
		for(ENUM_YBTSTATUS_RESULT enumItem : ENUM_YBTSTATUS_RESULT.values()){
			if(code.equals(enumItem.getCode())){
				return enumItem.getDesc();
			}
		}
		return "";
	}
}
