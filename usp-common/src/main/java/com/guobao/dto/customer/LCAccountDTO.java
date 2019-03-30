/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

/**
 * 客户信息DTO
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
public class LCAccountDTO {

    /**客户经理*/
    private String agentcode;

    /**客户号码*/
    private String customerno;
    /**
     * 投保单号
     */
    private String prtno;

    /**银行编码*/
    private String bankcode;

    /**银行帐号*/
    private String bankaccno;

    /**银行帐户名*/
    private String accname;
    
    /**支付方式*/
    private String payMode;

    /** 客户年龄上限 */
    private String ageup;

    /** 客户年龄下限 */
    private String agedown;

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    public String getBankaccno() {
        return bankaccno;
    }

    public void setBankaccno(String bankaccno) {
        this.bankaccno = bankaccno;
    }

    public String getAccname() {
        return accname;
    }

    public void setAccname(String accname) {
        this.accname = accname;
    }

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getAgeup() {
        return ageup;
    }

    public void setAgeup(String ageup) {
        this.ageup = ageup;
    }

    public String getAgedown() {
        return agedown;
    }

    public void setAgedown(String agedown) {
        this.agedown = agedown;
    }

	public String getPayMode() {
		return payMode;
	}

	public void setPayMode(String payMode) {
		this.payMode = payMode;
	}
    
    

}
