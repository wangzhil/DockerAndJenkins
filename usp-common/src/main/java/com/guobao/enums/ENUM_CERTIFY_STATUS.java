/**
 * 
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月24日
 * 修改历史 : 
 *     1. [2017年5月24日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 【投保单号、印刷号使用状态】
 * @author guobaoYBT
 * @date 2018年2月2日 下午10:09:24 
 * @version V1.0  
*/
public enum ENUM_CERTIFY_STATUS {
	CERTIFY0("NS", "未使用"), CERTIFY1("SD", "签单成功，并且核销成功"),CERTIFY2("CX", "撤单"),CERTIFY3("CD", "重打");
    private final String code;
    private final String desc;

    ENUM_CERTIFY_STATUS(String code, String desc) {
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
        for (ENUM_CERTIFY_STATUS enumItem : ENUM_CERTIFY_STATUS.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
