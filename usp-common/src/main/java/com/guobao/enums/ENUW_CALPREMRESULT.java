package com.guobao.enums;

public enum ENUW_CALPREMRESULT {
    SUCCESS("0","保费试算成功"),FAIL("1","保费试算失败");
    private final String code;
    private final String desc;

    ENUW_CALPREMRESULT(String code ,String desc) {
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
        for(ENUM_RESULT enumItem:ENUM_RESULT.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }

}
