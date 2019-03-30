/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.util.List;

public class InsuredValueDTO {

    private String insuredname;

    private List<PolValueDTO> polvalue;

    public String getInsuredname() {
        return insuredname;
    }

    public void setInsuredname(String insuredname) {
        this.insuredname = insuredname;
    }

    public List<PolValueDTO> getPolvalue() {
        return polvalue;
    }

    public void setPolvalue(List<PolValueDTO> polvalue) {
        this.polvalue = polvalue;
    }

}
