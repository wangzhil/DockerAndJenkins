package com.guobao.ifp.enums;

/**
 * 
 * 【退保原因】
 * @author gbifp
 * @date 2018年3月2日 下午1:36:04 
 * @version V1.0
 */
public enum ENUM_STATEREASON {
    surrordereason1("01","经济原因"),
    surrordereason2("02","对险种不满意"),
    surrordereason3("03","对业务员不满意"),
    surrordereason4("04","对公司服务不满意"),
    surrordereason5("05","人情投保"),
    surrordereason6("06","其他");
    
    private final String code;
    private final String desc;

    ENUM_STATEREASON(String code, String desc) {
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
        for (ENUM_STATEREASON enumItem : ENUM_STATEREASON.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
    
}
