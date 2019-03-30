package com.guobao.dto.bq.toLis.res;

/**
 * 
 * 【返回报文头】
 * @author guobao
 * @date 2018年1月26日 上午9:52:13 
 * @version V1.0
 */
public class EbizResHead {

    //交易流水号
    private String serialNo;

    //交易时间
    private String transTime;

    //返回编码
    private String resultCode;

    //返回信息
    private String resultDesc;

    //交易编码
    private String transCode;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

    public String getResultCode() {
        return resultCode;
    }

    public void setResultCode(String resultCode) {
        this.resultCode = resultCode;
    }

    public String getResultDesc() {
        return resultDesc;
    }

    public void setResultDesc(String resultDesc) {
        this.resultDesc = resultDesc;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }
    
}
