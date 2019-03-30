/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年7月19日
 * 修改历史 : 
 *     1. [2017年7月19日]创建文件 by guobao
 */
package com.guobao.dto.commission.queryAgentCommissionDetail.req;

import com.guobao.report.Head;

public class ReqQueryAgentCommissionDetailBox {

    private Head transactionInfo;

    private ReqQueryAgentCommissionDetailBody request;

    public ReqQueryAgentCommissionDetailBody getRequest() {
        return request;
    }

    public void setRequest(ReqQueryAgentCommissionDetailBody request) {
        this.request = request;
    }

    public Head getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(Head transactionInfo) {
        this.transactionInfo = transactionInfo;
    }
}
