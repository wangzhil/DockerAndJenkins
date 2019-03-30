package com.guobao.dto.bq.toLis.res;

/**
 * 
 * 【险种信息】
 * @author guobao
 * @date 2018年1月26日 上午10:55:40 
 * @version V1.0
 */
public class Risk {

    //险种名称
    private String riskName;

    //险种编码
    private String riskCode;

    //保单账户价值
    private String accountValue;

    //主附险标记
    private String mainRiskFlag;

    public String getRiskName() {
        return riskName;
    }

    public void setRiskName(String riskName) {
        this.riskName = riskName;
    }

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public String getAccountValue() {
        return accountValue;
    }

    public void setAccountValue(String accountValue) {
        this.accountValue = accountValue;
    }

    public String getMainRiskFlag() {
        return mainRiskFlag;
    }

    public void setMainRiskFlag(String mainRiskFlag) {
        this.mainRiskFlag = mainRiskFlag;
    }

}
