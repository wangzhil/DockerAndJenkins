/**
 * @Copyright ®2015 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 交银康联智能运营平
 * 创建日期 : 2017年8月18日
 * 修改历史 : 
 *     1. [2017年8月18日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 【性别枚举类】
 * @author guobao
 * @date 2017年8月18日 下午3:53:03 
 * @version V1.0  
 */
public enum ENUM_SEX_CODE {
    MAN("0", "男"),
    WOMAN("1", "女"),
	UNKNOWN("1", "女");
    private final String code;
    private final String desc;

    ENUM_SEX_CODE(String code, String desc) {
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
        for (ENUM_SEX_CODE enumItem : ENUM_SEX_CODE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
