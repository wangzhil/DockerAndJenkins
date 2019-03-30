package com.guobao.dto.common;

import java.math.BigDecimal;

/**
 * 
 * 【查询对账数据返回dto】
 * @author guobao
 * @date 2018年1月24日 下午5:03:41 
 * @version V1.0
 */
public class NbCheckQueryData {

    /**
     * 新单对账
     */
    //保单号
    private String contno;

    //投保单号
    private String prtno;

    //保费
    private String prem;

    //交易代码
    private String transcode;

    
    /**
     * 保全对账
     */
    //交易申请号
    private String EdorTransSeq;

    //退保金额
    private BigDecimal Money;

    public BigDecimal getMoney() {
        return Money;
    }

    public void setMoney(BigDecimal money) {
        Money = money;
    }

    public String getEdorTransSeq() {
        return EdorTransSeq;
    }

    public void setEdorTransSeq(String edorTransSeq) {
        EdorTransSeq = edorTransSeq;
    }

    public String getContno() {
        return contno;
    }

    public void setContno(String contno) {
        this.contno = contno;
    }

    public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getPrem() {
        return prem;
    }

    public void setPrem(String prem) {
        this.prem = prem;
    }

    public String getTranscode() {
        return transcode;
    }

    public void setTranscode(String transcode) {
        this.transcode = transcode;
    }

}
