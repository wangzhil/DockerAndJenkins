package com.guobao.ifp.enums;

/**
 * 
 * 【保全状态】
 * @author gbifp
 * @date 2018年2月28日 上午10:36:01 
 * @version V1.0
 */
public enum ENUM_EDORSTATE {
    
    Confirm("0","确认生效"),Apply("2","申请确认"),Approve("a","审批通过");
    private final String code;
    private final String desc;

    ENUM_EDORSTATE(String code, String desc) {
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
        for (ENUM_EDORSTATE enumItem : ENUM_EDORSTATE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
