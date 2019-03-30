package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class QryReqContentData {

	private String Name;
	private String Sex;
	private String IdType;
	private String IdNo;
	private String Birthday;

	private String OrganCode;// 机构号
	private String ChannelCode;// 渠道

	@JSONField(name = "OrganCode")
	public String getOrganCode() {
		return OrganCode;
	}

	public void setOrganCode(String organCode) {
		OrganCode = organCode;
	}

	@JSONField(name = "ChannelCode")
	public String getChannelCode() {
		return ChannelCode;
	}

	public void setChannelCode(String channelCode) {
		ChannelCode = channelCode;
	}

	@JSONField(name = "Name")
	public String getName() {
		return Name;
	}

	public void setName(String name) {
		Name = name;
	}

	@JSONField(name = "Sex")
	public String getSex() {
		return Sex;
	}

	public void setSex(String sex) {
		Sex = sex;
	}

	@JSONField(name = "IdType")
	public String getIdType() {
		return IdType;
	}

	public void setIdType(String idType) {
		IdType = idType;
	}

	@JSONField(name = "IdNo")
	public String getIdNo() {
		return IdNo;
	}

	public void setIdNo(String idNo) {
		IdNo = idNo;
	}

	@JSONField(name = "Birthday")
	public String getBirthday() {
		return Birthday;
	}

	public void setBirthday(String birthday) {
		Birthday = birthday;
	}

}
