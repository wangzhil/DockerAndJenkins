package com.guobao.dto.commission.queryAgentCommission.res;

import com.guobao.report.Status;

public class ResQueryAgentCommissionBody {

    /**状态*/
    private Status status;

    private ResQueryAgentCommission result;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ResQueryAgentCommission getResult() {
        return result;
    }

    public void setResult(ResQueryAgentCommission result) {
        this.result = result;
    }
}
