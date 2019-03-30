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
 * @date 2017年6月26日 下午1:25:57 
 * @version V1.0  
*/
public class EpayReqBody {
    private EpayOrder order;

    private EpayAccount account;

    private String paymentProvider;

    public EpayOrder getOrder() {
        return order;
    }

    public void setOrder(EpayOrder order) {
        this.order = order;
    }

    public EpayAccount getAccount() {
        return account;
    }

    public void setAccount(EpayAccount account) {
        this.account = account;
    }

    public String getPaymentProvider() {
        return paymentProvider;
    }

    public void setPaymentProvider(String paymentProvider) {
        this.paymentProvider = paymentProvider;
    }

}
