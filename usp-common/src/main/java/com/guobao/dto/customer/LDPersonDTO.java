/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.math.BigDecimal;
import java.util.Date;

/**
 * 客户信息DTO
 * @author guobao
 * @date 2017年5月16日
 * @version 1.0
 */
/**
 * 
 * 
 * @author guobao
 * @date 2017年6月20日 下午2:01:12 
 * @version V1.0
 */
public class LDPersonDTO {
    /**客户号码*/
    private String customerno;
    /**客户姓名*/
    private String name;
    /**客户姓名拼音*/
    private String pinyinname;
    /**客户性别*/
    private String sex;
    /**客户出生日期*/
    private String birthday;
    /**计算年龄*/
    private Integer age;
    /**证件类型*/
    private String idtype;
    /**证件号码*/
    private String idno;
    /**证件有效期*/
    private String idvalid;
    /**国籍*/
    private String nativeplace;
    /**身高*/
    private BigDecimal stature;
    /**体重*/
    private BigDecimal avoirdupois;
    /**工资*/
    private BigDecimal salary;
    /**职业类别*/
    private String occupationtype;
    /**职业代码*/
    private String occupationcode;
    /**入机时间*/
    private String makedate;
    /**最后处理时间*/
    private Date modifydate;
    /**是否通过实名认证*/
    private String isauthentication;
    /**客户信息是否完整*/
    private String iscomplete;
    /**对应的证件照正面URL*/
    private String infrontimg;
    /**对应的证件照背面URL*/
    private String inbackimg;
    /**客户账户信息*/
    private LCAccountDTO lcaccount;
    /**客户地址信息*/
    private LCAddressDTO lcaddress;
    ///////////客户管理需要额外添加的
    /**客户经理*/
    private String agentcode;
    /**投保人客户号*/
    private String relationcustomerno;
    /**与投保人关系*/
    private String relationtype;
    /**证件有效期*/
    private String cardusefuldate;
    /**客户来源*/
    private String customersource;
    //新增字段
    /**是否签名标志。投保人，被保人*/
    private String issign;
    /**签名字符串*/
    private String sign;
    /**签名加密字符串*/
    private String encryptsign;
    /**银行卡正面*/
    private String pyfrontimg;
    /**银行卡反面*/
    private String pybackimg;
    //新增字段
    /**居民类型：城镇居民、农村居民*/
    private String residenttype;
    /**家庭收入*/
    private BigDecimal familyyearincome;
    /**保险金额*/
    private BigDecimal insurancemoney;
    /**税收居民身份*/
    private String  currenttype;
    /**税收居民信息*/
    private LcContTaxInfoDTO taxinfo;

    public String getAgentcode() {
        return agentcode;
    }

    public void setAgentcode(String agentcode) {
        this.agentcode = agentcode;
    }

    public String getCustomerno() {
        return customerno;
    }

    public void setCustomerno(String customerno) {
        this.customerno = customerno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    public String getIdtype() {
        return idtype;
    }

    public void setIdtype(String idtype) {
        this.idtype = idtype;
    }

    public String getIdno() {
        return idno;
    }

    public void setIdno(String idno) {
        this.idno = idno;
    }

    public String getNativeplace() {
        return nativeplace;
    }

    public void setNativeplace(String nativeplace) {
        this.nativeplace = nativeplace;
    }

    public String getOccupationtype() {
        return occupationtype;
    }

    public void setOccupationtype(String occupationtype) {
        this.occupationtype = occupationtype;
    }

    public String getOccupationcode() {
        return occupationcode;
    }

    public void setOccupationcode(String occupationcode) {
        this.occupationcode = occupationcode;
    }

    public String getMakedate() {
        return makedate;
    }

    public void setMakedate(String makedate) {
        this.makedate = makedate;
    }

    public Date getModifydate() {
        return modifydate;
    }

    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }

    public String getIsauthentication() {
        return isauthentication;
    }

    public void setIsauthentication(String isauthentication) {
        this.isauthentication = isauthentication;
    }

