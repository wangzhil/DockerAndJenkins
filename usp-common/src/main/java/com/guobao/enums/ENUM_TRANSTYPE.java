package com.guobao.enums;

/**
 * 
 * 【保全接口】
 * @author guobao
 * @date 2018年1月25日 下午5:58:28 
 * @version V1.0
 */
public enum ENUM_TRANSTYPE {
    Cal("020001", "犹豫期退保试算"),
    Confirm("020011", "犹豫期退保确认");
    private final String code;
    private final String desc;

    ENUM_TRANSTYPE(String code, String desc) {
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
        for (ENUM_TRANSTYPE enumItem : ENUM_TRANSTYPE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
    
}
