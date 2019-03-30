package com.guobao.dto.bq.checkFile.req;

/**
 * 
 * 【新单对账请求报文】
 * @author guobao
 * @date 2018年1月19日 下午1:52:19 
 * @version V1.0
 */
public class CheckFileReq {

    //传输数据
    private TransDataDTO transData;

    public TransDataDTO getTransData() {
        return transData;
    }

    public void setTransData(TransDataDTO transData) {
        this.transData = transData;
    }

}
