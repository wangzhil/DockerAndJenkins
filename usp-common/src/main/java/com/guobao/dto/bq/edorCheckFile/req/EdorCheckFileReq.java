package com.guobao.dto.bq.edorCheckFile.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【保全对账请求报文】 
 * @author guobao
 * @date 2018年1月19日 下午1:52:19 
 * @version V1.0
 */
public class EdorCheckFileReq {

    //传输数据
    private TransDataDTO TransData;

    
    @JSONField(name = "TransData")
    public TransDataDTO getTransData() {
        return TransData;
    }

    public void setTransData(TransDataDTO transData) {
        TransData = transData;
    }

}
