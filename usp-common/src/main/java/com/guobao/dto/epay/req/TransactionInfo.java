/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

/**  
 * 【支付请求报文头】
 * @author guobao
 * @date 2017年6月26日 下午1:16:52 
 * @version V1.0  
*/
public class TransactionInfo {
    /**随机生成长度为14位的交易号，确保唯一性。每次支付不能相同*/
    private String paymentItemId;
    /***/
    private String resultNotificationUrl;
    /**请求日期*/
    private String transactionExeDate;
    /**请求时间*/
    private String transactionExeTime;
    /**随机生成长度为14位的交易流水号，确保唯一性。每次支付不能相同。要确定以APP开头11位数字相组合。*/
    private String transactionId;
    /**请求类型*/
    private String transactionType;

    public String getPaymentItemId() {
        return paymentItemId;
    }

    public void setPaymentItemId(String paymentItemId) {
        this.paymentItemId = paymentItemId;
    }

    public String getResultNotificationUrl() {
        return resultNotificationUrl;
    }

    public void setResultNotificationUrl(String resultNotificationUrl) {
        this.resultNotificationUrl = resultNotificationUrl;
    }

    public String getTransactionExeDate() {
        return transactionExeDate;
    }

    public void setTransactionExeDate(String transactionExeDate) {
        this.transactionExeDate = transactionExeDate;
    }

    public String getTransactionExeTime() {
        return transactionExeTime;
    }

    public void setTransactionExeTime(String transactionExeTime) {
        this.transactionExeTime = transactionExeTime;
    }

    public String getTransactionId() {
        return transactionId;
    }

    public void setTransactionId(String transactionId) {
        this.transactionId = transactionId;
    }

    public String getTransactionType() {
        return transactionType;
    }

    public void setTransactionType(String transactionType) {
        this.transactionType = transactionType;
    }

}
