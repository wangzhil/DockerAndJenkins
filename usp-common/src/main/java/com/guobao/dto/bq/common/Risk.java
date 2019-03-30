package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【险种信息】
 * @author guobao
 * @date 2018年1月22日 下午2:57:46 
 * @version V1.0
 */
public class Risk {

    //主险代码
    private String MainRiskCode;

    //主险名称
    private String MainRiskName;

    @JSONField(name = "MainRiskCode")
    public String getMainRiskCode() {
        return MainRiskCode;
    }

    public void setMainRiskCode(String mainRiskCode) {
        MainRiskCode = mainRiskCode;
    }

    @JSONField(name = "MainRiskName")
    public String getMainRiskName() {
        return MainRiskName;
    }

    public void setMainRiskName(String mainRiskName) {
        MainRiskName = mainRiskName;
    }

}
