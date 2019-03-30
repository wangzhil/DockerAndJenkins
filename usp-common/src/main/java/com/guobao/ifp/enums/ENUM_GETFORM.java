package com.guobao.ifp.enums;

/**
 * 
 * 【领款方式】
 * @author gbifp
 * @date 2018年3月19日 上午11:19:29 
 * @version V1.0
 */
public enum ENUM_GETFORM {

	getform1("1","上柜领取"),
	getform2("2","银行转帐"),
	getform3("3","网上支付");
    private final String code;
    private final String desc;

    ENUM_GETFORM(String code, String desc) {
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
        for (ENUM_GETFORM enumItem : ENUM_GETFORM.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
