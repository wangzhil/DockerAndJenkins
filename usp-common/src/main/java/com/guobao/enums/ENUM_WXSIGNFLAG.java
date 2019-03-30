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
 * 网销核保签单标志
 * @author yr
 * @date 2018年9月28日18:06:24
 * @version V1.0  
*/
public enum ENUM_WXSIGNFLAG {
	WXSIGNFLAG0("0","进行试算"),WXSIGNFLAG1("1","进行核保");
    private final String code;
    private final String desc;

    ENUM_WXSIGNFLAG(String code ,String desc) {
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
        for(ENUM_WXSIGNFLAG enumItem:ENUM_WXSIGNFLAG.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
