/**
 * @Copyright ®2018 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2018年3月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

import java.util.List;

public class UwcalcuteRecDto {

    private String riskCode;
    private String uwPassFlag;
    private List<UwUnPassRuleInfo> uwUnPassRuleInfo;
	public String getRiskCode() {
		return riskCode;
	}
	public void setRiskCode(String riskCode) {
		this.riskCode = riskCode;
	}
	public String getUwPassFlag() {
		return uwPassFlag;
	}
	public void setUwPassFlag(String uwPassFlag) {
		this.uwPassFlag = uwPassFlag;
	}
	public List<UwUnPassRuleInfo> getUwUnPassRuleInfo() {
		return uwUnPassRuleInfo;
	}
	public void setUwUnPassRuleInfo(List<UwUnPassRuleInfo> uwUnPassRuleInfo) {
		this.uwUnPassRuleInfo = uwUnPassRuleInfo;
	}

    

}
