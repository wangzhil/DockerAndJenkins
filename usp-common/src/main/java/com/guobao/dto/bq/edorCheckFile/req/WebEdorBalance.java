package com.guobao.dto.bq.edorCheckFile.req;

import java.util.ArrayList;
import java.util.List;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 
 * 【明细信息】
 * @author guobao
 * @date 2018年1月21日 下午10:26:14 
 * @version V1.0
 */
public class WebEdorBalance {

    //明细信息
    private List<Detail> Detail = new ArrayList<Detail>();

    @JSONField(name = "Detail")
    public List<Detail> getDetail() {
        return Detail;
    }

    public void setDetail(List<Detail> detail) {
        Detail = detail;
    }

}
