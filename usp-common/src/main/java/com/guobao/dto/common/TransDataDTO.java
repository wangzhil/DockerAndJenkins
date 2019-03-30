package com.guobao.dto.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【对账传输数据】
 * @author guobao
 * @date 2018年1月21日 下午10:35:41 
 * @version V1.0
 */
public class TransDataDTO extends TransData {

    //输入数据
    private String InputData;

    @JSONField(name = "InputData")
    public String getInputData() {
        return InputData;
    }

    public void setInputData(String inputData) {
        InputData = inputData;
    }

}
