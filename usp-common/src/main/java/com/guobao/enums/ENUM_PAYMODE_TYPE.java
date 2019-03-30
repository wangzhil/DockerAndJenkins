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
public enum ENUM_PAYMODE_TYPE{
    PAYMODE1("1","现金"),PAYMODE3("3","转账支票"),PAYMODE4("4","银行自动转账"),
    PAYMODE6("6","银保代理代收"),PAYMODE7("7","实时收费"),PAYMODE8("8","银保收费"),
    PAYMODE9("9","网销代收"),PAYMODE10("10","客户转账付款"),PAYMODE11("11","核心经代泛华收费");
    private final String code;
    private final String desc;

    ENUM_PAYMODE_TYPE(String code ,String desc) {
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
        for(ENUM_PAYMODE_TYPE enumItem:ENUM_PAYMODE_TYPE.values()){
            if(enumItem.code().equals(key)){
                return enumItem.desc();
            }
        }
        return "";
    }
}