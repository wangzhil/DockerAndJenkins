package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【投保人信息】
 * @author guobao
 * @date 2018年1月22日 下午2:52:29 
 * @version V1.0
 */
public class LCAppnt {

    //证件类型
    private String AppntIDType;

    //证件号码
    private String AppntIDNo;

    //姓名
    private String AppntName;

    @JSONField(name = "AppntIDType")
    public String getAppntIDType() {
        return AppntIDType;
    }

    public void setAppntIDType(String appntIDType) {
        AppntIDType = appntIDType;
    }

    @JSONField(name = "AppntIDNo")
    public String getAppntIDNo() {
        return AppntIDNo;
    }

    public void setAppntIDNo(String appntIDNo) {
        AppntIDNo = appntIDNo;
    }

    @JSONField(name = "AppntName")
    public String getAppntName() {
        return AppntName;
    }

    public void setAppntName(String appntName) {
        AppntName = appntName;
    }

}
