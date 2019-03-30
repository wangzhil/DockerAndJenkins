package com.guobao.ifp.enums;
/**
 * 单证编码枚举值
 * @author lh
 *
 */
public enum ENUM_DOCTYPE {
	TB("101", "新单"),TBYD("201","银保新单"),DIF("00","区别核心的保单号和投保单号"),TB66("66","普通保单号吉祥号"),TB99("99","银保通保单号吉祥号")
	,TB88("88","不分渠道，全部使用88为吉祥号");
    private final String code;
    private final String desc;

    ENUM_DOCTYPE(String code, String desc) {
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
        for (ENUM_DOCTYPE enumItem : ENUM_DOCTYPE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
