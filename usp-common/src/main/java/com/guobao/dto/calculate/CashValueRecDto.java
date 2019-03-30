/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

import java.util.List;

import com.guobao.dto.customer.ValueDTO;

public class CashValueRecDto {

    private String riskname;
    private List<ValueDTO> valuelist;

    public String getRiskname() {
        return riskname;
    }

    public void setRiskname(String riskname) {
        this.riskname = riskname;
    }

    public List<ValueDTO> getValuelist() {
        return valuelist;
    }

    public void setValuelist(List<ValueDTO> valuelist) {
        this.valuelist = valuelist;
    }

}
