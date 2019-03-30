/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.calculate;

import java.math.BigDecimal;
import java.util.Date;

public class CalReqLcCalcuteDto {
    /**
     * 机构号
     */
    private String ManageCom;
    /**
     * 险种号
     */
    private String RiskCode;

    /**
     * 被保人账号
     */
    private String InsuAccNo;
    /**
     * 计算编码
     */
    private String CalCode;
    /**
     * 计算方式
     */
    private String CalFlag;
    /**
     * 性别
     */
    private String Sex;

    
    /**
     * 年龄
     */
    private Integer AppAge;

    /**
     * 保额
     */
    private BigDecimal Amnt;

    /**
     * 保费
     */
    private BigDecimal Prem;

    /**
     * 份数
     */
    private Integer Mult;

    /**
     * 计算类型
     */
    private String AlgorithmType;

    /**
     * 出生日期
     */
    private Date Birthday;

    /**
     * 被保人职业（工种）
     */
    private String Job;

    /**
     * 缴费间隔
     */
    private String PayIntv;

    /**
     * 保险年龄年期
     */
    private Integer InsuYear;

    /**
     * 保险年龄年期标志
     */
    private String InsuYearFlag;

    /**
     * 终交年龄年期
     */
    private Integer PayEndYear;

    /**
     * 终交年龄年期标志
     */
    private String PayEndYearFlag;
    /**
     * 现金价值
     */
    private BigDecimal CashValue;
    /**
    *保险年期
    */
    private Integer Duration;
    /**
     * 年金领取年金
     */
    private Integer GetEndPeriod;
    /**
     * 年金领取年龄
     */
    private Integer GetYear;
    /**
     *  是否有社保 
     */
    private String ssFlag;
    /**
     *  团险折扣、费率
     */
    private BigDecimal DiscountSave;
    /**
     * 计划编码
     */
    private String PlanCode;
    /**
     * VPU
     */
    private BigDecimal VPU;
    /**
     * Get
     */
    private BigDecimal Get;
    /**
     * Get
     */
    private Integer GetAge;
    /**
     * 计算0008险种，其他险种的保费之和为0008的保额
     */
    private BigDecimal OtherSumPrem;
    
    
    /**
     * 投保人性别
     */
    private String AppntSex;
    /**
     * 投保人年龄
     */
    private Integer AppntAppAge;
    /**
     * 003 险种需要健康等级
     * @return
     */
    private String HealthGrade;
    /**
     *是否有社保标志
     */
    private String SecurityFlag;
    /**
     *续保标识
     */
    private String RnewFlag;

    public void setSecurityFlag(String securityFlag) {
        SecurityFlag = securityFlag;
    }

    public String getRnewFlag() {
        return RnewFlag;
    }

    public void setRnewFlag(String rnewFlag) {
        RnewFlag = rnewFlag;
    }

    public String getSecurityFlag() {
        return SecurityFlag;
    }
	public String getHealthGrade() {
		return HealthGrade;
	}

	public void setHealthGrade(String healthGrade) {
		HealthGrade = healthGrade;
	}

	public String getAppntSex() {
		return AppntSex;
	}

	public void setAppntSex(String appntSex) {
		AppntSex = appntSex;
	}

	public Integer getAppntAppAge() {
		return AppntAppAge;
	}

	public void setAppntAppAge(Integer appntAppAge) {
		AppntAppAge = appntAppAge;
	}

	public BigDecimal getOtherSumPrem() {
		return OtherSumPrem;
	}

	public void setOtherSumPrem(BigDecimal otherSumPrem) {
		OtherSumPrem = otherSumPrem;
	}

	public Integer getGetAge() {
		return GetAge;
	}

	public void setGetAge(Integer getAge) {
		GetAge = getAge;
	}

	public BigDecimal getVPU() {
		return VPU;
	}

	public void setVPU(BigDecimal vPU) {
		VPU = vPU;
	}

