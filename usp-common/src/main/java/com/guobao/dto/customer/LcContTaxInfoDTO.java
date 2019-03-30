/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月31日
 * 修改历史 : 
 *     1. [2017年5月31日]创建文件 by guobao
 */
package com.guobao.dto.customer;

import java.util.List;

/**
 * 
 * 税收居民信息
 * @author guobao
 * @date 2017年11月8日 下午3:26:05 
 * @version V1.0
 */
public class LcContTaxInfoDTO {
    //姓
    private String beforname;
    //名
    private String rearname;
    //现居地址英文
    private String currentaddress;
    //出生地拼写选择 中文CHA拼音或英文ENG
    private String addresschinaorenglish;
    //出生地址中文
    private String birthaddresschina;
    //出生地址英文
    private String birthaddress;
    //税收居民纳税信息
    private List<LcContTaxIdentInfoDTO> taxidentinfo;

    public String getBeforname() {
        return beforname;
    }

    public void setBeforname(String beforname) {
        this.beforname = beforname;
    }

    public String getRearname() {
        return rearname;
    }

    public void setRearname(String rearname) {
        this.rearname = rearname;
    }

    public String getAddresschinaorenglish() {
        return addresschinaorenglish;
    }

    public void setAddresschinaorenglish(String addresschinaorenglish) {
        this.addresschinaorenglish = addresschinaorenglish;
    }

    public String getBirthaddresschina() {
        return birthaddresschina;
    }

    public void setBirthaddresschina(String birthaddresschina) {
        this.birthaddresschina = birthaddresschina;
    }

    public String getCurrentaddress() {
        return currentaddress;
    }

    public void setCurrentaddress(String currentaddress) {
        this.currentaddress = currentaddress;
    }

    public String getBirthaddress() {
        return birthaddress;
    }

    public void setBirthaddress(String birthaddress) {
        this.birthaddress = birthaddress;
    }

    public List<LcContTaxIdentInfoDTO> getTaxidentinfo() {
        return taxidentinfo;
    }

    public void setTaxidentinfo(List<LcContTaxIdentInfoDTO> taxidentinfo) {
        this.taxidentinfo = taxidentinfo;
    }

}
