/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

/**
 * 客户信息DTO
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
public class LCAddressDTO {
    /**客户号码*/
    private String customerno;
    /**
     * 投保单号
     */
    private String prtno;
    /** 地址号*/
    private String addressno;
    /**省*/
    private String province;

    /**市*/
    private String city;

    /**区/县*/
    private String county;

    /**详细地址*/
    private String postaladdress;

    /**邮编*/
    private String zipcode;

    /**手机*/
    private String mobile;

    /**邮箱*/
    private String email;
    ////////////////////新增字段，满足承保推送核心接口使用
    /**工作单位*/
    private String company;
    /**固定电话号码*/
    private String phone;
    //身高
    private String stature;
    //體重
    private String avoirdupois;
    //年收入
    private String  salary;
    //家庭年收入
    private String familyYearInCome;
    
    

    public String getStature() {
        return stature;
    }

    public void setStature(String stature) {
        this.stature = stature;
    }

    public String getAvoirdupois() {
        return avoirdupois;
    }

    public void setAvoirdupois(String avoirdupois) {
        this.avoirdupois = avoirdupois;
    }

    public String getSalary() {
        return salary;
    }

    public void setSalary(String salary) {
        this.salary = salary;
    }

    public String getFamilyYearInCome() {
        return familyYearInCome;
    }

    public void setFamilyYearInCome(String familyYearInCome) {
        this.familyYearInCome = familyYearInCome;
    }

    public String getCompany() {
        return company;
    }

    public void setCompany(String company) {
        this.company = company;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getProvince() {
        return province;
    }

    public void setProvince(String province) {
        this.province = province;
    }

    public String getCity() {
        return city;
    }

    public void setCity(String city) {
        this.city = city;
    }

    public String getCounty() {
        return county;
    }

    public void setCounty(String county) {
        this.county = county;
    }

    public String getPostaladdress() {
        return postaladdress;
    }

    public void setPostaladdress(String postaladdress) {
        this.postaladdress = postaladdress;
    }

    public String getZipcode() {
        return zipcode;
    }

    public void setZipcode(String zipcode) {
        this.zipcode = zipcode;
    }

    public String getMobile() {
        return mobile;
    }

    public void setMobile(String mobile) {
        this.mobile = mobile;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPrtno() {
        return prtno;
    }

    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    public String getAddressno() {
        return addressno;
    }

    public void setAddressno(String addressno) {
        this.addressno = addressno;
    }
}
