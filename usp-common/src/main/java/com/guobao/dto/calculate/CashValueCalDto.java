/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

import java.util.List;

import com.guobao.dto.ifpinsure.LcDuty;



/**
 * 跨系统计算现价
 */
public class CashValueCalDto {
    private String riskCode;
    private List<LcDuty> lcDutyList;
    private CalReqLcCalcuteDto calReqLcCalcuteDto;

    public String getRiskCode() {
        return riskCode;
    }

    public void setRiskCode(String riskCode) {
        this.riskCode = riskCode;
    }

    public CalReqLcCalcuteDto getCalReqLcCalcuteDto() {
        return calReqLcCalcuteDto;
    }

    public void setCalReqLcCalcuteDto(CalReqLcCalcuteDto calReqLcCalcuteDto) {
        this.calReqLcCalcuteDto = calReqLcCalcuteDto;
    }

	public List<LcDuty> getLcDutyList() {
		return lcDutyList;
	}

	public void setLcDutyList(List<LcDuty> lcDutyList) {
		this.lcDutyList = lcDutyList;
	}
    
    
}
