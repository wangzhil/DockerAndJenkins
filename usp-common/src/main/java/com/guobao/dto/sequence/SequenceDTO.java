/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.dto.sequence;

/**
 * 客户经理信息DTO
 * @author zhaowenqiang
 * @date 2017年5月16日
 * @version 1.0
 */
public class SequenceDTO {

    /**功能名*/
    private String name;
    /**序列号*/
    private Integer currentvalue;
    /**增量*/
    private Integer increment;
    /**机构编码*/
    private String organcode;
    /**号码*/
    private String sequenceno;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Integer getCurrentvalue() {
        return currentvalue;
    }

    public void setCurrentvalue(Integer currentvalue) {
        this.currentvalue = currentvalue;
    }

    public Integer getIncrement() {
        return increment;
    }

    public void setIncrement(Integer increment) {
        this.increment = increment;
    }

    public String getOrgancode() {
        return organcode;
    }

    public void setOrgancode(String organcode) {
        this.organcode = organcode;
    }

    public String getSequenceno() {
        return sequenceno;
    }

    public void setSequenceno(String sequenceno) {
        this.sequenceno = sequenceno;
    }

}
