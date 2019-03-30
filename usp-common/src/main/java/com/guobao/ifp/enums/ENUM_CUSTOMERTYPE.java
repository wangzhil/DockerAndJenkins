package com.guobao.ifp.enums;

public enum ENUM_CUSTOMERTYPE {

    CUSTOMER("1","个人客户号"),CONT("3","个人保单号");
    private final String code;
    private final String desc;

    ENUM_CUSTOMERTYPE(String code ,String desc) {
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
        for(ENUM_CUSTOMERTYPE enumItem:ENUM_CUSTOMERTYPE.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
