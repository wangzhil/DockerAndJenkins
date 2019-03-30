/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年7月19日
 * 修改历史 : 
 *     1. [2017年7月19日]创建文件 by guobao
 */
package com.guobao.dto.commission.queryAgentCommissionDetail.res;

import java.util.List;

public class ResQueryAgentCommissionDetail {

    private String agentcode;

    private String totalcommission;

    private String totalprem;

    private List<ResQueryPolicy> policy;

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    public String getTotalcommission() {
        return totalcommission;
    }

    public void setTotalcommission(String totalcommission) {
        this.totalcommission = totalcommission;
    }

    public List<ResQueryPolicy> getPolicy() {
        return policy;
    }

    public void setPolicy(List<ResQueryPolicy> policy) {
        this.policy = policy;
    }

    public String getTotalprem() {
        return totalprem;
    }

    public void setTotalprem(String totalprem) {
        this.totalprem = totalprem;
    }

}
