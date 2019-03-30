package com.guobao.dto.commission.queryAgent.res;

import com.guobao.report.Status;

public class ResQueryAgentBody {

    /**状态*/
    private Status status;

    private ResQueryAgent result;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ResQueryAgent getResult() {
        return result;
    }

    public void setResult(ResQueryAgent result) {
        this.result = result;
    }

}
