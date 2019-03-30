package com.guobao.dto.common;

import java.util.Date;

/**
 * 
 * 【报文相同数据】
 * 
 * @author gbifp
 * @Date 2018年3月15日 下午3:43:53
 * @version V1.0
 */
public class JsonDTO {

	/**
	 * 保全主表信息 //todo
	 */
	/** 保全受理号 */
	private String edoracceptno;
	/** 申请号码 */
	private String otherno;
	/** 申请号码类型 */
	private String othernotype;
	/** 申请人名称 */
	private String edorappname;
	/** 申请方式 */
	private String apptype;
	/** 管理机构 */
	private String managecom;
	/** 变动的保费 */
	private double chgprem;
	/** 变动的保额 */
	private double chgamnt;
	/** 变动的领取保额 */
	private double chggetamnt;
	/** 补/退费金额 */
	private double getmoney;
	/** 补/退费利息 */
	private double getinterest;
	/** 批改申请日期 */
	private Date edorappDate;
	/** 批改状态 */
	private String edorstate;
	/** 银行编码 */
	private String bankcode;
	/** 银行账号 */
	private String bankaccno;
	/** 银行账户名 */
	private String accname;
	/** 通讯地址 */
	private String postaladdress;
	/** 通讯邮编 */
	private String zipcode;
	/** 通讯电话 */
	private String phone;
	/** 打印标志 */
	private String printflag;
	/** 申请级别 */
	private String appgrade;
	/** 核保标志 */
	private String uwstate;
	/** 核保级别 */
	private String uwgrade;
	/** 核保人 */
	private String uwoperator;
	/** 核保日期 */
	private Date uwDate;
	/** 核保时间 */
	private String uwtime;
	/** 确认人 */
	private String confoperator;
	/** 确认日期 */
	private Date confDate;
	/** 确认时间 */
	private String conftime;
	/** 操作员 */
	private String operator;
	/** 入机日期 */
	private Date makeDate;
	/** 入机时间 */
	private String maketime;
	/** 最后一次修改日期 */
	private Date modifyDate;
	/** 最后一次修改时间 */
	private String modifytime;
	/** 复核状态 */
	private String approveflag;
	/** 复核人 */
	private String approveoperator;
	/** 复核日期 */
	private Date approveDate;
	/** 复核时间 */
	private String approvetime;
	/** 付款/领款人 */
	private String paygetname;
	/** 付款/领款人身份证号 */
	private String personid;
	/** 付款方式 */
	private String payform;
	/** 领款方式 */
	private String getform;
	/** 审批级别 */
	private String approvegrade;
	/** 待审批级别 */
	private String apppregrade;
	/** 保全申请归档号 */
	private String edorconfno;
	/** 代办人姓名 */
	private String behalfname;
	/** 代办人证件类型 */
	private String behalfidtype;
	/** 代办人证件号码 */
	private String behalfidno;
	/** 代办人联系电话 */
	private String behalfphone;
	/** 代办代理人编码 */
	private String behalfcode;
	/** 申请资格人联系电话 */
	private String edorappphone;
	/** 代办业务员管理机构 */
	private String behalfcodecom;
	/** 转办渠道类型 */
	private String switchchnltype;
	/** 转办渠道名称 */
	private String switchchnlname;
	/** 币别 */
	private String currency;
	/** 扫描机构 */
	private String scanmanagecom;
	/** 扫描人员 */
	private String scanoperator;
	/** 扫描日期 */
	private Date scanDate;
	/** 扫描时间 */
	private String scantime;
	/** 受理人员 */
	private String acceptoperator;
	/** 受理日期 */
	private Date acceptDate;
	/** 受理时间 */
	private String accepttime;
	/** 客户申请日期 */
	private Date appDate;
	/** 公司接收日期 */
	private Date receiveDate;
	/** 是否需要校验人员清单 */
	private String listcheckflag;
	/** 公司代码 */
	private String comcode;
	/** 最后一次修改操作员 */
	private String modifyoperator;
	/** 时效天数(工作日) */
	private int acceptworkdays;
	/** 申请渠道 */
	private String edorappchnl;
	/** 批改申请号 */
	private String edorappno;
	/** 申请人证件号码 */
	private String edorappidno;
	/** 申请人证件类型 */
	private String edorappidtype;
	/** 证件有效期 */
	private Date idexpDate;
	/** 保全申请书单证号 */
	private String doccode;
	/** 付款/领款人证件有效期 */
	private Date personidexpDate;
	/** 付款/领款人证件类型 */
	private String personidtype;
	/** 开户银行所在省 */
	private String bankprovince;
	/** 续期银行所在省 */
	private String xqbankprovince;
	/** 续期银行所在市 */
	private String xqbankcity;
	/** 银行预留手机号码 */
	private String xqbankmobile;
	/** 是否是原账户 */
	private String isoriginalaccount;

	/**
	 * 
	 * //todo
	 * 
	 * @return
	 */

	/** 批单号 */
	private String edorno;
	/** 批改类型 */
	private String edortype;
	/** 批改类型显示级别 */
	private String displaytype;
	/** 集体合同号码 */
	private String grpcontno;
	/** 合同号码 */
	private String contno;
	/** 被保人客户号码 */
	private String insuredno;
	/** 保单险种号码 */
	private String polno;
	/** 批改生效日期 */
	private Date edorvaliDate;
	/** 核保状态 */
	private String uwflag;
	/** 保全申请原因 */
	private String appreason;
	/** 保全变更原因编码 */
	private String edorreasoncode;
	/** 保全变更原因 */
	private String edorreason;
	/** 备用属性字段1 */
	private String standbyflag1;
	/** 备用属性字段2 */
	private String standbyflag2;
	/** 备用属性字段3 */
	private String standbyflag3;
	/** 批改算法 */
	private String edortypecal;

