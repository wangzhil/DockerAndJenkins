package com.guobao.dto.bq.checkFile.req;

import java.util.List;

/**
 * 
 * 【输入数据】
 * @author guobao
 * @date 2018年1月21日 下午8:18:19 
 * @version V1.0
 */
public class InputData {

    //对账明细信息
    private List<Detail> detail;

    //笔数
    private String Count;

    //总保费
    private String Prem;

    public List<Detail> getDetail() {
        return detail;
    }

    public void setDetail(List<Detail> detail) {
        this.detail = detail;
    }

    public String getCount() {
        return Count;
    }

    public void setCount(String count) {
        Count = count;
    }

    public String getPrem() {
        return Prem;
    }

    public void setPrem(String prem) {
        Prem = prem;
    }

}
