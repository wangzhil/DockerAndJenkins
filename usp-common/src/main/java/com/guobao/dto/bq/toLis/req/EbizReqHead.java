package com.guobao.dto.bq.toLis.req;

/**
 * 
 * 【请求报文头】
 * @author guobao
 * @date 2018年1月26日 上午9:58:10 
 * @version V1.0
 */
public class EbizReqHead {

    //交易流水号
    private String serialNo;

    //交易编码
    private String transCode;

    //渠道编码
    private String channelCode;

    //交易时间
    private String transTime;

    public String getSerialNo() {
        return serialNo;
    }

    public void setSerialNo(String serialNo) {
        this.serialNo = serialNo;
    }

    public String getTransCode() {
        return transCode;
    }

    public void setTransCode(String transCode) {
        this.transCode = transCode;
    }

    public String getChannelCode() {
        return channelCode;
    }

    public void setChannelCode(String channelCode) {
        this.channelCode = channelCode;
    }

    public String getTransTime() {
        return transTime;
    }

    public void setTransTime(String transTime) {
        this.transTime = transTime;
    }

}
