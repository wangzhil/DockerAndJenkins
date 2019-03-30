package com.guobao.dto.bq.edorCheckFile.req;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【输入数据】
 * @author guobao
 * @date 2018年1月21日 下午8:18:19 
 * @version V1.0
 */
public class InputData {

    //对账明细信息
    private WebEdorBalance WebEdorBalance;

    //总笔数
    private String Count;

    //总收费金额
    private String SumPayMoney;

    //总给付金额
    private String SumGetMoney;

    //申请方式
    private String AppType;

    @JSONField(name = "WebEdorBalance")
    public WebEdorBalance getWebEdorBalance() {
        return WebEdorBalance;
    }

    public void setWebEdorBalance(WebEdorBalance webEdorBalance) {
        WebEdorBalance = webEdorBalance;
    }

    @JSONField(name = "Count")
    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    @JSONField(name = "SumPayMoney")
    public String getSumPayMoney() {
        return SumPayMoney;
    }

    public void setSumPayMoney(String sumPayMoney) {
        SumPayMoney = sumPayMoney;
    }

    @JSONField(name = "SumGetMoney")
    public String getSumGetMoney() {
        return SumGetMoney;
    }

    public void setSumGetMoney(String sumGetMoney) {
        SumGetMoney = sumGetMoney;
    }

    @JSONField(name = "AppType")
    public String getAppType() {
        return AppType;
    }

    public void setAppType(String appType) {
        AppType = appType;
    }

}
