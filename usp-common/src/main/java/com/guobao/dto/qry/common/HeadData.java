package com.guobao.dto.qry.common;

import com.alibaba.fastjson.annotation.JSONField;

public class HeadData {

	private String REQ_APP_ID;

	private String RESP_APP_ID;

	private String ID;

	private String TRANS_ID;

	private String TRANS_DATE;

	private String RESP_CODE;

	private String ERR_MEASSGE;

	private String TRANS_CODE;
	
	@JSONField(name = "TRANS_CODE")
	public String getTRANS_CODE() {
		return TRANS_CODE;
	}

	public void setTRANS_CODE(String tRANS_CODE) {
		TRANS_CODE = tRANS_CODE;
	}

	@JSONField(name = "RESP_CODE")
	public String getRESP_CODE() {
		return RESP_CODE;
	}

	public void setRESP_CODE(String rESP_CODE) {
		RESP_CODE = rESP_CODE;
	}

	@JSONField(name = "ERR_MEASSGE")
	public String getERR_MEASSGE() {
		return ERR_MEASSGE;
	}

	public void setERR_MEASSGE(String eRR_MEASSGE) {
		ERR_MEASSGE = eRR_MEASSGE;
	}

	@JSONField(name = "REQ_APP_ID")
	public String getREQ_APP_ID() {
		return REQ_APP_ID;
	}

	public void setREQ_APP_ID(String rEQ_APP_ID) {
		REQ_APP_ID = rEQ_APP_ID;
	}

	@JSONField(name = "RESP_APP_ID")
	public String getRESP_APP_ID() {
		return RESP_APP_ID;
	}

	public void setRESP_APP_ID(String rESP_APP_ID) {
		RESP_APP_ID = rESP_APP_ID;
	}

	@JSONField(name = "ID")
	public String getID() {
		return ID;
	}

	public void setID(String iD) {
		ID = iD;
	}

	@JSONField(name = "TRANS_ID")
	public String getTRANS_ID() {
		return TRANS_ID;
	}

	public void setTRANS_ID(String tRANS_ID) {
		TRANS_ID = tRANS_ID;
	}

	@JSONField(name = "TRANS_DATE")
	public String getTRANS_DATE() {
		return TRANS_DATE;
	}

	public void setTRANS_DATE(String tRANS_DATE) {
		TRANS_DATE = tRANS_DATE;
	}

}
