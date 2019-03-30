package com.guobao.ifp.enums;

/**
 * 
 * 【核心保单挂起状态】
 * @author gbifp
 * @date 2018年3月1日 上午11:06:46 
 * @version V1.0 */
public enum ENUM_CONTHANGUPSTATE {
    NBFlag("1", "新契约","NBFlag","conthanguptype"),
    PosFlag("2", "保全","PosFlag","conthanguptype"),
    RNFlag("3","续期","RNFlag","conthanguptype"),
    ClaimFlag("4","理赔","ClaimFlag","conthanguptype"),
    AgentFlag("5","渠道","AgentFlag","conthanguptype");
    private final String code;
    private final String desc;
    private final String flag;
    private final String codeType;

    ENUM_CONTHANGUPSTATE(String code, String desc,String flag,String codeType) {
        this.code = code;
        this.desc = desc;
        this.flag = flag;
        this.codeType = codeType;
    }

    public String code() {
        return code;
    }

    public String desc() {
        return flag;
    }
    
    public String flag() {
        return desc;
    }
    
    public String codeType() {
        return codeType;
    }
    

    /**
     * 根据key获得desc
     * @param key
     * @return
     */
    public static String getEnumDescByKey(String key) {
        for (ENUM_CONTHANGUPSTATE enumItem : ENUM_CONTHANGUPSTATE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
    
    /**
     * 根据key获得flag
     * @param key
     * @return
     */
    public static String getEnumFlagByKey(String key) {
        for (ENUM_CONTHANGUPSTATE enumItem : ENUM_CONTHANGUPSTATE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.flag();
            }
        }
        return "";
    }
    
    /**
     * 根据key获得codeType
     * @param key
     * @return
     */
    public static String getEnumCodeTypeByKey(String key) {
        for (ENUM_CONTHANGUPSTATE enumItem : ENUM_CONTHANGUPSTATE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.codeType();
            }
        }
        return "";
    }
}
