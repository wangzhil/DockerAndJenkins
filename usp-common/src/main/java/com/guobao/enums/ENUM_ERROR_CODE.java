package com.guobao.enums;

/**
 * 错误信息编码类
 * @author yangri
 *
 */
public enum ENUM_ERROR_CODE {
	ERROR001("ERROR001","手机号码已被使用"),ERROR002("ERROR002","邮箱已被使用"),ERROR003("ERROR003","超被保人最大可购买份数");
    private final String code;
    private final String desc;

    ENUM_ERROR_CODE(String code ,String desc) {
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
    public static String getEnumDescByKey(String key){
        for(ENUM_WXSIGNFLAG enumItem:ENUM_WXSIGNFLAG.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
