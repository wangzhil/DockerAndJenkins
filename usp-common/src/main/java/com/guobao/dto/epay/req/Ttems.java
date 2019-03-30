/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月29日
 * 修改历史 : 
 *     1. [2017年6月29日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

import java.math.BigDecimal;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月29日 下午6:43:58 
 * @version V1.0  
*/
public class Ttems {
    /**保费*/
    private BigDecimal amount;
    /**投保人姓名*/
    private String applicantName;
    /**保费*/
    private String businessType;
    /**随机生成长度为23位的保单号，每次支付保单号不能相同。要确定以APP为开头20位数字相组合*/
    private String policyNumber;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getApplicantName() {
        return applicantName;
    }

    public void setApplicantName(String applicantName) {
        this.applicantName = applicantName;
    }

    public String getBusinessType() {
        return businessType;
    }

    public void setBusinessType(String businessType) {
        this.businessType = businessType;
    }

    public String getPolicyNumber() {
        return policyNumber;
    }

    public void setPolicyNumber(String policyNumber) {
        this.policyNumber = policyNumber;
    }
}
