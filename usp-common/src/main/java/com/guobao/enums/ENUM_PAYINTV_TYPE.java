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
 * 【缴费频次枚举】
 * @author guobao
 * @date 2017年8月4日  
 * @version V1.0
 */
public enum ENUM_PAYINTV_TYPE{
    PAYINTVN("-1","不定期交"),PAYINTV0("0","一次性交清"),PAYINTV1("1","月交"),PAYINTV3("3","季交"),PAYINTV6("6","半年交"),PAYINTV12("12","年交");
    private final String code;
    private final String desc;

    ENUM_PAYINTV_TYPE(String code ,String desc) {
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
        for(ENUM_PAYINTV_TYPE enumItem:ENUM_PAYINTV_TYPE.values()){
            if(enumItem.code().equals(key)){
                return enumItem.desc();
            }
        }
        return "";
    }
}