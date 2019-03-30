/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;


import com.guobao.dto.ifpinsure.LcDuty;



/**
 * 跨系统计算现价
 */
public class CalDutyPremDto {
    private LcDuty lcDuty;
    private CalReqLcCalcuteDto calReqLcCalcuteDto;

    public CalReqLcCalcuteDto getCalReqLcCalcuteDto() {
        return calReqLcCalcuteDto;
    }

    public void setCalReqLcCalcuteDto(CalReqLcCalcuteDto calReqLcCalcuteDto) {
        this.calReqLcCalcuteDto = calReqLcCalcuteDto;
    }

	public LcDuty getLcDuty() {
		return lcDuty;
	}

	public void setLcDuty(LcDuty lcDuty) {
		this.lcDuty = lcDuty;
	}
    
    
}
