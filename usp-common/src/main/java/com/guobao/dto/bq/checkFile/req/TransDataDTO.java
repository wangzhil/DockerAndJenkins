package com.guobao.dto.bq.checkFile.req;

import com.guobao.dto.common.TransData;

/**
 * 
 * 【发送数据dto】
 * @author guobao
 * @date 2018年1月21日 下午8:15:53 
 * @version V1.0
 */
public class TransDataDTO extends TransData{

    //输入数据
    private InputData InputData;

    public InputData getInputData() {
        return InputData;
    }

    public void setInputData(InputData inputData) {
        InputData = inputData;
    }
}
