package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

public class LCPolNo {

    @JSONField(name = "PolNo")
    private String PolNo;

    public String getPolNo() {
        return PolNo;
    }

    public void setPolNo(String polNo) {
        PolNo = polNo;
    }

}
