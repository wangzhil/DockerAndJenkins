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
public class UwCalcuteInfo {
	private String calCode;//核保规则编码
    private String msg;//核保提示信息
    
	public String getCalCode() {
		return calCode;
	}
	public void setCalCode(String calCode) {
		this.calCode = calCode;
	}
	public String getMsg() {
		return msg;
	}
	public void setMsg(String msg) {
		this.msg = msg;
	}
    
}
