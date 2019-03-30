package com.guobao.ifp.enums;

/**
 * 
 * 【同步核心状态】
 * @author gbifp
 * @date 2018年2月7日 上午10:10:27 
 * @version V1.0
 */
public enum ENUM_TOLISFLAG {
    UNUSUAL("0","未同步"),SUCCESS("1","同步成功"),FAIL("2","同步失败");
    private final String code;
    private final String desc;

    ENUM_TOLISFLAG(String code ,String desc) {
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
        for(ENUM_TOLISFLAG enumItem:ENUM_TOLISFLAG.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
