package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【被保人信息】
 * @author guobao
 * @date 2018年1月22日 下午2:54:09 
 * @version V1.0
 */
public class LCInsures {

    //被保人信息
    private LCInsured LCInsured;

    @JSONField(name = "LCInsured")
    public LCInsured getLCInsured() {
        return LCInsured;
    }

    public void setLCInsured(LCInsured lCInsured) {
        LCInsured = lCInsured;
    }

}
