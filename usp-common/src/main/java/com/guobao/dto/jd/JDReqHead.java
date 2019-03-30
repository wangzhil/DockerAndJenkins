package com.guobao.dto.jd;

import com.alibaba.fastjson.annotation.JSONField;

/**
 * 统一经代报文请求头信息
 * @author wangzl
 *
 */
public class JDReqHead {

    private String REQ_APP_ID;
	
	private String RESP_APP_ID;
	
	private String ID;
	
	private String TRANS_ID;
	
	private String TRANS_CODE;
	
	private String TRANS_DATE;
	
	private String AGENTCOM;
	
	private String USERID;
	
	private String PASSWORD;	

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

	@JSONField(name = "TRANS_CODE")
	public String getTRANS_CODE() {
		return TRANS_CODE;
	}

	public void setTRANS_CODE(String tRANS_CODE) {
		TRANS_CODE = tRANS_CODE;
	}

	@JSONField(name = "TRANS_DATE")
	public String getTRANS_DATE() {
		return TRANS_DATE;
	}

	public void setTRANS_DATE(String tRANS_DATE) {
		TRANS_DATE = tRANS_DATE;
	}

	@JSONField(name = "AGENTCOM")
	public String getAGENTCOM() {
		return AGENTCOM;
	}

	public void setAGENTCOM(String aGENTCOM) {
		AGENTCOM = aGENTCOM;
	}

	@JSONField(name = "USERID")
	public String getUSERID() {
		return USERID;
	}

	public void setUSERID(String uSERID) {
		USERID = uSERID;
	}

	@JSONField(name = "PASSWORD")
	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}
}
