package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;
import com.guobao.dto.bq.common.LCCont;
/**
 * 
 * 【保单信息#】
 * @author guobao
 * @date 2018年1月21日 下午10:02:41 
 * @version V1.0
 */
public class ContInfo {

    //保单信息
    private LCCont LCCont;

    @JSONField(name = "LCCont")
    public LCCont getLCCont() {
        return LCCont;
    }

    public void setLCCont(LCCont lCCont) {
        LCCont = lCCont;
    }

}
