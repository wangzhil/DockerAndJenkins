package com.guobao.dto.ifpinsure;

import java.math.BigDecimal;
import java.util.Date;

public class LcPayment {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.sid
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private Integer sid;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.PrtNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String prtno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.BankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String bankcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.BankName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String bankname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.BankCardNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String bankcardno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.BankCardName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String bankcardname;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.PayMoney
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private BigDecimal paymoney;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.PayDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private Date paydate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.EnterAccDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private Date enteraccdate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.InsBankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String insbankcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.InsBankAccNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String insbankaccno;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.Currency
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String currency;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.Message
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String message;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.Status
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private String status;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.MakeDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private Date makedate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column lcpayment.ModifyDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    private Date modifydate;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.sid
     *
     * @return the value of lcpayment.sid
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public Integer getSid() {
        return sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.sid
     *
     * @param sid the value for lcpayment.sid
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setSid(Integer sid) {
        this.sid = sid;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.PrtNo
     *
     * @return the value of lcpayment.PrtNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getPrtno() {
        return prtno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.PrtNo
     *
     * @param prtno the value for lcpayment.PrtNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setPrtno(String prtno) {
        this.prtno = prtno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.BankCode
     *
     * @return the value of lcpayment.BankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getBankcode() {
        return bankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.BankCode
     *
     * @param bankcode the value for lcpayment.BankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setBankcode(String bankcode) {
        this.bankcode = bankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.BankName
     *
     * @return the value of lcpayment.BankName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getBankname() {
        return bankname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.BankName
     *
     * @param bankname the value for lcpayment.BankName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setBankname(String bankname) {
        this.bankname = bankname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.BankCardNo
     *
     * @return the value of lcpayment.BankCardNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getBankcardno() {
        return bankcardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.BankCardNo
     *
     * @param bankcardno the value for lcpayment.BankCardNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setBankcardno(String bankcardno) {
        this.bankcardno = bankcardno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.BankCardName
     *
     * @return the value of lcpayment.BankCardName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getBankcardname() {
        return bankcardname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.BankCardName
     *
     * @param bankcardname the value for lcpayment.BankCardName
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setBankcardname(String bankcardname) {
        this.bankcardname = bankcardname;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.PayMoney
     *
     * @return the value of lcpayment.PayMoney
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public BigDecimal getPaymoney() {
        return paymoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.PayMoney
     *
     * @param paymoney the value for lcpayment.PayMoney
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setPaymoney(BigDecimal paymoney) {
        this.paymoney = paymoney;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.PayDate
     *
     * @return the value of lcpayment.PayDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public Date getPaydate() {
        return paydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.PayDate
     *
     * @param paydate the value for lcpayment.PayDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setPaydate(Date paydate) {
        this.paydate = paydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.EnterAccDate
     *
     * @return the value of lcpayment.EnterAccDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public Date getEnteraccdate() {
        return enteraccdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.EnterAccDate
     *
     * @param enteraccdate the value for lcpayment.EnterAccDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setEnteraccdate(Date enteraccdate) {
        this.enteraccdate = enteraccdate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.InsBankCode
     *
     * @return the value of lcpayment.InsBankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getInsbankcode() {
        return insbankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.InsBankCode
     *
     * @param insbankcode the value for lcpayment.InsBankCode
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setInsbankcode(String insbankcode) {
        this.insbankcode = insbankcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.InsBankAccNo
     *
     * @return the value of lcpayment.InsBankAccNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getInsbankaccno() {
        return insbankaccno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.InsBankAccNo
     *
     * @param insbankaccno the value for lcpayment.InsBankAccNo
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setInsbankaccno(String insbankaccno) {
        this.insbankaccno = insbankaccno;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.Currency
     *
     * @return the value of lcpayment.Currency
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.Currency
     *
     * @param currency the value for lcpayment.Currency
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setCurrency(String currency) {
        this.currency = currency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.Message
     *
     * @return the value of lcpayment.Message
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getMessage() {
        return message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.Message
     *
     * @param message the value for lcpayment.Message
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setMessage(String message) {
        this.message = message;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.Status
     *
     * @return the value of lcpayment.Status
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public String getStatus() {
        return status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.Status
     *
     * @param status the value for lcpayment.Status
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setStatus(String status) {
        this.status = status;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.MakeDate
     *
     * @return the value of lcpayment.MakeDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public Date getMakedate() {
        return makedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.MakeDate
     *
     * @param makedate the value for lcpayment.MakeDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setMakedate(Date makedate) {
        this.makedate = makedate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column lcpayment.ModifyDate
     *
     * @return the value of lcpayment.ModifyDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public Date getModifydate() {
        return modifydate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column lcpayment.ModifyDate
     *
     * @param modifydate the value for lcpayment.ModifyDate
     *
     * @mbggenerated Wed Jan 31 13:48:06 CST 2018
     */
    public void setModifydate(Date modifydate) {
        this.modifydate = modifydate;
    }
}