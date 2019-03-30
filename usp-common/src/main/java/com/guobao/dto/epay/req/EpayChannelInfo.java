/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.req;

/**  
 * 【类或接口功能描述】
 * @author guobao
 * @date 2017年6月26日 下午2:25:30 
 * @version V1.0  
*/
public class EpayChannelInfo {
    /**代理人编号*/
    private String agent;
    /**客户端*/
    private String clientSystem;
    /**销售渠道*/
    private String sellingChannel;
    /***/
    private String agency;
    /***/
    private String clientManager;

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getClientSystem() {
        return clientSystem;
    }

    public void setClientSystem(String clientSystem) {
        this.clientSystem = clientSystem;
    }

    public String getSellingChannel() {
        return sellingChannel;
    }

    public void setSellingChannel(String sellingChannel) {
        this.sellingChannel = sellingChannel;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getClientManager() {
        return clientManager;
    }

    public void setClientManager(String clientManager) {
        this.clientManager = clientManager;
    }

}
