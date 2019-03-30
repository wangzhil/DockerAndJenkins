package com.guobao.ifp.enums;

/**
 * 
 * 【对账结果】
 * @author guobao
 * @date 2018年1月23日 上午9:55:16 
 * @version V1.0
 */
public enum ENUM_CF_RESULT {

    SUCCESS("01","交易成功"),FAIL("02","交易失败"),UNUSUAL("03","交易异常");
    private final String code;
    private final String desc;

    ENUM_CF_RESULT(String code, String desc) {
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
        for (ENUM_CF_RESULT enumItem : ENUM_CF_RESULT.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
