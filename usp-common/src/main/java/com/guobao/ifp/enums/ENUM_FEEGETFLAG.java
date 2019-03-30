package com.guobao.ifp.enums;

/**
 * 
 * 【工本费扣除标志】
 * @author gbifp
 * @date 2018年3月2日 上午10:21:22 
 * @version V1.0
 */
public enum ENUM_FEEGETFLAG {
    UNDeduction("0","不扣除"),
    Deduction("1","扣除");
    private final String code;
    private final String desc;

    ENUM_FEEGETFLAG(String code, String desc) {
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
        for (ENUM_FEEGETFLAG enumItem : ENUM_FEEGETFLAG.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
