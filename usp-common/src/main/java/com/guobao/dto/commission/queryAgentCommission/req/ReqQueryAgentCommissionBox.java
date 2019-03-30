package com.guobao.dto.commission.queryAgentCommission.req;

import com.guobao.report.Head;

public class ReqQueryAgentCommissionBox {
    private Head transactionInfo;

    private ReqQueryAgentCommissionBody request;

    public ReqQueryAgentCommissionBody getRequest() {
        return request;
    }

    public void setRequest(ReqQueryAgentCommissionBody request) {
        this.request = request;
    }

    public Head getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(Head transactionInfo) {
        this.transactionInfo = transactionInfo;
    }
}
