package com.guobao.dto.bq.common;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【保单信息】
 * @author guobao
 * @date 2018年1月21日 下午10:03:53 
 * @version V1.0
 */
public class LCCont {

    //保单号
    private String ContNo;

    //银行地区代码
    private String ZoneNo;

    //银行网点代码
    private String BrNo;

    //银行柜员代码
    private String TellerNo;

    //保单生效日期
    private String Cvalidate;

    //保单有效止期
    private String EndDate;

    //保单红利
    private String EndBonus;

    //投保人信息
    private LCAppnt LCAppnt;

    //被保人信息
    private LCInsures LCInsures;

    @JSONField(name = "ContNo")
    public String getContNo() {
        return ContNo;
    }

    public void setContNo(String contNo) {
        ContNo = contNo;
    }

    @JSONField(name = "ZoneNo")
    public String getZoneNo() {
        return ZoneNo;
    }

    public void setZoneNo(String zoneNo) {
        ZoneNo = zoneNo;
    }

    @JSONField(name = "BrNo")
    public String getBrNo() {
        return BrNo;
    }

    public void setBrNo(String brNo) {
        BrNo = brNo;
    }

    @JSONField(name = "TellerNo")
    public String getTellerNo() {
        return TellerNo;
    }

    public void setTellerNo(String tellerNo) {
        TellerNo = tellerNo;
    }

    @JSONField(name = "Cvalidate")
    public String getCvalidate() {
        return Cvalidate;
    }

    public void setCvalidate(String cvalidate) {
        Cvalidate = cvalidate;
    }

    @JSONField(name = "EndDate")
    public String getEndDate() {
        return EndDate;
    }

    public void setEndDate(String endDate) {
        EndDate = endDate;
    }

    @JSONField(name = "EndBonus")
    public String getEndBonus() {
        return EndBonus;
    }

    public void setEndBonus(String endBonus) {
        EndBonus = endBonus;
    }

    @JSONField(name = "LCAppnt")
    public LCAppnt getLCAppnt() {
        return LCAppnt;
    }

    public void setLCAppnt(LCAppnt lCAppnt) {
        LCAppnt = lCAppnt;
    }

    @JSONField(name = "LCInsures")
    public LCInsures getLCInsures() {
        return LCInsures;
    }

    public void setLCInsures(LCInsures lCInsures) {
        LCInsures = lCInsures;
    }

}
