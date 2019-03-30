/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

/**
 * 执行核保规则要素
 */
public class UwCalcuteDto {
	private String riskCode;//000000时为公共规则
    private String uwType;//lmuw核保类型
    private String fieldName;//lmcheckfield核保类型
    private UwCalcuteParamsDto uwCalcuteParamsDto;//核保规则对应参数
    private String pelapoltype;
    
    
    public String getPelapoltype() {
		return pelapoltype;
	}
	public void setPelapoltype(String pelapoltype) {
		this.pelapoltype = pelapoltype;
	}
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getUwType() {
		return uwType;
	}
	public void setUwType(String uwType) {
		this.uwType = uwType;
	}
	public String getFieldName() {
		return fieldName;
	}
	public void setFieldName(String fieldName) {
		this.fieldName = fieldName;
	}
	public UwCalcuteParamsDto getUwCalcuteParamsDto() {
		return uwCalcuteParamsDto;
	}
	public void setUwCalcuteParamsDto(UwCalcuteParamsDto uwCalcuteParamsDto) {
		this.uwCalcuteParamsDto = uwCalcuteParamsDto;
	}
    
}