    public LCAccountDTO getLcaccount() {
        return lcaccount;
    }

    public void setLcaccount(LCAccountDTO lcaccount) {
        this.lcaccount = lcaccount;
    }

    public LCAddressDTO getLcaddress() {
        return lcaddress;
    }

    public void setLcaddress(LCAddressDTO lcaddress) {
        this.lcaddress = lcaddress;
    }

    public String getCustomersource() {
        return customersource;
    }

    public void setCustomersource(String customersource) {
        this.customersource = customersource;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public BigDecimal getStature() {
        return stature;
    }

    public void setStature(BigDecimal stature) {
        this.stature = stature;
    }

    public BigDecimal getAvoirdupois() {
        return avoirdupois;
    }

    public void setAvoirdupois(BigDecimal avoirdupois) {
        this.avoirdupois = avoirdupois;
    }

    public BigDecimal getSalary() {
        return salary;
    }

    public void setSalary(BigDecimal salary) {
        this.salary = salary;
    }

    public String getRelationcustomerno() {
        return relationcustomerno;
    }

    public void setRelationcustomerno(String relationcustomerno) {
        this.relationcustomerno = relationcustomerno;
    }

    public String getRelationtype() {
        return relationtype;
    }

    public void setRelationtype(String relationtype) {
        this.relationtype = relationtype;
    }

    public String getCardusefuldate() {
        return cardusefuldate;
    }

    public void setCardusefuldate(String cardusefuldate) {
        this.cardusefuldate = cardusefuldate;
    }

    public String getIdvalid() {
        return idvalid;
    }

    public void setIdvalid(String idvalid) {
        this.idvalid = idvalid;
    }

    public String getIssign() {
        return issign;
    }

    public void setIssign(String issign) {
        this.issign = issign;
    }

    public String getSign() {
        return sign;
    }

    public void setSign(String sign) {
        this.sign = sign;
    }

    public String getEncryptsign() {
        return encryptsign;
    }

    public void setEncryptsign(String encryptsign) {
        this.encryptsign = encryptsign;
    }

    public String getPyfrontimg() {
        return pyfrontimg;
    }

    public void setPyfrontimg(String pyfrontimg) {
        this.pyfrontimg = pyfrontimg;
    }

    public String getPybackimg() {
        return pybackimg;
    }

    public void setPybackimg(String pybackimg) {
        this.pybackimg = pybackimg;
    }

    public String getResidenttype() {
        return residenttype;
    }

    public void setResidenttype(String residenttype) {
        this.residenttype = residenttype;
    }

    public BigDecimal getFamilyyearincome() {
        return familyyearincome;
    }

    public void setFamilyyearincome(BigDecimal familyyearincome) {
        this.familyyearincome = familyyearincome;
    }

    public BigDecimal getInsurancemoney() {
        return insurancemoney;
    }

    public void setInsurancemoney(BigDecimal insurancemoney) {
        this.insurancemoney = insurancemoney;
    }

    public String getIscomplete() {
        return iscomplete;
    }

    public void setIscomplete(String iscomplete) {
        this.iscomplete = iscomplete;
    }

    public String getInfrontimg() {
        return infrontimg;
    }

    public void setInfrontimg(String infrontimg) {
        this.infrontimg = infrontimg;
    }

    public String getInbackimg() {
        return inbackimg;
    }

    public void setInbackimg(String inbackimg) {
        this.inbackimg = inbackimg;
    }

    public String getPinyinname() {
        return pinyinname;
    }

    public void setPinyinname(String pinyinname) {
        this.pinyinname = pinyinname;
    }

    public String getCurrenttype() {
        return currenttype;
    }

    public void setCurrenttype(String currenttype) {
        this.currenttype = currenttype;
    }

    public LcContTaxInfoDTO getTaxinfo() {
        return taxinfo;
    }

    public void setTaxinfo(LcContTaxInfoDTO taxinfo) {
        this.taxinfo = taxinfo;
    }

  
}
