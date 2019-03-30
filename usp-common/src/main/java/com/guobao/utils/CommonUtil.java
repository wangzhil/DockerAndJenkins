package com.guobao.utils;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import com.guobao.dto.common.Head;
import com.guobao.dto.qry.common.HeadData;
import com.guobao.report.Status;

/**
 * 
 * 公用方法
 * 
 * @date 2017年6月14日 下午4:33:13
 * @version V1.0
 */
public class CommonUtil {

	/**
	 * 封装返回Head
	 * 
	 * @param returnHeadData
	 * @return HeadData
	 */
	public static Head returnHead(Head head, String resultCode, String resultDesc) {
		head.setResultCode(resultCode);
		head.setResultMsg(resultDesc);
		String currentDate = DateUtil.getStringFORMAT_DATE_DEFAULT();
		head.setTransDate(currentDate);
		String currentTime = DateUtil.getStringFORMAT_DATE_TIME();
		head.setTransTime(currentTime);
		return head;
	}
	
	
	/**
	 * 封装返回HeadData
	 * 
	 * @param returnHeadData
	 * @return HeadData
	 */
	public static HeadData returnHeadData(HeadData resHeadData, String resultCode, String resultDesc) {
		resHeadData.setRESP_CODE(resultCode);
		resHeadData.setERR_MEASSGE(resultDesc);
		String currentTime = DateUtil.getDateStr(DateUtil.getCurrentDate(), DateUtil.FORMAT_HOUR_DATE_TIME1);
		resHeadData.setTRANS_DATE(currentTime);
		return resHeadData;
	}

	/**
	 * 
	 * 封装Status信息
	 * 
	 * @param statuscode
	 *            01/02/03/200/500
	 * @param succ
	 *            Y/N
	 * @param msgs
	 * @return
	 * @throws Exception
	 */
	public static Status setStatus(String statuscode, String succ, String... msgs) {
		List<String> msgList = new ArrayList<>();
		if (msgs.length != 0)
			msgList = Arrays.asList(msgs);
		else
			msgList.add("");
		return setStatus(statuscode, succ, msgList);
	}

	/**
	 * 
	 * 封装Status信息
	 * 
	 * @param statuscode
	 *            01/02/03/200/500
	 * @param succ
	 *            Y/N
	 * @param msgList
	 * @return
	 * @throws Exception
	 */
	public static Status setStatus(String statuscode, String succ, List<String> msgList) {
		Status status = new Status();
		status.setStatuscode(statuscode);
		status.setSuccess(succ);
		status.setStatusmessage(msgList);
		return status;
	}

	/**
	 * 
	 * 调用核心url
	 * 
	 * @param requestUrl
	 *            请求地址
	 * @param requestUrl
	 *            请求信息
	 * @return String
	 */
	@SuppressWarnings("static-access")
	public static String invokeUrl(String requestUrl, String requestData) {
		HttpClientUtil httpClientUtil = new HttpClientUtil();
		return httpClientUtil.request(requestUrl, requestData);
	}
	
	/**
	 * 
	 * @param stature 单位：cm
	 * @param avoirdupois   单位： kg
	 * @return
	 */
	public static BigDecimal CalBMI(BigDecimal stature,BigDecimal avoirdupois){
		stature = stature.divide(new BigDecimal(100));
		stature = stature.multiply(stature);
		BigDecimal bmi = avoirdupois.divide(stature,0);
		return bmi;
	}
}
