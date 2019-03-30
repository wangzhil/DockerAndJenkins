package com.guobao.dto.ifpinsure;

public class LdBankCode {
    private String bankcode;

    private String bankcom;

    private String bankdesc;

    public String getBankcode() {
        return bankcode;
    }

    public void setBankcode(String bankcode) {
        this.bankcode = bankcode == null ? null : bankcode.trim();
    }

    public String getBankcom() {
        return bankcom;
    }

    public void setBankcom(String bankcom) {
        this.bankcom = bankcom == null ? null : bankcom.trim();
    }

    public String getBankdesc() {
        return bankdesc;
    }

    public void setBankdesc(String bankdesc) {
        this.bankdesc = bankdesc == null ? null : bankdesc.trim();
    }
}