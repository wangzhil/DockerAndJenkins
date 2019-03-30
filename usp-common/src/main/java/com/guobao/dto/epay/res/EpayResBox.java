/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.res;

import com.guobao.dto.epay.req.EpayChannelInfo;

/**
 * 
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月26日 下午3:21:09 
 * @version V1.0
 */
public class EpayResBox {

    private TransPaymentItem transactionInfo;

    private EpayChannelInfo channelInfo;

    private EpayResBody response;

    public TransPaymentItem getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(TransPaymentItem transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

    public EpayChannelInfo getChannelInfo() {
        return channelInfo;
    }

    public void setChannelInfo(EpayChannelInfo channelInfo) {
        this.channelInfo = channelInfo;
    }

    public EpayResBody getResponse() {
        return response;
    }

    public void setResponse(EpayResBody response) {
        this.response = response;
    }

}
