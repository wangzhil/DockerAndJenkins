package com.guobao.dto.bq.checkFile.req;

/**
 * 
 * 【对账明细信息】
 * @author guobao
 * @date 2018年1月21日 下午8:20:49 
 * @version V1.0
 */
public class Detail {

    //代理机构
    private String AgentCom;

    //被保人姓名
    private String InsuredName;

    //保费
    private String Prem;

    //投保单印刷单号
    private String ProposalPrtNo;

    //保单号
    private String ContNo;

    //投保人姓名
    private String AppntName;

    public String getAgentCom() {
        return AgentCom;
    }

    public void setAgentCom(String agentCom) {
        AgentCom = agentCom;
    }

    public String getInsuredName() {
        return InsuredName;
    }

    public void setInsuredName(String insuredName) {
        InsuredName = insuredName;
    }

    public String getPrem() {
        return Prem;
    }

    public void setPrem(String prem) {
        Prem = prem;
    }

    public String getProposalPrtNo() {
        return ProposalPrtNo;
    }

    public void setProposalPrtNo(String proposalPrtNo) {
        ProposalPrtNo = proposalPrtNo;
    }

    public String getContNo() {
        return ContNo;
    }

    public void setContNo(String contNo) {
        ContNo = contNo;
    }

    public String getAppntName() {
        return AppntName;
    }

    public void setAppntName(String appntName) {
        AppntName = appntName;
    }

}
