package com.guobao.enums;

/**
 * 
 * 【交易银行】
 * @author guobao
 * @date 2018年1月26日 下午2:06:19 
 * @version V1.0
 */
public enum ENUM_TRANSCOM {
    ICBC("01", "工商银行"), BC("02", "中国银行");
    private final String code;
    private final String desc;

    ENUM_TRANSCOM(String code, String desc) {
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
        for (ENUM_TRANSCOM enumItem : ENUM_TRANSCOM.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
