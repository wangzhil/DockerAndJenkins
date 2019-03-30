/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

/**
 * 被保人信息
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
public class LCInsuredDTO extends LDPersonDTO {
    /**投保单号*/
    private String prtno;
    /**序号*/
    private Integer sequenceno;
    /**被保人客户号*/
    private String insuredno;
    /**与主被保人关系*/
    private String relationtomaininsured;
    /**与投保人关系*/
    private String relationtoappnt;
    /**客户地址号码*/
    private String addressno;
    /** 是否有社保  */
    private String ssflag;
    /** 团险折扣、费率 */
    private String discountsave;

    public String getDiscountsave() {
		return discountsave;
	}

	public void setDiscountsave(String discountsave) {
		this.discountsave = discountsave;
	}

	public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getInsuredno() {
        return insuredno;
    }

    public void setInsuredno(String insuredno) {
        this.insuredno = insuredno;
    }

    public String getRelationtomaininsured() {
        return relationtomaininsured;
    }

    public void setRelationtomaininsured(String relationtomaininsured) {
        this.relationtomaininsured = relationtomaininsured;
    }

    public String getRelationtoappnt() {
        return relationtoappnt;
    }

    public void setRelationtoappnt(String relationtoappnt) {
        this.relationtoappnt = relationtoappnt;
    }

    public String getAddressno() {
        return addressno;
    }

    public void setAddressno(String addressno) {
        this.addressno = addressno;
    }

    public Integer getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(Integer sequenceno) {
        this.sequenceno = sequenceno;
    }

    public String getSsflag() {
        return ssflag;
    }

    public void setSsflag(String ssflag) {
        this.ssflag = ssflag;
    }
    
    
}
