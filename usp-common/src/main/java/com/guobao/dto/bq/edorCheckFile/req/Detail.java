package com.guobao.dto.bq.edorCheckFile.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【明细信息】
 * @author guobao
 * @date 2018年1月21日 下午10:29:24 
 * @version V1.0
 */
public class Detail {

    //保全状态
    private String EdorState;

    //退保金额
    private String Money;

    //交易流水号
    private String EdorTransSeq;

    //银行编码
    private String BankCode;

    //保全确认日期
    private String EdorDate;

    //保全申请方式
    private String AppType;

    //保全类型
    private String EdorType;
    //保全类型
    private String ContNo;

    @JSONField(name = "EdorState")
    public String getEdorState() {
        return EdorState;
    }

    public void setEdorState(String edorState) {
        EdorState = edorState;
    }

    @JSONField(name = "Money")
    public String getMoney() {
        return Money;
    }

    public void setMoney(String money) {
        Money = money;
    }

    @JSONField(name = "EdorTransSeq")
    public String getEdorTransSeq() {
        return EdorTransSeq;
    }

    public void setEdorTransSeq(String edorTransSeq) {
        EdorTransSeq = edorTransSeq;
    }

    @JSONField(name = "BankCode")
    public String getBankCode() {
        return BankCode;
    }

    public void setBankCode(String bankCode) {
        BankCode = bankCode;
    }

    @JSONField(name = "EdorDate")
    public String getEdorDate() {
        return EdorDate;
    }

    public void setEdorDate(String edorDate) {
        EdorDate = edorDate;
    }

    @JSONField(name = "AppType")
    public String getAppType() {
        return AppType;
    }

    public void setAppType(String appType) {
        AppType = appType;
    }

    @JSONField(name = "EdorType")
    public String getEdorType() {
        return EdorType;
    }

    public void setEdorType(String edorType) {
        EdorType = edorType;
    }
    
    @JSONField(name = "ContNo")
    public String getContNo() {
        return ContNo;
    }

    public void setContNo(String contNo) {
        ContNo = contNo;
    }
    
}
