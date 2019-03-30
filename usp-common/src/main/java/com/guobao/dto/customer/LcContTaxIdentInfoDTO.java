/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

/**
 * 
 * 税收居民纳税信息
 * @author guobao
 * @date 2017年11月8日 下午3:29:43 
 * @version V1.0
 */
public class LcContTaxIdentInfoDTO {
    //税收居民国
    private String taxcountry;
    //是否存在纳税人识别号
    private String hastaxno;
    //纳税人识别号
    private String taxno;
    //未提供纳税识别号原因
    private String notproreason;
    //未提供纳税识别号具体原因
    private String reason;
    //序号
    private String snumber;

    public String getTaxcountry() {
        return taxcountry;
    }

    public void setTaxcountry(String taxcountry) {
        this.taxcountry = taxcountry;
    }

    public String getHastaxno() {
        return hastaxno;
    }

    public void setHastaxno(String hastaxno) {
        this.hastaxno = hastaxno;
    }

    public String getTaxno() {
        return taxno;
    }

    public void setTaxno(String taxno) {
        this.taxno = taxno;
    }

    public String getNotproreason() {
        return notproreason;
    }

    public void setNotproreason(String notproreason) {
        this.notproreason = notproreason;
    }

    public String getReason() {
        return reason;
    }

    public void setReason(String reason) {
        this.reason = reason;
    }

    public String getSnumber() {
        return snumber;
    }

    public void setSnumber(String snumber) {
        this.snumber = snumber;
    }

}
