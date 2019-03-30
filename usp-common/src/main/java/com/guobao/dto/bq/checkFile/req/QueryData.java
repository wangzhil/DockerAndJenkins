package com.guobao.dto.bq.checkFile.req;

/**
 * 
 * 【查询对账数据返回dto】
 * @author guobao
 * @date 2018年1月24日 下午5:03:41 
 * @version V1.0
 */
public class QueryData {

    //保单号
    private String contno;

    //投保单号
    private String prtno;

    //保费
    private String prem;

    //交易代码
    private String transcode;

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
