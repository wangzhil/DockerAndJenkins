package com.guobao.dto.bq.common;

/**
 * 
 * 【费用记录】
 * @author gbusp
 * @date 2018年3月5日 下午4:07:35 
 * @version V1.0
 */
public class LJSGetEndorseDTO {

    /** 补/退费标志 */
    private String getflag;

    /** 币别 */
    private String currency;

    /** 补/退费金额 */
    private String getmoney;

    public String getGetflag() {
        return getflag;
    }

    public void setGetflag(String getflag) {
        this.getflag = getflag;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getGetmoney() {
        return getmoney;
    }

    public void setGetmoney(String getmoney) {
        this.getmoney = getmoney;
    }

}
