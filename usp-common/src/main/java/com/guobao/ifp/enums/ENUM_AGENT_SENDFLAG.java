package com.guobao.ifp.enums;

public enum ENUM_AGENT_SENDFLAG {
	sendflag0("0","推微信和核心"),
	sendflag1("1","只推微信"),
	sendflag2("2","只推核心");
    private final String code;
    private final String desc;

    ENUM_AGENT_SENDFLAG(String code ,String desc) {
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
        for(ENUM_AGENT_SENDFLAG enumItem:ENUM_AGENT_SENDFLAG.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }

}
