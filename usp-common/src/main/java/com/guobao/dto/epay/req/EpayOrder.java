/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月26日 下午2:10:26 
 * @version V1.0  
*/
public class EpayOrder {
    /**支付费用（保费）*/
    private BigDecimal amount;
    /***/
    private String currency;
    /**保费支付*/
    private String summary;
    /***/
    private List<Ttems> items;
    /**订单号*/
    private String orderNo;
    /***/
    private String refTransId;
    /***/
    private Date createdOn;
    /***/
    private Date payedOn;
    /***/
    private String status;
    /**支付类型*/
    private String paymentType;

    public BigDecimal getAmount() {
        return amount;
    }

    public void setAmount(BigDecimal amount) {
        this.amount = amount;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public List<Ttems> getItems() {
        return items;
    }

    public void setItems(List<Ttems> items) {
        this.items = items;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public String getRefTransId() {
        return refTransId;
    }

    public void setRefTransId(String refTransId) {
        this.refTransId = refTransId;
    }

    public Date getCreatedOn() {
        return createdOn;
    }

    public void setCreatedOn(Date createdOn) {
        this.createdOn = createdOn;
    }

    public Date getPayedOn() {
        return payedOn;
    }

    public void setPayedOn(Date payedOn) {
        this.payedOn = payedOn;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getPaymentType() {
        return paymentType;
    }

    public void setPaymentType(String paymentType) {
        this.paymentType = paymentType;
    }

}
