/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月24日
 * 修改历史 : 
 *     1. [2017年5月24日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 【序列号枚举类】
 * @author guobao
 * @date 2017年5月24日 下午4:56:24 
 * @version V1.0  
*/
public enum ENUM_SEQUENCE_TYPE {
    CUSTOMER("customerno", "客户号"), ORDER("order", "订单号"), POLNO("polno", ""), EPAY("epay", "支付序号"), CLAIMNO("claimno", "理赔申请 号");
    private final String code;
    private final String desc;

    ENUM_SEQUENCE_TYPE(String code, String desc) {
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
        for (ENUM_SEQUENCE_TYPE enumItem : ENUM_SEQUENCE_TYPE.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
