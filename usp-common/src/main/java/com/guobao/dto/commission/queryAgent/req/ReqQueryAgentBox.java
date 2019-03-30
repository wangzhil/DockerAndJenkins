package com.guobao.dto.commission.queryAgent.req;

import com.guobao.report.Head;

public class ReqQueryAgentBox {

    private Head transactionInfo;

    private ReqQueryAgentBody request;

    public ReqQueryAgentBody getRequest() {
        return request;
    }

    public void setRequest(ReqQueryAgentBody request) {
        this.request = request;
    }

    public Head getTransactionInfo() {
        return transactionInfo;
    }

    public void setTransactionInfo(Head transactionInfo) {
        this.transactionInfo = transactionInfo;
    }

}
