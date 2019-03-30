/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.util.List;

public class PolValueDTO {

    private String riskname;

    private String bnfsummary;

    private List<ValueDTO> value;

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname;
    }

    public String getBnfsummary() {
        return bnfsummary;
    }

    public void setBnfsummary(String bnfsummary) {
        this.bnfsummary = bnfsummary;
    }

    public List<ValueDTO> getValue() {
        return value;
    }

    public void setValue(List<ValueDTO> value) {
        this.value = value;
    }

}
