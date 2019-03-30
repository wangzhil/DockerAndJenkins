package com.guobao.enums;

public enum ENUM_REPEATFLAG {
	REPEATFLAG0("0","非重复请求"),REPEATFLAG1("1","重复请求");
    private final String code;
    private final String desc;

    ENUM_REPEATFLAG(String code ,String desc) {
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
        for(ENUM_WXSIGNFLAG enumItem:ENUM_WXSIGNFLAG.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
