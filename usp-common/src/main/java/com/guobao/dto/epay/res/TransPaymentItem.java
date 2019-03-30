/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.res;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月26日 下午3:30:29 
 * @version V1.0  
*/
public class TransPaymentItem {
    /***/
    private String transactionStatus;
    /***/
    private String paymentItemId;
    /**返回话术*/
    private String failureDesc;
    /***/
    private String paymentCode;
    /**如果为PAID则为支付成功。*/
    private String paymenyStatus;

    public String getTransactionStatus() {
        return transactionStatus;
    }

    public void setTransactionStatus(String transactionStatus) {
        this.transactionStatus = transactionStatus;
    }

    public String getPaymentItemId() {
        return paymentItemId;
    }

    public void setPaymentItemId(String paymentItemId) {
        this.paymentItemId = paymentItemId;
    }

    public String getFailureDesc() {
        return failureDesc;
    }

    public void setFailureDesc(String failureDesc) {
        this.failureDesc = failureDesc;
    }

    public String getPaymentCode() {
        return paymentCode;
    }

    public void setPaymentCode(String paymentCode) {
        this.paymentCode = paymentCode;
    }

    public String getPaymenyStatus() {
        return paymenyStatus;
    }

    public void setPaymenyStatus(String paymenyStatus) {
        this.paymenyStatus = paymenyStatus;
    }

}
