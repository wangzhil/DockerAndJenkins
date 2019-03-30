package com.guobao.dto.common;

/**
 * 
 * 【保全费用】
 * @author gbifp
 * @date 2018年3月6日 下午2:44:15 
 * @version V1.0
 */
public class BqFeeDTO {

    private double TBMoney;//退保金额

    private double AccBala;//现金价值

    private double GBMoney;//工本费

    private double SumPrem;//总保费

    public double getTBMoney() {
        return TBMoney;
    }

    public void setTBMoney(double tBMoney) {
        TBMoney = tBMoney;
    }

    public double getAccBala() {
        return AccBala;
    }

    public void setAccBala(double accBala) {
        AccBala = accBala;
    }

    public double getGBMoney() {
        return GBMoney;
    }

    public void setGBMoney(double gBMoney) {
        GBMoney = gBMoney;
    }

    public double getSumPrem() {
        return SumPrem;
    }

    public void setSumPrem(double sumPrem) {
        SumPrem = sumPrem;
    }

}
