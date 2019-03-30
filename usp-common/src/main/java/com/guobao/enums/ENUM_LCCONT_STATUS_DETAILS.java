package com.guobao.enums;
/**
 *  实时保单状态查询明细
 * @author 
 *
 */
public enum ENUM_LCCONT_STATUS_DETAILS {

	STATUS01("01", "已拒保"),STATUS02("02", "核保通过，待电子投保单生成"),STATUS03("03", "电子投保单生成失败"),
	STATUS04("04", "自核失败，待转人核"),STATUS05("05", "自核成功，待支付"),STATUS06("06", "进入线下核心"), 
	STATUS07("07", "支付失败或支付状态不明"),STATUS08("08", "已承保"),STATUS09("09", "已撤单"),
	STATUS10("10", "已延期"),STATUS11("11", "人核成功，待支付");
	
	private final String code;
    private final String desc;

    
    
    public String code() {
        return code;
    }

    public String desc() {
        return desc;
    }

	 ENUM_LCCONT_STATUS_DETAILS(String code, String desc) {
		this.code = code;
		this.desc = desc;
	}
    
    /**
     * 根据key获得desc
     * @param key
     * @return
     */
    public static String getEnumDescByKey(String key) {
        for (ENUM_LCCONT_STATUS enumItem : ENUM_LCCONT_STATUS.values()) {
            if (key.equals(enumItem.code())) {
                return enumItem.desc();
            }
        }
        return "";
    }
    
}
