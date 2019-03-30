/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年7月19日
 * 修改历史 : 
 *     1. [2017年7月19日]创建文件 by guobao
 */
package com.guobao.dto.commission.queryAgentCommissionDetail.res;

import com.guobao.report.Status;

public class ResQueryAgentCommissionDetailBody {

    /**状态*/
    private Status status;

    private ResQueryAgentCommissionDetail result;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public ResQueryAgentCommissionDetail getResult() {
        return result;
    }

    public void setResult(ResQueryAgentCommissionDetail result) {
        this.result = result;
    }

}
