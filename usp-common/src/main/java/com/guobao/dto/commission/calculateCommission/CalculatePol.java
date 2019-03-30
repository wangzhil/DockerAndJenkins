package com.guobao.dto.commission.calculateCommission;

import java.math.BigDecimal;

public class CalculatePol {

    private String riskcode;

    private String ismainrisk;

    private String payintv;

    private Integer payendyear;

    private BigDecimal prem;

    public String getRiskcode() {
        return riskcode;
    }

    public void setRiskcode(String riskcode) {
        this.riskcode = riskcode;
    }

    public String getIsmainrisk() {
        return ismainrisk;
    }

    public void setIsmainrisk(String ismainrisk) {
        this.ismainrisk = ismainrisk;
    }

    public String getPayintv() {
        return payintv;
    }

    public void setPayintv(String payintv) {
        this.payintv = payintv;
    }

    public Integer getPayendyear() {
        return payendyear;
    }

    public void setPayendyear(Integer payendyear) {
        this.payendyear = payendyear;
    }

    public BigDecimal getPrem() {
        return prem;
    }

    public void setPrem(BigDecimal prem) {
        this.prem = prem;
    }

}
