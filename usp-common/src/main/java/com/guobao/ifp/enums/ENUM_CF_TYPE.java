package com.guobao.ifp.enums;

/**
 * 
 * 【对账类型】
 * @author guobao
 * @date 2018年1月23日 上午9:52:09 
 * @version V1.0
 */
public enum ENUM_CF_TYPE {
    CF("01", "新单对账"), EdorCF("02", "保全对账");
    private final String code;
    private final String desc;

    ENUM_CF_TYPE(String code, String desc) {
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
    public static String getEnumDescByKey(String key) {
        for (ENUM_CF_TYPE enumItem : ENUM_CF_TYPE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }

}
