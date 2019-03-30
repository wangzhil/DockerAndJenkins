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
public enum ENUM_WXRESULT {
    SUCCESS("0","交易成功"),FAIL("1","核保未通过"),UNUSUAL("2","核保异常"),NODATA("3","没有对应的数据"),NULLPUBKEY("NullPubKey", "生成公钥失败"),
	FAILCONFIRM("FailConfirm", "权限认证失败");
    private final String code;
    private final String desc;

    ENUM_WXRESULT(String code ,String desc) {
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
        for(ENUM_RESULT enumItem:ENUM_RESULT.values()){
            if(key.equals(enumItem.code())){
                return enumItem.desc();
            }
        }
        return "";
    }
}
