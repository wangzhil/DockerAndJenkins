/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.enums;

/**
 *
 * 【证件类型】
 * @author guobao
 * @date 2017年8月4日  
 * @version V1.0
 */
public enum ENUM_IDCARD_TYPE {
    ID_TYPE1("0", "身份证"), ID_TYPE2("1", "护照"), ID_TYPE3("2", "军人证"), 
    ID_TYPE4("3", "户口本"), ID_TYPE5("4", "通行证"), ID_TYPE6("5","出生证明"),
    ID_TYPE7("6","外国人永久居留身份证"), ID_TYPE8("7","港澳居民居住证"), ID_TYPE9("8","台湾居民居住证");
    private final String code;
    private final String desc;

    ENUM_IDCARD_TYPE(String code, String desc) {
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
        for (ENUM_IDCARD_TYPE enumItem : ENUM_IDCARD_TYPE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}