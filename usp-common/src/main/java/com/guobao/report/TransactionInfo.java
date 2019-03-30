/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年10月24日
 * 修改历史 : 
 *     1. [2017年10月24日]创建文件 by guobao
 */
package com.guobao.report;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年10月24日 下午1:45:02 
 * @version V1.0  
*/
public class TransactionInfo {

    private String resultNotificationUrl;

    private String transactionExeDate;

    private String transactionExeTime;

    private String transactionId;

    private String transactionType;

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
