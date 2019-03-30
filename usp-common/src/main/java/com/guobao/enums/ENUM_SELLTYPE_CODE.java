/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月24日
 * 修改历史 : 
 *     1. [2017年5月24日]创建文件 by guobao
 */
package com.guobao.enums;

/**  
 * 销售方式
 * @author guobao
 * @date 2017年5月24日 下午4:56:24 
 * @version V1.0  
*/
public enum ENUM_SELLTYPE_CODE {
	SELLTYPE01("01", "纸质投保"),SELLTYPE02("02", "在线投保"),SELLTYPE03("03", "银保通"),SELLTYPE04("04", "自助终端")
	,SELLTYPE05("05", "网上银行"),SELLTYPE06("06", "手机银行"),LZCARDSTATEFLAG3("3","已发放未核销"),LZCARDSTATEFLAG4("4","自动缴销,该号码已经核销"),
	OPERATEFLAG1("1","回收");
    private final String code;
    private final String desc;

    ENUM_SELLTYPE_CODE(String code, String desc) {
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
        for (ENUM_SELLTYPE_CODE enumItem : ENUM_SELLTYPE_CODE.values()) {
            if (enumItem.code().equals(key)) {
                return enumItem.desc();
            }
        }
        return "";
    }
}
