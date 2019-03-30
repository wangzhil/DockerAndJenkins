/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

/**  
 * 【支付报文】
 * @author guobao
 * @date 2017年6月26日 下午1:25:18 
 * @version V1.0  
 */
public class EpayReqBox {
    private EpayReqBody request;

    private EpayChannelInfo channelInfo;

    private TransactionInfo transactionInfo;

    public EpayReqBody getRequest() {
        return request;
    }

    public void setRequest(EpayReqBody request) {
        this.request = request;
    }

    public EpayChannelInfo getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(EpayChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public TransactionInfo getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransactionInfo transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

}