	/**
	 * 
	 * lpaddress,lpinsured,lpaddress字段
	 * 
	 * @return
	 */
	/**
	 * 
	 * lpaddress相同字段
	 * 
	 * @return
	 */
	/** 客户号码 */
	private String customerno;
	/** 地址号码 */
	private int addressno;
	/** 通讯传真 */
	private String fax;
	/** 家庭地址 */
	private String homeaddress;
	/** 家庭邮编 */
	private String homezipcode;
	/** 家庭电话 */
	private String homephone;
	/** 家庭传真 */
	private String homefax;
	/** 单位地址 */
	private String companyaddress;
	/** 单位邮编 */
	private String companyzipcode;
	/** 单位电话 */
	private String companyphone;
	/** 单位传真 */
	private String companyfax;
	/** 手机 */
	private String mobile;
	/** 手机中文标示 */
	private String mobilechs;
	/** 传呼 */
	private String bp;
	/** 手机2 */
	private String mobile2;
	/** 手机中文标示2 */
	private String mobilechs2;
	/** e_mail2 */
	private String email2;
	/** 传呼2 */
	private String bp2;
	/** 单位名称 */
	private String grpname;
	/** 省 */
	private String province;
	/** 市 */
	private String city;
	/** 区/县 */
	private String county;
	/** 联系地址省 */
	private String postalprovince;
	/** 联系地址市 */
	private String postalcity;
	/** 联系地址区 */
	private String postalcounty;
	/** 住址省编码 */
	private String homeprovince;
	/** 住址市编码 */
	private String homecity;
	/** 住址区编码 */
	private String homecounty;
	/** 联系地址省编码 */
	private String provincecode;
	/** 联系地址市编码 */
	private String citycode;
	/** 联席地址区编码 */
	private String countycode;

	/**
	 * lpinsured表相同字段 todo
	 */

	/** 印刷号码 */
	private String prtno;
	/** 投保人客户号码 */
	private String appntno;
	/** 处理机构 */
	private String executecom;
	/** 家庭保障号 */
	private String familyid;
	/** 与主被保人关系 */
	private String relationtomaininsured;
	/** 与投保人关系 */
	private String relationtoappnt;
	/** 客户内部号码 */
	private String sequenceno;
	/** 被保人名称 */
	private String name;
	/** 被保人性别 */
	private String sex;
	/** 被保人出生日期 */
	private Date birthday;
	/** 证件类型 */
	private String idtype;
	/** 证件号码 */
	private String idno;
	/** 国籍 */
	private String nativeplace;
	/** 民族 */
	private String nationality;
	/** 户口所在地 */
	private String rgtaddress;
	/** 婚姻状况 */
	private String marriage;
	/** 结婚日期 */
	private Date marriageDate;
	/** 健康状况 */
	private String health;
	/** 身高 */
	private double stature;
	/** 体重 */
	private double avoirdupois;
	/** 学历 */
	private String degree;
	/** 信用等级 */
	private String creditgrade;
	/** 入司日期 */
	private Date joincompanyDate;
	/** 参加工作日期 */
	private Date startworkDate;
	/** 职位 */
	private String position;
	/** 工资 */
	private double salary;
	/** 职业类别 */
	private String occupationtype;
	/** 职业代码 */
	private String occupationcode;
	/** 职业（工种） */
	private String worktype;
	/** 兼职（工种） */
	private String pluralitytype;
	/** 是否吸烟标志 */
	private String smokeflag;
	/** 保险计划编码 */
	private String contplancode;
	/** 被保人状态 */
	private String insuredstat;
	/** 最终核保人编码 */
	private String uwcode;
	/** 身体指标 */
	private double bmi;
	/** 被保人数目 */
	private int insuredpeoples;
	/** 驾照 */
	private String license;
	/** 驾照类型 */
	private String licensetype;
	/** 团体客户序号 */
	private int customerseqno;
	/** 社保登记号 */
	private String socialinsuno;
	/** 短消息标志 */
	private String sendmsgflag;
	/** 邮件标志 */
	private String sendmailflag;
	/** 加入保单日期 */
	private Date joincontDate;
	/** 工作证号码 */
	private String workno;
	/** 卡单编码 */
	private String certifycode;
	/** 卡单起号 */
	private String startcode;
	/** 卡单止号 */
	private String endcode;
	/** 是否有社保标志 */
	private String socialinsuflag;
	/** 子公司号码 */
	private String grpno;
	/** 组织机构代码 */
	private String organcomcode;
	/** 姓 */
	private String lastname;
	/** 名 */
	private String firstname;
	/** 英文姓 */
	private String lastnameen;
	/** 英文名 */
	private String firstnameen;
	/** 英文姓名 */
	private String nameen;
	/** 拼音姓 */
	private String lastnamepy;
	/** 拼音名 */
	private String firstnamepy;
	/** 语言 */
	private String language;
	/** 主被保人客户号 */
	private String maincustomerno;
	/** 被保险人类型 */
	private String insuredtype;
	/** 证件是否长期 */
	private String islongvalid;
	/** 证件开始日期 */
	private Date idstartDate;
	/** 被保人投保年龄 */
	private int insuredappage;
	/** 工龄 */
	private double seniority;
	/** 工作单位 */
	private String workcompname;
	/** 保障等级方案编码 */
	private String plancode;
	/** 死亡日期 */
	private Date deathDate;
	/** 黑名单标识 */
	private String blacklistflag;
	/** vip值 */
	private String vipvalue;
	/** qq信息标识 */
	private String sendqqflag;
	/** msn信息标识 */
	private String sendmsnflag;
	/** 服务区域 */
	private String serverarea;
	/** 客户群编码 */
	private String subcustomerno;
	/** 是否次标准体 */
	private String substandard;
	/** 备注 */
	private String remark;
	/** 套餐代码 */
	private String pakagecode;
	/** 前往国家/地区 */
	private String destination;
	/** 出行目的 */
	private String purpose;
	/** 紧急联系人 */
	private String emergencycontact;
	/** 紧急联系人电话 */
	private String emercontphone;
	/** 承保天数 */
	private String applytoday;
	/** 有无生育保险 */
	private String maternityflag;
	/** 急难援助卡 */
	private String rescuetype;
	/** 所在部门 */
	private String deptcode;
	/** 所在分公司 */
	private String subcompanycode;
	/** 被保险人编码 */
	private String insurecode;
	/** 工作地 */
	private String workaddress;
	/** 社保地 */
	private String socialinsuaddress;
	/** 来源保单号 */
	private String origincontno;
	/** 来源客户号 */
	private String origininsuredno;
	/** 是否拥有公费医疗和社保医疗保险 */
	private String issocialinsuflag;
	/** 居民类型 */
	private String residentstype;
	/** 是否有摩托车驾驶证 */
	private String ismotorcyclelicense;

