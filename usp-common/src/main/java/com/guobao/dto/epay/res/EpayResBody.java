/**
 * @Copyright ®2017 guobao Co. Ltd. All rights reserved.<br/>
 * 项目名称 : 国宝人寿业务前置平台系统
 * 创建日期 : 2017年6月26日
 * 修改历史 : 
 *     1. [2017年6月26日]创建文件 by guobao
 */
package com.guobao.dto.epay.res;

import com.guobao.dto.epay.req.EpayOrder;
import com.guobao.report.Status;

/**  
 * 【支付报文】
 * @author guobao
 * @date 2017年6月26日 下午1:25:57 
 * @version V1.0  
*/
public class EpayResBody {

    private Status status;

    private EpayOrder order;

    private TransPaymentItem transPaymentItem;

    public Status getStatus() {
        return status;
    }

    public void setStatus(Status status) {
        this.status = status;
    }

    public EpayOrder getOrder() {
        return order;
    }

    public void setOrder(EpayOrder order) {
        this.order = order;
    }

    public TransPaymentItem getTransPaymentItem() {
        return transPaymentItem;
    }

    public void setTransPaymentItem(TransPaymentItem transPaymentItem) {
        this.transPaymentItem = transPaymentItem;
    }

}
