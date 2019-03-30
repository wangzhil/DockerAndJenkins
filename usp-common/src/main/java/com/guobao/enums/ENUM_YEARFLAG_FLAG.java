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
public enum ENUM_YEARFLAG_FLAG{
    YEARFLAG01("Y","年"),YEARFLAG02("M","月"),YEARFLAG03("D","天"),YEARFLAG04("A","岁");
    private final String code;
    private final String desc;

    ENUM_YEARFLAG_FLAG(String code ,String desc) {
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
        for(ENUM_YEARFLAG_FLAG enumItem:ENUM_YEARFLAG_FLAG.values()){
            if(enumItem.code().equals(key)){
                return enumItem.desc();
            }
        }
        return "";
    }
}