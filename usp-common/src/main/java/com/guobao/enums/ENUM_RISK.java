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
public enum ENUM_RISK {
    RISK0003("0003","国宝人寿附加爱必达优选定期寿险"),
    RISK0004("0004","国宝人寿附加大护宝A款长期意外伤害保险"),
    RISK0005("0005","国宝人寿附加大护宝B款长期意外伤害保险"),
    RISK0006("0006","国宝人寿附加好稳当A款长期意外伤害保险"),
    RISK0007("0007","国宝人寿附加好稳当B款长期意外伤害保险"),
	RISK0008("0008","国宝人寿附加投保人豁免保险费重大疾病保险"),
	RISK0010("0010","国宝人寿裕盈A款两全保险"),
	RISK0012("0012","国宝人寿爱呀牙少儿齿科医疗保险"),
    RISK0017("0017","国宝人寿爱呀牙少儿齿科医疗保险"),
    RISK0027("0027","国宝人寿学生平安意外伤害保险"),
    RISK0030("0030","国宝人寿医保康医疗保险");
    private final String code;
    private final String desc;

    ENUM_RISK(String code ,String desc) {
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
        for(ENUM_RISK enumItem:ENUM_RISK.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
