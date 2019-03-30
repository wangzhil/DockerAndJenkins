/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年5月25日
 * 修改历史 : 
 *     1. [2017年5月25日]创建文件 by guobao
 */
package com.guobao.report;

import java.util.List;

/**
 * 
 * 返回报文公共状态信息
 * 
 * @author guobao
 * @date 2017年6月20日 下午2:01:12 
 * @version V1.0
 */
public class Status {
    /**状态编码*/
    private String statuscode;
    /**状态描述*/
    private List<String> statusmessage;
    /**是否成功*/
    private String success;

    public String getStatuscode() {
        return statuscode;
    }

    public void setStatuscode(String statuscode) {
        this.statuscode = statuscode;
    }

    public List<String> getStatusmessage() {
        return statusmessage;
    }

    public void setStatusmessage(List<String> statusmessage) {
        this.statusmessage = statusmessage;
    }

    public String getSuccess() {
        return success;
    }

    public void setSuccess(String success) {
        this.success = success;
    }

}