	/**
	 * lpperson表相同字段 todo
	 */
	/** 密码 */
	private String password;
	/** 其它证件类型 */
	private String othidtype;
	/** 其它证件号码 */
	private String othidno;
	/** ic卡号 */
	private String icno;
	/** 状态 */
	private String state;
	/** 原因类别 */
	private String reasontype;
	/** 工作年限 */
	private int workingage;
	/** 服务年限 */
	private int serviceyears;
	/** 居民来源 */
	private String cityorcounty;
	/** 风险等级来源 */
	private String risksource;
	/** 维护风险等级 */
	private String highriskflag;
	/** 团险职业类别 */
	private String grpoccupationtype;
	/** 团险职业代码 */
	private String grpoccupationcode;
	/** 员工号 */
	private String workidno;
	/** 所在分公司 */
	private String componyname;
	/** 家庭年收入 */
	private String homeincome;

	/** 时间戳字段 */
	private Date upDate_time;

	/**
	 * todo lpappnt相同字段 方法功能描述
	 * 
	 * @return
	 */
	/** 投保人级别 */
	private String appntgrade;
	/** 投保人名称 */
	private String appntname;
	/** 投保人性别 */
	private String appntsex;
	/** 投保人出生日期 */
	private Date appntbirthday;
	/** 投保人类型 */
	private String appnttype;
	/** 与被保人关系 */
	private String relationtoinsured;
	/** 证件结束日期 */
	private Date idendDate;
	/** 微信标示 */
	private String wechatflag;
	/** 贷款银行 */
	private String loanbank;
	/** 贷款合同号 */
	private String loanno;
	/** 贷款金额 */
	private double loanmoney;
	/** 贷款开始日期 */
	private Date loanstartDate;
	/** 贷款结束日期 */
	private Date loanendDate;

	/**
	 * todo lpbnf相同字段 方法功能描述
	 * 
	 * @return
	 */
	/** 受益人类别 */
	private String bnftype;
	/** 受益人序号 */
	private int bnfno;
	/** 受益人级别 */
	private String bnfgrade;
	/** 受益份额 */
	private double bnflot;
	/** 英文姓名 */
	private String nanmen;
	/** 电子邮箱 */
	private String email;
	/** 是否城镇居民 */
	private String iscity;

	/**
	 * 增加lpAddress字段 方法功能描述
	 * 
	 * @return
	 */
	private String postaldetailaddress;

	/**
	 * 运维信息lywtconfirm_detail表
	 */
	private String transSeq;// 交易流水号

	private String Applychannel;// 申请渠道

	// TODO

	public String getTransSeq() {
		return transSeq;
	}

	public String getApplychannel() {
		return Applychannel;
	}

	public void setApplychannel(String applychannel) {
		Applychannel = applychannel;
	}

	public void setTransSeq(String transSeq) {
		this.transSeq = transSeq;
	}

	public String getEdoracceptno() {
		return edoracceptno;
	}

	public void setEdoracceptno(String edoracceptno) {
		this.edoracceptno = edoracceptno;
	}

	public String getOtherno() {
		return otherno;
	}

	public void setOtherno(String otherno) {
		this.otherno = otherno;
	}

	public String getOthernotype() {
		return othernotype;
	}

	public void setOthernotype(String othernotype) {
		this.othernotype = othernotype;
	}

	public String getEdorappname() {
		return edorappname;
	}

	public void setEdorappname(String edorappname) {
		this.edorappname = edorappname;
	}

	public String getApptype() {
		return apptype;
	}

	public void setApptype(String apptype) {
		this.apptype = apptype;
	}

	public String getManagecom() {
		return managecom;
	}

	public void setManagecom(String managecom) {
		this.managecom = managecom;
	}

	public double getChgprem() {
		return chgprem;
	}

	public void setChgprem(double chgprem) {
		this.chgprem = chgprem;
	}

	public double getChgamnt() {
		return chgamnt;
	}

	public void setChgamnt(double chgamnt) {
		this.chgamnt = chgamnt;
	}

	public double getChggetamnt() {
		return chggetamnt;
	}

	public void setChggetamnt(double chggetamnt) {
		this.chggetamnt = chggetamnt;
	}

	public double getGetmoney() {
		return getmoney;
	}

	public void setGetmoney(double getmoney) {
		this.getmoney = getmoney;
	}

	public double getGetinterest() {
		return getinterest;
	}

	public void setGetinterest(double getinterest) {
		this.getinterest = getinterest;
	}

	public Date getEdorappDate() {
		return edorappDate;
	}

	public void setEdorappDate(Date edorappDate) {
		this.edorappDate = edorappDate;
	}

	public String getEdorstate() {
		return edorstate;
	}

	public void setEdorstate(String edorstate) {
		this.edorstate = edorstate;
	}

	public String getBankcode() {
		return bankcode;
	}

	public void setBankcode(String bankcode) {
		this.bankcode = bankcode;
	}

	public String getBankaccno() {
		return bankaccno;
	}

	public void setBankaccno(String bankaccno) {
		this.bankaccno = bankaccno;
	}

	public String getAccname() {
		return accname;
	}

