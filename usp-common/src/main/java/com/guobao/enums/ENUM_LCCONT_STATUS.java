/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月24日
 * 修改历史 : 
 *     1. [2017年5月24日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 【返回结果枚举类】
 * @author guobao
 * @date 2017年5月24日 下午4:56:24 
 * @version V1.0  
*/
public enum ENUM_LCCONT_STATUS {
    STATUS01("01", "已承保"),STATUS02("02", "未承保"),STATUS03("03", "已撤单");
    private final String code;
    private final String desc;

    ENUM_LCCONT_STATUS(String code, String desc) {
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
        for (ENUM_LCCONT_STATUS enumItem : ENUM_LCCONT_STATUS.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
