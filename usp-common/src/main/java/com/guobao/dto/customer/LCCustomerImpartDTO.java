/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

/**  
 * 【告知信息】
 * @author guobao
 * @date 2017年5月31日 下午4:19:58 
 * @version V1.0  
*/
public class LCCustomerImpartDTO {
    /**保单号码*/
    private String contno;
    /**投保单号码*/
    private String prtno;
    /**客户号码*/
    private String customerno;
    
    private String customertype;
    /**告知编码*/
    private String impartcode;
    /**告知版本*/
    private String impartver;
    /**告知内容*/
    private String impartcontent;
    /**告知参数*/
    private String impartparams;
    /**告知说明*/
    private String impartexplanation;
    
    private String makeDate;
    
    private String  modifydate;

    public String getMakeDate() {
        return makeDate;
    }

    public void setMakeDate(String makeDate) {
        this.makeDate = makeDate;
    }

    public String getModifydate() {
        return modifydate;
    }

    public void setModifydate(String modifydate) {
        this.modifydate = modifydate;
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

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getImpartcode() {
        return impartcode;
    }

    public void setImpartcode(String impartcode) {
        this.impartcode = impartcode;
    }

    public String getImpartver() {
        return impartver;
    }

    public void setImpartver(String impartver) {
        this.impartver = impartver;
    }

    public String getImpartcontent() {
        return impartcontent;
    }

    public void setImpartcontent(String impartcontent) {
        this.impartcontent = impartcontent;
    }

    public String getImpartparams() {
        return impartparams;
    }

    public void setImpartparams(String impartparams) {
        this.impartparams = impartparams;
    }

    public String getImpartexplanation() {
        return impartexplanation;
    }

    public void setImpartexplanation(String impartexplanation) {
        this.impartexplanation = impartexplanation;
    }

    public String getCustomertype() {
        return customertype;
    }

    public void setCustomertype(String customertype) {
        this.customertype = customertype;
    }

}
