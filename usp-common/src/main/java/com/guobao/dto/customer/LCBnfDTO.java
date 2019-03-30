/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.math.BigDecimal;

/**
 * 受益人信息
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
public class LCBnfDTO extends LDPersonDTO {

    /**序号*/
    private String sequenceno;
    /**投保单号*/
    private String prtno;
    /**险种号*/
    private String polno;
    /**被保人客户号码*/
    private String insuredno;
    /**受益人类别*/
    private String bnftype;
    /**受益人客户号码*/
    private String bnfno;
    /**受益人级别*/
    private String bnfgrade;
    /**与被保人关系*/
    private String relationtoinsured;
    /**受益份额*/
    private BigDecimal bnflot;
    /**客户地址号码*/
    private String addressno;
    /**客户生日*/
    private String birthday;
    /**客户经理*/
    private String agentcode;
    /**客户号码*/
    private String customerno;
    /**银行编码*/
    private String bankcode;

    /**银行帐号*/
    private String bankaccno;
    
    /**银行帐户名*/
    private String accname;
    
    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno;
    }

    public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getPolno() {
        return polno;
    }

    public void setPolno(String polno) {
        this.polno = polno;
    }

    public String getInsuredno() {
        return insuredno;
    }

    public void setInsuredno(String insuredno) {
        this.insuredno = insuredno;
    }

    public String getBnftype() {
        return bnftype;
    }

    public void setBnftype(String bnftype) {
        this.bnftype = bnftype;
    }

    public String getBnfno() {
        return bnfno;
    }

    public void setBnfno(String bnfno) {
        this.bnfno = bnfno;
    }

    public String getBnfgrade() {
        return bnfgrade;
    }

    public void setBnfgrade(String bnfgrade) {
        this.bnfgrade = bnfgrade;
    }

    public String getRelationtoinsured() {
        return relationtoinsured;
    }

    public void setRelationtoinsured(String relationtoinsured) {
        this.relationtoinsured = relationtoinsured;
    }

    public BigDecimal getBnflot() {
        return bnflot;
    }

    public void setBnflot(BigDecimal bnflot) {
        this.bnflot = bnflot;
    }

    public String getAddressno() {
        return addressno;
    }

    public void setAddressno(String addressno) {
        this.addressno = addressno;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

	public String getAgentcode() {
		return agentcode;
	}

	public void setAgentcode(String agentcode) {
		this.agentcode = agentcode;
	}

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
    
    

}
