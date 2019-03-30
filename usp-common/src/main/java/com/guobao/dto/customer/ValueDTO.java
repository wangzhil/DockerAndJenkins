/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.math.BigDecimal;

public class ValueDTO {
    /**现价年度*/
    private int cashyear;
    /**现价*/
    private BigDecimal value;

    public int getCashyear() {
        return cashyear;
    }

    public void setCashyear(int cashyear) {
        this.cashyear = cashyear;
    }

    public BigDecimal getValue() {
        return value;
    }

    public void setValue(BigDecimal value) {
        this.value = value;
    }

}
