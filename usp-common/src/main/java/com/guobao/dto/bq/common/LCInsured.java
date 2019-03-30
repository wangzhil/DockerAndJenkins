package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【被保人信息】
 * @author guobao
 * @date 2018年1月22日 下午2:55:04 
 * @version V1.0
 */
public class LCInsured {

    //被保人姓名
    private String InsuredName;

    //被保人险种信息
    private Risks Risks;

    @JSONField(name = "InsuredName")
    public String getInsuredName() {
        return InsuredName;
    }

    public void setInsuredName(String insuredName) {
        InsuredName = insuredName;
    }

    @JSONField(name = "Risks")
    public Risks getRisks() {
        return Risks;
    }

    public void setRisks(Risks risks) {
        Risks = risks;
    }

}
