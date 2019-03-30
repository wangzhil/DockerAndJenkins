package com.guobao.ifp.enums;

/**
 * 
 * 【保全界面的付款方式】
 * @author gbifp
 * @date 2018年3月19日 上午11:19:29 
 * @version V1.0
 */
public enum ENUM_PAYFORM {

	edorgetpayform("1","现金");
    private final String code;
    private final String desc;

    ENUM_PAYFORM(String code, String desc) {
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
        for (ENUM_PAYFORM enumItem : ENUM_PAYFORM.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
