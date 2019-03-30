/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月26日 下午2:04:52 
 * @version V1.0  
*/
public class EpayAccount {
    /**银行编码*/
    private String bankCode;
    /**户主证件号*/
    private String holderIdNumber;
    /**证件类型15为身份证*/
    private String holderIdType;
    /**户主手机号*/
    private String holderMobile;
    /**户主姓名*/
    private String holderName;
    /**银行卡号*/
    private String number;
    /***/
    private String property;
    /**0，银行卡  1，存折  2，信用卡*/
    private String type;

    public String getBankCode() {
        return bankCode;
    }

    public void setBankCode(String bankCode) {
        this.bankCode = bankCode;
    }

    public String getHolderIdNumber() {
        return holderIdNumber;
    }

    public void setHolderIdNumber(String holderIdNumber) {
        this.holderIdNumber = holderIdNumber;
    }

    public String getHolderIdType() {
        return holderIdType;
    }

    public void setHolderIdType(String holderIdType) {
        this.holderIdType = holderIdType;
    }

    public String getHolderMobile() {
        return holderMobile;
    }

    public void setHolderMobile(String holderMobile) {
        this.holderMobile = holderMobile;
    }

    public String getHolderName() {
        return holderName;
    }

    public void setHolderName(String holderName) {
        this.holderName = holderName;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    public String getProperty() {
        return property;
    }

    public void setProperty(String property) {
        this.property = property;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

}