	public BigDecimal getGet() {
		return Get;
	}

	public void setGet(BigDecimal get) {
		Get = get;
	}

	public String getCalCode() {
        return CalCode;
    }

    public void setCalCode(String calCode) {
        CalCode = calCode;
    }

    public String getCalFlag() {
        return CalFlag;
    }

    public void setCalFlag(String calFlag) {
        CalFlag = calFlag;
    }

    public String getSex() {
        return Sex;
    }

    public void setSex(String sex) {
        Sex = sex;
    }

    public Integer getAppAge() {
        return AppAge;
    }

    public void setAppAge(Integer appAge) {
        AppAge = appAge;
    }

    public BigDecimal getAmnt() {
        return Amnt;
    }

    public void setAmnt(BigDecimal amnt) {
        Amnt = amnt;
    }

    public BigDecimal getPrem() {
        return Prem;
    }

    public void setPrem(BigDecimal prem) {
        Prem = prem;
    }

    public Integer getMult() {
        return Mult;
    }

    public void setMult(Integer mult) {
        Mult = mult;
    }

    public String getAlgorithmType() {
        return AlgorithmType;
    }

    public void setAlgorithmType(String algorithmType) {
        AlgorithmType = algorithmType;
    }

    public Date getBirthday() {
        return Birthday;
    }

    public void setBirthday(Date birthday) {
        Birthday = birthday;
    }

    public String getJob() {
        return Job;
    }

    public void setJob(String job) {
        Job = job;
    }

    public String getPayIntv() {
        return PayIntv;
    }

    public void setPayIntv(String payIntv) {
        PayIntv = payIntv;
    }

    public Integer getInsuYear() {
        return InsuYear;
    }

    public void setInsuYear(Integer insuYear) {
        InsuYear = insuYear;
    }

    public String getInsuYearFlag() {
        return InsuYearFlag;
    }

    public void setInsuYearFlag(String insuYearFlag) {
        InsuYearFlag = insuYearFlag;
    }

    public Integer getPayEndYear() {
        return PayEndYear;
    }

    public void setPayEndYear(Integer payEndYear) {
        PayEndYear = payEndYear;
    }

    public String getPayEndYearFlag() {
        return PayEndYearFlag;
    }

    public void setPayEndYearFlag(String payEndYearFlag) {
        PayEndYearFlag = payEndYearFlag;
    }

    public BigDecimal getCashValue() {
        return CashValue;
    }

    public void setCashValue(BigDecimal cashValue) {
        CashValue = cashValue;
    }

    public Integer getDuration() {
        return Duration;
    }

    public void setDuration(Integer duration) {
        Duration = duration;
    }

    public Integer getGetEndPeriod() {
        return GetEndPeriod;
    }

    public void setGetEndPeriod(Integer getEndPeriod) {
        GetEndPeriod = getEndPeriod;
    }

    public Integer getGetYear() {
        return GetYear;
    }

    public void setGetYear(Integer getYear) {
        GetYear = getYear;
    }

    public String getSsFlag() {
        return ssFlag;
    }

    public void setSsFlag(String ssFlag) {
        this.ssFlag = ssFlag;
    }

    public BigDecimal getDiscountSave() {
        return DiscountSave;
    }

    public void setDiscountSave(BigDecimal discountSave) {
        DiscountSave = discountSave;
    }

    public String getPlanCode() {
        return PlanCode;
    }

    public void setPlanCode(String planCode) {
        PlanCode = planCode;
    }

    public String getManageCom() {
        return ManageCom;
    }

    public void setManageCom(String manageCom) {
        ManageCom = manageCom;
    }

    public String getRiskCode() {
        return RiskCode;
    }

    public void setRiskCode(String riskCode) {
        RiskCode = riskCode;
    }

    public String getInsuAccNo() {
        return InsuAccNo;
    }

    public void setInsuAccNo(String insuAccNo) {
        InsuAccNo = insuAccNo;
    }

}