	public void setAccname(String accname) {
		this.accname = accname;
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

	public String getPhone() {
		return phone;
	}

	public void setPhone(String phone) {
		this.phone = phone;
	}

	public String getPrintflag() {
		return printflag;
	}

	public void setPrintflag(String printflag) {
		this.printflag = printflag;
	}

	public String getAppgrade() {
		return appgrade;
	}

	public void setAppgrade(String appgrade) {
		this.appgrade = appgrade;
	}

	public String getUwstate() {
		return uwstate;
	}

	public void setUwstate(String uwstate) {
		this.uwstate = uwstate;
	}

	public String getUwgrade() {
		return uwgrade;
	}

	public void setUwgrade(String uwgrade) {
		this.uwgrade = uwgrade;
	}

	public String getUwoperator() {
		return uwoperator;
	}

	public void setUwoperator(String uwoperator) {
		this.uwoperator = uwoperator;
	}

	public Date getUwDate() {
		return uwDate;
	}

	public void setUwDate(Date uwDate) {
		this.uwDate = uwDate;
	}

	public String getUwtime() {
		return uwtime;
	}

	public void setUwtime(String uwtime) {
		this.uwtime = uwtime;
	}

	public String getConfoperator() {
		return confoperator;
	}

	public void setConfoperator(String confoperator) {
		this.confoperator = confoperator;
	}

	public Date getConfDate() {
		return confDate;
	}

	public void setConfDate(Date confDate) {
		this.confDate = confDate;
	}

	public String getConftime() {
		return conftime;
	}

	public void setConftime(String conftime) {
		this.conftime = conftime;
	}

	public String getOperator() {
		return operator;
	}

	public void setOperator(String operator) {
		this.operator = operator;
	}

	public Date getMakeDate() {
		return makeDate;
	}

	public void setMakeDate(Date makeDate) {
		this.makeDate = makeDate;
	}

	public String getMaketime() {
		return maketime;
	}

	public void setMaketime(String maketime) {
		this.maketime = maketime;
	}

	public Date getModifyDate() {
		return modifyDate;
	}

	public void setModifyDate(Date modifyDate) {
		this.modifyDate = modifyDate;
	}

	public String getModifytime() {
		return modifytime;
	}

	public void setModifytime(String modifytime) {
		this.modifytime = modifytime;
	}

	public String getApproveflag() {
		return approveflag;
	}

	public void setApproveflag(String approveflag) {
		this.approveflag = approveflag;
	}

	public String getApproveoperator() {
		return approveoperator;
	}

	public void setApproveoperator(String approveoperator) {
		this.approveoperator = approveoperator;
	}

	public Date getApproveDate() {
		return approveDate;
	}

	public void setApproveDate(Date approveDate) {
		this.approveDate = approveDate;
	}

	public String getApprovetime() {
		return approvetime;
	}

	public void setApprovetime(String approvetime) {
		this.approvetime = approvetime;
	}

	public String getPaygetname() {
		return paygetname;
	}

	public void setPaygetname(String paygetname) {
		this.paygetname = paygetname;
	}

	public String getPersonid() {
		return personid;
	}

	public void setPersonid(String personid) {
		this.personid = personid;
	}

	public String getPayform() {
		return payform;
	}

	public void setPayform(String payform) {
		this.payform = payform;
	}

	public String getGetform() {
		return getform;
	}

	public void setGetform(String getform) {
		this.getform = getform;
	}

	public String getApprovegrade() {
		return approvegrade;
	}

	public void setApprovegrade(String approvegrade) {
		this.approvegrade = approvegrade;
	}

	public String getApppregrade() {
		return apppregrade;
	}

	public void setApppregrade(String apppregrade) {
		this.apppregrade = apppregrade;
	}

	public String getEdorconfno() {
		return edorconfno;
	}

	public void setEdorconfno(String edorconfno) {
		this.edorconfno = edorconfno;
	}

	public String getBehalfname() {
		return behalfname;
	}

	public void setBehalfname(String behalfname) {
		this.behalfname = behalfname;
	}

	public String getBehalfidtype() {
		return behalfidtype;
	}

	public void setBehalfidtype(String behalfidtype) {
		this.behalfidtype = behalfidtype;
	}

	public String getBehalfidno() {
		return behalfidno;
	}

	public void setBehalfidno(String behalfidno) {
		this.behalfidno = behalfidno;
	}

	public String getBehalfphone() {
		return behalfphone;
	}

	public void setBehalfphone(String behalfphone) {
		this.behalfphone = behalfphone;
	}

	public String getBehalfcode() {
		return behalfcode;
	}

	public void setBehalfcode(String behalfcode) {
		this.behalfcode = behalfcode;
	}

	public String getEdorappphone() {
		return edorappphone;
	}

	public void setEdorappphone(String edorappphone) {
		this.edorappphone = edorappphone;
	}

	public String getBehalfcodecom() {
		return behalfcodecom;
	}

	public void setBehalfcodecom(String behalfcodecom) {
		this.behalfcodecom = behalfcodecom;
	}

	public String getSwitchchnltype() {
		return switchchnltype;
	}

	public void setSwitchchnltype(String switchchnltype) {
		this.switchchnltype = switchchnltype;
	}

	public String getSwitchchnlname() {
		return switchchnlname;
	}

	public void setSwitchchnlname(String switchchnlname) {
		this.switchchnlname = switchchnlname;
	}

	public String getCurrency() {
		return currency;
	}

	public void setCurrency(String currency) {
		this.currency = currency;
	}

	public String getScanmanagecom() {
		return scanmanagecom;
	}

	public void setScanmanagecom(String scanmanagecom) {
		this.scanmanagecom = scanmanagecom;
	}

	public String getScanoperator() {
		return scanoperator;
	}

	public void setScanoperator(String scanoperator) {
		this.scanoperator = scanoperator;
	}

	public Date getScanDate() {
		return scanDate;
	}

	public void setScanDate(Date scanDate) {
		this.scanDate = scanDate;
	}

	public String getScantime() {
		return scantime;
	}

	public void setScantime(String scantime) {
		this.scantime = scantime;
	}

	public String getAcceptoperator() {
		return acceptoperator;
	}

	public void setAcceptoperator(String acceptoperator) {
		this.acceptoperator = acceptoperator;
	}

	public Date getAcceptDate() {
		return acceptDate;
	}

	public void setAcceptDate(Date acceptDate) {
		this.acceptDate = acceptDate;
	}

	public String getAccepttime() {
		return accepttime;
	}

	public void setAccepttime(String accepttime) {
		this.accepttime = accepttime;
	}

	public Date getAppDate() {
		return appDate;
	}

	public void setAppDate(Date appDate) {
		this.appDate = appDate;
	}

	public Date getReceiveDate() {
		return receiveDate;
	}

	public void setReceiveDate(Date receiveDate) {
		this.receiveDate = receiveDate;
	}

	public String getListcheckflag() {
		return listcheckflag;
	}

	public void setListcheckflag(String listcheckflag) {
		this.listcheckflag = listcheckflag;
	}

	public String getComcode() {
		return comcode;
	}

	public void setComcode(String comcode) {
		this.comcode = comcode;
	}

	public String getModifyoperator() {
		return modifyoperator;
	}

	public void setModifyoperator(String modifyoperator) {
		this.modifyoperator = modifyoperator;
	}

	public int getAcceptworkdays() {
		return acceptworkdays;
	}

	public void setAcceptworkdays(int acceptworkdays) {
		this.acceptworkdays = acceptworkdays;
	}

	public String getEdorappchnl() {
		return edorappchnl;
	}

	public void setEdorappchnl(String edorappchnl) {
		this.edorappchnl = edorappchnl;
	}

	public String getEdorappno() {
		return edorappno;
	}

	public void setEdorappno(String edorappno) {
		this.edorappno = edorappno;
	}

	public String getEdorappidno() {
		return edorappidno;
	}

	public void setEdorappidno(String edorappidno) {
		this.edorappidno = edorappidno;
	}

	public String getEdorappidtype() {
		return edorappidtype;
	}

	public void setEdorappidtype(String edorappidtype) {
		this.edorappidtype = edorappidtype;
	}

	public Date getIdexpDate() {
		return idexpDate;
	}

	public void setIdexpDate(Date idexpDate) {
		this.idexpDate = idexpDate;
	}

	public String getDoccode() {
		return doccode;
	}

	public void setDoccode(String doccode) {
		this.doccode = doccode;
	}

	public Date getPersonidexpDate() {
		return personidexpDate;
	}

	public void setPersonidexpDate(Date personidexpDate) {
		this.personidexpDate = personidexpDate;
	}

	public String getPersonidtype() {
		return personidtype;
	}

	public void setPersonidtype(String personidtype) {
		this.personidtype = personidtype;
	}

	public String getIsoriginalaccount() {
		return isoriginalaccount;
	}

	public void setIsoriginalaccount(String isoriginalaccount) {
		this.isoriginalaccount = isoriginalaccount;
	}

	public String getEdorno() {
		return edorno;
	}

	public void setEdorno(String edorno) {
		this.edorno = edorno;
	}

	public String getEdortype() {
		return edortype;
	}

	public void setEdortype(String edortype) {
		this.edortype = edortype;
	}

	public String getDisplaytype() {
		return displaytype;
	}

	public void setDisplaytype(String displaytype) {
		this.displaytype = displaytype;
	}

	public String getGrpcontno() {
		return grpcontno;
	}

	public void setGrpcontno(String grpcontno) {
		this.grpcontno = grpcontno;
	}

	public String getContno() {
		return contno;
	}

	public void setContno(String contno) {
		this.contno = contno;
	}

	public String getInsuredno() {
		return insuredno;
	}

	public void setInsuredno(String insuredno) {
		this.insuredno = insuredno;
	}

	public String getPolno() {
		return polno;
	}

	public void setPolno(String polno) {
		this.polno = polno;
	}

	public Date getEdorvaliDate() {
		return edorvaliDate;
	}

	public void setEdorvaliDate(Date edorvaliDate) {
		this.edorvaliDate = edorvaliDate;
	}

	public String getUwflag() {
		return uwflag;
	}

	public void setUwflag(String uwflag) {
		this.uwflag = uwflag;
	}

	public String getAppreason() {
		return appreason;
	}

	public void setAppreason(String appreason) {
		this.appreason = appreason;
	}

	public String getEdorreasoncode() {
		return edorreasoncode;
	}

	public void setEdorreasoncode(String edorreasoncode) {
		this.edorreasoncode = edorreasoncode;
	}

	public String getEdorreason() {
		return edorreason;
	}

	public void setEdorreason(String edorreason) {
		this.edorreason = edorreason;
	}

	public String getStandbyflag1() {
		return standbyflag1;
	}

	public void setStandbyflag1(String standbyflag1) {
		this.standbyflag1 = standbyflag1;
	}

	public String getStandbyflag2() {
		return standbyflag2;
	}

	public void setStandbyflag2(String standbyflag2) {
		this.standbyflag2 = standbyflag2;
	}

	public String getStandbyflag3() {
		return standbyflag3;
	}

	public void setStandbyflag3(String standbyflag3) {
		this.standbyflag3 = standbyflag3;
	}

	public String getEdortypecal() {
		return edortypecal;
	}

	public void setEdortypecal(String edortypecal) {
		this.edortypecal = edortypecal;
	}

	public String getCustomerno() {
		return customerno;
	}

	public void setCustomerno(String customerno) {
		this.customerno = customerno;
	}

	public int getAddressno() {
		return addressno;
	}

	public void setAddressno(int addressno) {
		this.addressno = addressno;
	}

	public String getFax() {
		return fax;
	}

	public void setFax(String fax) {
		this.fax = fax;
	}

	public String getHomeaddress() {
		return homeaddress;
	}

	public void setHomeaddress(String homeaddress) {
		this.homeaddress = homeaddress;
	}

	public String getHomezipcode() {
		return homezipcode;
	}

	public void setHomezipcode(String homezipcode) {
		this.homezipcode = homezipcode;
	}

	public String getHomephone() {
		return homephone;
	}

	public void setHomephone(String homephone) {
		this.homephone = homephone;
	}

	public String getHomefax() {
		return homefax;
	}

	public void setHomefax(String homefax) {
		this.homefax = homefax;
	}

	public String getCompanyaddress() {
		return companyaddress;
	}

	public void setCompanyaddress(String companyaddress) {
		this.companyaddress = companyaddress;
	}

	public String getCompanyzipcode() {
		return companyzipcode;
	}

	public void setCompanyzipcode(String companyzipcode) {
		this.companyzipcode = companyzipcode;
	}

	public String getCompanyphone() {
		return companyphone;
	}

	public void setCompanyphone(String companyphone) {
		this.companyphone = companyphone;
	}

	public String getCompanyfax() {
		return companyfax;
	}

	public void setCompanyfax(String companyfax) {
		this.companyfax = companyfax;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public String getMobilechs() {
		return mobilechs;
	}

	public void setMobilechs(String mobilechs) {
		this.mobilechs = mobilechs;
	}

	public String getBp() {
		return bp;
	}

	public void setBp(String bp) {
		this.bp = bp;
	}

	public String getMobile2() {
		return mobile2;
	}

	public void setMobile2(String mobile2) {
		this.mobile2 = mobile2;
	}

	public String getMobilechs2() {
		return mobilechs2;
	}

	public void setMobilechs2(String mobilechs2) {
		this.mobilechs2 = mobilechs2;
	}

	public String getEmail2() {
		return email2;
	}

	public void setEmail2(String email2) {
		this.email2 = email2;
	}

	public String getBp2() {
		return bp2;
	}

	public void setBp2(String bp2) {
		this.bp2 = bp2;
	}

	public String getGrpname() {
		return grpname;
	}

	public void setGrpname(String grpname) {
		this.grpname = grpname;
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

	public String getPostalprovince() {
		return postalprovince;
	}

	public void setPostalprovince(String postalprovince) {
		this.postalprovince = postalprovince;
	}

	public String getPostalcity() {
		return postalcity;
	}

	public void setPostalcity(String postalcity) {
		this.postalcity = postalcity;
	}

	public String getPostalcounty() {
		return postalcounty;
	}

	public void setPostalcounty(String postalcounty) {
		this.postalcounty = postalcounty;
	}

	public String getHomeprovince() {
		return homeprovince;
	}

	public void setHomeprovince(String homeprovince) {
		this.homeprovince = homeprovince;
	}

	public String getHomecity() {
		return homecity;
	}

	public void setHomecity(String homecity) {
		this.homecity = homecity;
	}

	public String getHomecounty() {
		return homecounty;
	}

	public void setHomecounty(String homecounty) {
		this.homecounty = homecounty;
	}

	public String getProvincecode() {
		return provincecode;
	}

	public void setProvincecode(String provincecode) {
		this.provincecode = provincecode;
	}

	public String getCitycode() {
		return citycode;
	}

	public void setCitycode(String citycode) {
		this.citycode = citycode;
	}

	public String getCountycode() {
		return countycode;
	}

	public void setCountycode(String countycode) {
		this.countycode = countycode;
	}

	public String getPrtno() {
		return prtno;
	}

	public void setPrtno(String prtno) {
		this.prtno = prtno;
	}

	public String getAppntno() {
		return appntno;
	}

	public void setAppntno(String appntno) {
		this.appntno = appntno;
	}

	public String getExecutecom() {
		return executecom;
	}

	public void setExecutecom(String executecom) {
		this.executecom = executecom;
	}

	public String getFamilyid() {
		return familyid;
	}

	public void setFamilyid(String familyid) {
		this.familyid = familyid;
	}

	public String getRelationtomaininsured() {
		return relationtomaininsured;
	}

	public void setRelationtomaininsured(String relationtomaininsured) {
		this.relationtomaininsured = relationtomaininsured;
	}

	public String getRelationtoappnt() {
		return relationtoappnt;
	}

	public void setRelationtoappnt(String relationtoappnt) {
		this.relationtoappnt = relationtoappnt;
	}

	public String getSequenceno() {
		return sequenceno;
	}

	public void setSequenceno(String sequenceno) {
		this.sequenceno = sequenceno;
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

	public Date getBirthday() {
		return birthday;
	}

	public void setBirthday(Date birthday) {
		this.birthday = birthday;
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

	public String getNationality() {
		return nationality;
	}

	public void setNationality(String nationality) {
		this.nationality = nationality;
	}

	public String getRgtaddress() {
		return rgtaddress;
	}

	public void setRgtaddress(String rgtaddress) {
		this.rgtaddress = rgtaddress;
	}

	public String getMarriage() {
		return marriage;
	}

	public void setMarriage(String marriage) {
		this.marriage = marriage;
	}

	public Date getMarriageDate() {
		return marriageDate;
	}

	public void setMarriageDate(Date marriageDate) {
		this.marriageDate = marriageDate;
	}

	public String getHealth() {
		return health;
	}

	public void setHealth(String health) {
		this.health = health;
	}

	public double getStature() {
		return stature;
	}

	public void setStature(double stature) {
		this.stature = stature;
	}

	public double getAvoirdupois() {
		return avoirdupois;
	}

	public void setAvoirdupois(double avoirdupois) {
		this.avoirdupois = avoirdupois;
	}

	public String getDegree() {
		return degree;
	}

	public void setDegree(String degree) {
		this.degree = degree;
	}

	public String getCreditgrade() {
		return creditgrade;
	}

	public void setCreditgrade(String creditgrade) {
		this.creditgrade = creditgrade;
	}

	public Date getJoincompanyDate() {
		return joincompanyDate;
	}

	public void setJoincompanyDate(Date joincompanyDate) {
		this.joincompanyDate = joincompanyDate;
	}

	public Date getStartworkDate() {
		return startworkDate;
	}

	public void setStartworkDate(Date startworkDate) {
		this.startworkDate = startworkDate;
	}

	public String getPosition() {
		return position;
	}

	public void setPosition(String position) {
		this.position = position;
	}

	public double getSalary() {
		return salary;
	}

	public void setSalary(double salary) {
		this.salary = salary;
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

	public String getWorktype() {
		return worktype;
	}

	public void setWorktype(String worktype) {
		this.worktype = worktype;
	}

	public String getPluralitytype() {
		return pluralitytype;
	}

	public void setPluralitytype(String pluralitytype) {
		this.pluralitytype = pluralitytype;
	}

	public String getSmokeflag() {
		return smokeflag;
	}

	public void setSmokeflag(String smokeflag) {
		this.smokeflag = smokeflag;
	}

	public String getContplancode() {
		return contplancode;
	}

	public void setContplancode(String contplancode) {
		this.contplancode = contplancode;
	}

	public String getInsuredstat() {
		return insuredstat;
	}

	public void setInsuredstat(String insuredstat) {
		this.insuredstat = insuredstat;
	}

	public String getUwcode() {
		return uwcode;
	}

	public void setUwcode(String uwcode) {
		this.uwcode = uwcode;
	}

	public double getBmi() {
		return bmi;
	}

	public void setBmi(double bmi) {
		this.bmi = bmi;
	}

	public int getInsuredpeoples() {
		return insuredpeoples;
	}

	public void setInsuredpeoples(int insuredpeoples) {
		this.insuredpeoples = insuredpeoples;
	}

	public String getLicense() {
		return license;
	}

	public void setLicense(String license) {
		this.license = license;
	}

	public String getLicensetype() {
		return licensetype;
	}

	public void setLicensetype(String licensetype) {
		this.licensetype = licensetype;
	}

	public int getCustomerseqno() {
		return customerseqno;
	}

	public void setCustomerseqno(int customerseqno) {
		this.customerseqno = customerseqno;
	}

	public String getSocialinsuno() {
		return socialinsuno;
	}

	public void setSocialinsuno(String socialinsuno) {
		this.socialinsuno = socialinsuno;
	}

	public String getSendmsgflag() {
		return sendmsgflag;
	}

	public void setSendmsgflag(String sendmsgflag) {
		this.sendmsgflag = sendmsgflag;
	}

	public String getSendmailflag() {
		return sendmailflag;
	}

	public void setSendmailflag(String sendmailflag) {
		this.sendmailflag = sendmailflag;
	}

	public Date getJoincontDate() {
		return joincontDate;
	}

	public void setJoincontDate(Date joincontDate) {
		this.joincontDate = joincontDate;
	}

	public String getWorkno() {
		return workno;
	}

	public void setWorkno(String workno) {
		this.workno = workno;
	}

	public String getCertifycode() {
		return certifycode;
	}

	public void setCertifycode(String certifycode) {
		this.certifycode = certifycode;
	}

	public String getStartcode() {
		return startcode;
	}

	public void setStartcode(String startcode) {
		this.startcode = startcode;
	}

	public String getEndcode() {
		return endcode;
	}

	public void setEndcode(String endcode) {
		this.endcode = endcode;
	}

	public String getSocialinsuflag() {
		return socialinsuflag;
	}

	public void setSocialinsuflag(String socialinsuflag) {
		this.socialinsuflag = socialinsuflag;
	}

	public String getGrpno() {
		return grpno;
	}

	public void setGrpno(String grpno) {
		this.grpno = grpno;
	}

	public String getOrgancomcode() {
		return organcomcode;
	}

	public void setOrgancomcode(String organcomcode) {
		this.organcomcode = organcomcode;
	}

	public String getLastname() {
		return lastname;
	}

	public void setLastname(String lastname) {
		this.lastname = lastname;
	}

	public String getFirstname() {
		return firstname;
	}

	public void setFirstname(String firstname) {
		this.firstname = firstname;
	}

	public String getLastnameen() {
		return lastnameen;
	}

	public void setLastnameen(String lastnameen) {
		this.lastnameen = lastnameen;
	}

	public String getFirstnameen() {
		return firstnameen;
	}

	public void setFirstnameen(String firstnameen) {
		this.firstnameen = firstnameen;
	}

	public String getNameen() {
		return nameen;
	}

	public void setNameen(String nameen) {
		this.nameen = nameen;
	}

	public String getLastnamepy() {
		return lastnamepy;
	}

	public void setLastnamepy(String lastnamepy) {
		this.lastnamepy = lastnamepy;
	}

	public String getFirstnamepy() {
		return firstnamepy;
	}

	public void setFirstnamepy(String firstnamepy) {
		this.firstnamepy = firstnamepy;
	}

	public String getLanguage() {
		return language;
	}

	public void setLanguage(String language) {
		this.language = language;
	}

	public String getMaincustomerno() {
		return maincustomerno;
	}

	public void setMaincustomerno(String maincustomerno) {
		this.maincustomerno = maincustomerno;
	}

	public String getInsuredtype() {
		return insuredtype;
	}

	public void setInsuredtype(String insuredtype) {
		this.insuredtype = insuredtype;
	}

	public String getIslongvalid() {
		return islongvalid;
	}

	public void setIslongvalid(String islongvalid) {
		this.islongvalid = islongvalid;
	}

	public Date getIdstartDate() {
		return idstartDate;
	}

	public void setIdstartDate(Date idstartDate) {
		this.idstartDate = idstartDate;
	}

	public int getInsuredappage() {
		return insuredappage;
	}

	public void setInsuredappage(int insuredappage) {
		this.insuredappage = insuredappage;
	}

	public double getSeniority() {
		return seniority;
	}

	public void setSeniority(double seniority) {
		this.seniority = seniority;
	}

	public String getWorkcompname() {
		return workcompname;
	}

	public void setWorkcompname(String workcompname) {
		this.workcompname = workcompname;
	}

	public String getPlancode() {
		return plancode;
	}

	public void setPlancode(String plancode) {
		this.plancode = plancode;
	}

	public Date getDeathDate() {
		return deathDate;
	}

	public void setDeathDate(Date deathDate) {
		this.deathDate = deathDate;
	}

	public String getBlacklistflag() {
		return blacklistflag;
	}

	public void setBlacklistflag(String blacklistflag) {
		this.blacklistflag = blacklistflag;
	}

	public String getVipvalue() {
		return vipvalue;
	}

	public void setVipvalue(String vipvalue) {
		this.vipvalue = vipvalue;
	}

	public String getSendqqflag() {
		return sendqqflag;
	}

	public void setSendqqflag(String sendqqflag) {
		this.sendqqflag = sendqqflag;
	}

	public String getSendmsnflag() {
		return sendmsnflag;
	}

	public void setSendmsnflag(String sendmsnflag) {
		this.sendmsnflag = sendmsnflag;
	}

	public String getServerarea() {
		return serverarea;
	}

	public void setServerarea(String serverarea) {
		this.serverarea = serverarea;
	}

	public String getSubcustomerno() {
		return subcustomerno;
	}

	public void setSubcustomerno(String subcustomerno) {
		this.subcustomerno = subcustomerno;
	}

	public String getSubstandard() {
		return substandard;
	}

	public void setSubstandard(String substandard) {
		this.substandard = substandard;
	}

	public String getRemark() {
		return remark;
	}

	public void setRemark(String remark) {
		this.remark = remark;
	}

	public String getPakagecode() {
		return pakagecode;
	}

	public void setPakagecode(String pakagecode) {
		this.pakagecode = pakagecode;
	}

	public String getDestination() {
		return destination;
	}

	public void setDestination(String destination) {
		this.destination = destination;
	}

	public String getPurpose() {
		return purpose;
	}

	public void setPurpose(String purpose) {
		this.purpose = purpose;
	}

	public String getEmergencycontact() {
		return emergencycontact;
	}

	public void setEmergencycontact(String emergencycontact) {
		this.emergencycontact = emergencycontact;
	}

	public String getEmercontphone() {
		return emercontphone;
	}

	public void setEmercontphone(String emercontphone) {
		this.emercontphone = emercontphone;
	}

	public String getApplytoday() {
		return applytoday;
	}

	public void setApplytoday(String applytoday) {
		this.applytoday = applytoday;
	}

	public String getMaternityflag() {
		return maternityflag;
	}

	public void setMaternityflag(String maternityflag) {
		this.maternityflag = maternityflag;
	}

	public String getRescuetype() {
		return rescuetype;
	}

	public void setRescuetype(String rescuetype) {
		this.rescuetype = rescuetype;
	}

	public String getDeptcode() {
		return deptcode;
	}

	public void setDeptcode(String deptcode) {
		this.deptcode = deptcode;
	}

	public String getSubcompanycode() {
		return subcompanycode;
	}

	public void setSubcompanycode(String subcompanycode) {
		this.subcompanycode = subcompanycode;
	}

	public String getInsurecode() {
		return insurecode;
	}

	public void setInsurecode(String insurecode) {
		this.insurecode = insurecode;
	}

	public String getWorkaddress() {
		return workaddress;
	}

	public void setWorkaddress(String workaddress) {
		this.workaddress = workaddress;
	}

	public String getSocialinsuaddress() {
		return socialinsuaddress;
	}

	public void setSocialinsuaddress(String socialinsuaddress) {
		this.socialinsuaddress = socialinsuaddress;
	}

	public String getOrigincontno() {
		return origincontno;
	}

	public void setOrigincontno(String origincontno) {
		this.origincontno = origincontno;
	}

	public String getOrigininsuredno() {
		return origininsuredno;
	}

	public void setOrigininsuredno(String origininsuredno) {
		this.origininsuredno = origininsuredno;
	}

	public String getIssocialinsuflag() {
		return issocialinsuflag;
	}

	public void setIssocialinsuflag(String issocialinsuflag) {
		this.issocialinsuflag = issocialinsuflag;
	}

	public String getResidentstype() {
		return residentstype;
	}

	public void setResidentstype(String residentstype) {
		this.residentstype = residentstype;
	}

	public String getIsmotorcyclelicense() {
		return ismotorcyclelicense;
	}

	public void setIsmotorcyclelicense(String ismotorcyclelicense) {
		this.ismotorcyclelicense = ismotorcyclelicense;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public String getOthidtype() {
		return othidtype;
	}

	public void setOthidtype(String othidtype) {
		this.othidtype = othidtype;
	}

	public String getOthidno() {
		return othidno;
	}

	public void setOthidno(String othidno) {
		this.othidno = othidno;
	}

	public String getIcno() {
		return icno;
	}

	public void setIcno(String icno) {
		this.icno = icno;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getReasontype() {
		return reasontype;
	}

	public void setReasontype(String reasontype) {
		this.reasontype = reasontype;
	}

	public int getWorkingage() {
		return workingage;
	}

	public void setWorkingage(int workingage) {
		this.workingage = workingage;
	}

	public int getServiceyears() {
		return serviceyears;
	}

	public void setServiceyears(int serviceyears) {
		this.serviceyears = serviceyears;
	}

	public String getCityorcounty() {
		return cityorcounty;
	}

	public void setCityorcounty(String cityorcounty) {
		this.cityorcounty = cityorcounty;
	}

	public String getRisksource() {
		return risksource;
	}

	public void setRisksource(String risksource) {
		this.risksource = risksource;
	}

	public String getHighriskflag() {
		return highriskflag;
	}

	public void setHighriskflag(String highriskflag) {
		this.highriskflag = highriskflag;
	}

	public String getGrpoccupationtype() {
		return grpoccupationtype;
	}

	public void setGrpoccupationtype(String grpoccupationtype) {
		this.grpoccupationtype = grpoccupationtype;
	}

	public String getGrpoccupationcode() {
		return grpoccupationcode;
	}

	public void setGrpoccupationcode(String grpoccupationcode) {
		this.grpoccupationcode = grpoccupationcode;
	}

	public String getWorkidno() {
		return workidno;
	}

	public void setWorkidno(String workidno) {
		this.workidno = workidno;
	}

	public String getComponyname() {
		return componyname;
	}

	public void setComponyname(String componyname) {
		this.componyname = componyname;
	}

	public String getHomeincome() {
		return homeincome;
	}

	public void setHomeincome(String homeincome) {
		this.homeincome = homeincome;
	}

	public Date getUpDate_time() {
		return upDate_time;
	}

	public void setUpDate_time(Date upDate_time) {
		this.upDate_time = upDate_time;
	}

	public String getAppntgrade() {
		return appntgrade;
	}

	public void setAppntgrade(String appntgrade) {
		this.appntgrade = appntgrade;
	}

	public String getAppntname() {
		return appntname;
	}

	public void setAppntname(String appntname) {
		this.appntname = appntname;
	}

	public String getAppntsex() {
		return appntsex;
	}

	public void setAppntsex(String appntsex) {
		this.appntsex = appntsex;
	}

	public Date getAppntbirthday() {
		return appntbirthday;
	}

	public void setAppntbirthday(Date appntbirthday) {
		this.appntbirthday = appntbirthday;
	}

	public String getAppnttype() {
		return appnttype;
	}

	public void setAppnttype(String appnttype) {
		this.appnttype = appnttype;
	}

	public String getRelationtoinsured() {
		return relationtoinsured;
	}

	public void setRelationtoinsured(String relationtoinsured) {
		this.relationtoinsured = relationtoinsured;
	}

	public Date getIdendDate() {
		return idendDate;
	}

	public void setIdendDate(Date idendDate) {
		this.idendDate = idendDate;
	}

	public String getWechatflag() {
		return wechatflag;
	}

	public void setWechatflag(String wechatflag) {
		this.wechatflag = wechatflag;
	}

	public String getLoanbank() {
		return loanbank;
	}

	public void setLoanbank(String loanbank) {
		this.loanbank = loanbank;
	}

	public String getLoanno() {
		return loanno;
	}

	public void setLoanno(String loanno) {
		this.loanno = loanno;
	}

	public double getLoanmoney() {
		return loanmoney;
	}

	public void setLoanmoney(double loanmoney) {
		this.loanmoney = loanmoney;
	}

	public Date getLoanstartDate() {
		return loanstartDate;
	}

	public void setLoanstartDate(Date loanstartDate) {
		this.loanstartDate = loanstartDate;
	}

	public Date getLoanendDate() {
		return loanendDate;
	}

	public void setLoanendDate(Date loanendDate) {
		this.loanendDate = loanendDate;
	}

	public String getBnftype() {
		return bnftype;
	}

	public void setBnftype(String bnftype) {
		this.bnftype = bnftype;
	}

	public int getBnfno() {
		return bnfno;
	}

	public void setBnfno(int bnfno) {
		this.bnfno = bnfno;
	}

	public String getBnfgrade() {
		return bnfgrade;
	}

	public void setBnfgrade(String bnfgrade) {
		this.bnfgrade = bnfgrade;
	}

	public double getBnflot() {
		return bnflot;
	}

	public void setBnflot(double bnflot) {
		this.bnflot = bnflot;
	}

	public String getNanmen() {
		return nanmen;
	}

	public void setNanmen(String nanmen) {
		this.nanmen = nanmen;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getIscity() {
		return iscity;
	}

	public void setIscity(String iscity) {
		this.iscity = iscity;
	}

	public String getPostaldetailaddress() {
		return postaldetailaddress;
	}

	public void setPostaldetailaddress(String postaldetailaddress) {
		this.postaldetailaddress = postaldetailaddress;
	}

	public String getXqbankprovince() {
		return xqbankprovince;
	}

	public void setXqbankprovince(String xqbankprovince) {
		this.xqbankprovince = xqbankprovince;
	}

	public String getXqbankcity() {
		return xqbankcity;
	}

	public void setXqbankcity(String xqbankcity) {
		this.xqbankcity = xqbankcity;
	}

	public String getXqbankmobile() {
		return xqbankmobile;
	}

	public void setXqbankmobile(String xqbankmobile) {
		this.xqbankmobile = xqbankmobile;
	}

	public String getBankprovince() {
		return bankprovince;
	}

	public void setBankprovince(String bankprovince) {
		this.bankprovince = bankprovince;
	}
	
}
