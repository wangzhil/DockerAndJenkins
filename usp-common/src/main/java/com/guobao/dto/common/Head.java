package com.guobao.dto.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【类或接口功能描述】
 * @author guobao
 * @date 2018年1月31日 下午3:08:15 
 * @version V1.0
 */
public class Head {

    //交易类型
    private String TransType;

    //交易代码
    private String TransCode;

    //交易柜员
    private String Operator;

    //子交易序号
    private String SubTransCode;

    //交易日期
    private String TransDate;

    //交易时间
    private String TransTime;

    //交易流水号
    private String TransSeq;

    //翻页标识
    private String PageFlag;

    //查询返回总行数
    private int TotalRowNum;

    //查询返回总行数
    private int RowNumStart;

    //每页行数
    private int PageRowNum;

    //交易结果码
    private String ResultCode;

    //交易结果描述
    private String ResultMsg;

    //交易结果描述
    private String OrderFlag;

    //交易结果描述
    private String OrderField;

    //交易结果描述
    private String PayTypeFlag;

    //交易银行
    private String TranCom;

    @JSONField(name = "TransType")
    public String getTransType() {
        return TransType;
    }

    public void setTransType(String transType) {
        TransType = transType;
    }

    @JSONField(name = "TransCode")
    public String getTransCode() {
        return TransCode;
    }

    public void setTransCode(String transCode) {
        TransCode = transCode;
    }

    @JSONField(name = "Operator")
    public String getOperator() {
        return Operator;
    }

    public void setOperator(String operator) {
        Operator = operator;
    }

    @JSONField(name = "SubTransCode")
    public String getSubTransCode() {
        return SubTransCode;
    }

    public void setSubTransCode(String subTransCode) {
        SubTransCode = subTransCode;
    }

    @JSONField(name = "TransDate")
    public String getTransDate() {
        return TransDate;
    }

    public void setTransDate(String transDate) {
        TransDate = transDate;
    }

    @JSONField(name = "TransTime")
    public String getTransTime() {
        return TransTime;
    }

    public void setTransTime(String transTime) {
        TransTime = transTime;
    }

    @JSONField(name = "TransSeq")
    public String getTransSeq() {
        return TransSeq;
    }

    public void setTransSeq(String transSeq) {
        TransSeq = transSeq;
    }

    @JSONField(name = "PageFlag")
    public String getPageFlag() {
        return PageFlag;
    }

    public void setPageFlag(String pageFlag) {
        PageFlag = pageFlag;
    }

    @JSONField(name = "TotalRowNum")
    public int getTotalRowNum() {
        return TotalRowNum;
    }

    public void setTotalRowNum(int totalRowNum) {
        TotalRowNum = totalRowNum;
    }

    @JSONField(name = "RowNumStart")
    public int getRowNumStart() {
        return RowNumStart;
    }

    public void setRowNumStart(int rowNumStart) {
        RowNumStart = rowNumStart;
    }

    @JSONField(name = "PageRowNum")
    public int getPageRowNum() {
        return PageRowNum;
    }

    public void setPageRowNum(int pageRowNum) {
        PageRowNum = pageRowNum;
    }

    @JSONField(name = "ResultCode")
    public String getResultCode() {
        return ResultCode;
    }

    public void setResultCode(String resultCode) {
        ResultCode = resultCode;
    }

    @JSONField(name = "ResultMsg")
    public String getResultMsg() {
        return ResultMsg;
    }

    public void setResultMsg(String resultMsg) {
        ResultMsg = resultMsg;
    }

    @JSONField(name = "OrderFlag")
    public String getOrderFlag() {
        return OrderFlag;
    }

    public void setOrderFlag(String orderFlag) {
        OrderFlag = orderFlag;
    }

    @JSONField(name = "OrderField")
    public String getOrderField() {
        return OrderField;
    }

    public void setOrderField(String orderField) {
        OrderField = orderField;
    }

    @JSONField(name = "PayTypeFlag")
    public String getPayTypeFlag() {
        return PayTypeFlag;
    }

    public void setPayTypeFlag(String payTypeFlag) {
        PayTypeFlag = payTypeFlag;
    }

    @JSONField(name = "TranCom")
    public String getTranCom() {
        return TranCom;
    }

    public void setTranCom(String tranCom) {
        TranCom = tranCom;
    }

}
