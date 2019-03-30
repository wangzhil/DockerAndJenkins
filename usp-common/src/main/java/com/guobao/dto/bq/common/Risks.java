package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【被保人险种信息】
 * @author guobao
 * @date 2018年1月22日 下午2:56:44 
 * @version V1.0
 */
public class Risks {

    //险种信息
    private Risk Risk;

    @JSONField(name = "Risk")
    public Risk getRisk() {
        return Risk;
    }

    public void setRisk(Risk risk) {
        Risk = risk;
    }

}
