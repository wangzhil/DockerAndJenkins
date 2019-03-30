package com.guobao.dto.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【报文共同部分】
 * @author guobao
 * @date 2018年1月22日 上午10:38:02 
 * @version V1.0
 */
public class TransData {

    private Head BaseInfo;

    @JSONField(name = "BaseInfo")
    public Head getBaseInfo() {
    return BaseInfo;}

    public void setBaseInfo(Head baseInfo) {
        BaseInfo = baseInfo;
    }

    

}
