package com.guobao.dto.bq.common;

/**
 * 
 * 【校验规则实体类】
 * @author gbusp
 * @date 2018年3月2日 上午11:03:35 
 * @version V1.0
 */
public class CheckRuleDTO {

    private String contno;//保单号

    private String polno;//险种号

    private String stateType;//保单状态类型

    private String busiType;//业务类型

    private String state;//保单状态

    private String insuredNo;//被保人号

    private String startDate;//开始日期

    private String subfeeoperationtype1;//补缴投保人健康加费

    private String subfeeoperationtype2;//补缴投保人职业加费

    private String subfeeoperationtype3;//补缴被保险人健康加费

    private String subfeeoperationtype4;//补缴被保险人职业加费

    private String subfeeoperationtype5;//职业加费退费金额

    private String subfeeoperationtype6;//健康加费退费金额

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno;
    }

    public String getBusiType() {
        return busiType;
    }

    public void setBusiType(String busiType) {
        this.busiType = busiType;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getStateType() {
        return stateType;
    }

    public void setStateType(String stateType) {
        this.stateType = stateType;
    }

    public String getInsuredNo() {
        return insuredNo;
    }

    public void setInsuredNo(String insuredNo) {
        this.insuredNo = insuredNo;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getSubfeeoperationtype1() {
        return subfeeoperationtype1;
    }

    public void setSubfeeoperationtype1(String subfeeoperationtype1) {
        this.subfeeoperationtype1 = subfeeoperationtype1;
    }

    public String getSubfeeoperationtype2() {
        return subfeeoperationtype2;
    }

    public void setSubfeeoperationtype2(String subfeeoperationtype2) {
        this.subfeeoperationtype2 = subfeeoperationtype2;
    }

    public String getSubfeeoperationtype3() {
        return subfeeoperationtype3;
    }

    public void setSubfeeoperationtype3(String subfeeoperationtype3) {
        this.subfeeoperationtype3 = subfeeoperationtype3;
    }

    public String getSubfeeoperationtype4() {
        return subfeeoperationtype4;
    }

    public void setSubfeeoperationtype4(String subfeeoperationtype4) {
        this.subfeeoperationtype4 = subfeeoperationtype4;
    }

    public String getSubfeeoperationtype5() {
        return subfeeoperationtype5;
    }

    public void setSubfeeoperationtype5(String subfeeoperationtype5) {
        this.subfeeoperationtype5 = subfeeoperationtype5;
    }

    public String getSubfeeoperationtype6() {
        return subfeeoperationtype6;
    }

    public void setSubfeeoperationtype6(String subfeeoperationtype6) {
        this.subfeeoperationtype6 = subfeeoperationtype6;
    }

}
