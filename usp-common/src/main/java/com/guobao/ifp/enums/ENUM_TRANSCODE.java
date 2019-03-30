package com.guobao.ifp.enums;

/**
 * 
 * 【交易代码】
 * @author guobao
 * @date 2018年1月23日 上午10:16:06 
 * @version V1.0
 */
public enum ENUM_TRANSCODE {
    underwriting("010001", "核保"), SignIn("010002", "签单"), WHAM("010003", "重打"), CancelOder("010004", "撤单"), CF("010009",
            "新单对账"), HesitationCal("020001", "犹豫期退保试算"), HesitationConfirm("020011", "犹豫期退保确认"), EdorCF("020010", "保全对账");
    private final String code;
    private final String desc;

    ENUM_TRANSCODE(String code, String desc) {
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
        for (ENUM_TRANSCODE enumItem : ENUM_TRANSCODE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }

}
