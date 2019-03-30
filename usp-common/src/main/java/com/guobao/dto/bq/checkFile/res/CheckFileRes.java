package com.guobao.dto.bq.checkFile.res;

import com.guobao.dto.common.TransDataDTO;

/**
 * 
 * 【新单对账返回报文】
 * @author guobao
 * @date 2018年1月19日 下午1:52:19 
 * @version V1.0
 */
public class CheckFileRes {

    //对账传输数据
    private TransDataDTO TransData;

    public TransDataDTO getTransData() {
        return TransData;
    }

    public void setTransData(TransDataDTO transData) {
        TransData = transData;
    }

}
