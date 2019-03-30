package com.guobao.enums;

/**
 * 
 * 【交易银行】
 * @author guobao
 * @date 2018年1月26日 下午2:06:19 
 * @version V1.0
 */
public enum ENUM_TRANS_CODE {
	TRANS1("010001", "核保"), TRANS2("010002", "签单"),TRANS3("010003", "重打"),
	TRANS4("010004", "撤单"),TRANS5("010009", "新单对账"),TRANS6("020001", "犹豫期退保试算"),
	TRANS7("020011", "犹豫期退保确认"),TRANS8("020010", "保全对账");
    private final String code;
    private final String desc;

    ENUM_TRANS_CODE(String code, String desc) {
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
        for (ENUM_TRANS_CODE enumItem : ENUM_TRANS_CODE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
