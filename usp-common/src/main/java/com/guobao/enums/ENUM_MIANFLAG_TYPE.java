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
 * 【缴费形式】
 * @author guobaoYBT
 * @date 2018年2月1日  
 * @version V1.0
 */
public enum ENUM_MIANFLAG_TYPE{
    RISK1("A","两者都可以"),RISK2("M","主险(Main)"),RISK3("S","附险(Sub)");
    private final String code;
    private final String desc;

    ENUM_MIANFLAG_TYPE(String code ,String desc) {
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
        for(ENUM_MIANFLAG_TYPE enumItem:ENUM_MIANFLAG_TYPE.values()){
            if(enumItem.code().equals(key)){
                return enumItem.desc();
            }
        }
        return "";
    }
}