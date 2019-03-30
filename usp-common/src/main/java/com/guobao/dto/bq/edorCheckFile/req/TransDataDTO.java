package com.guobao.dto.bq.edorCheckFile.req;

import com.alibaba.fastjson.annotation.JSONField;
import com.guobao.dto.common.TransData;

/**
 * 
 * 【发送数据dto】
 * @author guobao
 * @date 2018年1月21日 下午8:15:53 
 * @version V1.0
 */
public class TransDataDTO extends TransData {

    //数据数据
    private InputData InputData;

    @JSONField(name = "InputData")
    public InputData getInputData() {
        return InputData;
    }

    public void setInputData(InputData inputData) {
        InputData = inputData;
    }

}
