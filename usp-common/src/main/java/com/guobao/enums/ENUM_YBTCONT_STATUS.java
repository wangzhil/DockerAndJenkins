package com.guobao.enums;

/**
 * 银保通线下单变更单的状态查询核保标识
 * @author devel
 *
 */
public enum ENUM_YBTCONT_STATUS {

	STATUS00("00","未核保"),STATUS01("01","核保成功"),STATUS02("02","核保不通过"),STATUS03("03","签单成功"),STATUS04("04","签单失败");
	private final String code;
	
	private final String desc;
	
	ENUM_YBTCONT_STATUS(String code,String desc){
		this.code = code;
		this.desc = desc;
	}
	
	
	public String getCode() {
		return code;
	}



	public String getDesc() {
		return desc;
	}



	public static String getEnumDescByCode(String code){
		
		for(ENUM_YBTCONT_STATUS enumItem : ENUM_YBTCONT_STATUS.values()){
			if(code.equals(enumItem.getCode())){
				return enumItem.getDesc();
			}
		}
		return "";
	}
}
