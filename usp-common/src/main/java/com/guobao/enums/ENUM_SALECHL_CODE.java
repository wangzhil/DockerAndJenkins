/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月24日
 * 修改历史 : 
 *     1. [2017年5月24日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 	销售渠道
 * @author guobao
 * @date 2017年5月24日 下午4:56:24 
 * @version V1.0  
*/
public enum ENUM_SALECHL_CODE {
    SALECHL1("1", "个险渠道"),SALECHL2("2", "团险渠道"),SALECHL3("3", "银保渠道"),SALECHL5("5", "经代渠道"),SALECHL6("6", "网销渠道");
    private final String code;
    private final String desc;

    ENUM_SALECHL_CODE(String code, String desc) {
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
        for (ENUM_SALECHL_CODE enumItem : ENUM_SALECHL_CODE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
