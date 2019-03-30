package com.guobao.utils;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Random;

public class GetSerialNoUtil {

	/**
	 * 获取20位流水号
	 * 
	 * @return
	 */
	public static String getSerialNo() {
		// 格式化当前时间
		SimpleDateFormat sfDate = new SimpleDateFormat("yyyyMMddHHmmssSSS");
		// 得到17位时间如：20181211094039080
		String strDate = sfDate.format(new Date());
		// 为了防止高并发重复,再获取3个随机数
		String random = getRandom620(3);
		String serialNo = strDate + random;
		return serialNo;
	}

	/**
	 * 获取6-10 的随机位数数字
	 * 
	 * @param length 想要生成的长度
	 *            
	 * @return result
	 */
	private static String getRandom620(Integer length) {
		String result = "";
		Random rand = new Random();
		int n = 20;
		if (null != length && length > 0) {
			n = length;
		}
		int randInt = 0;
		for (int i = 0; i < n; i++) {
			randInt = rand.nextInt(10);
			result += randInt;
		}
		return result;
	}
	
	public static void main(String[] args) {
		System.out.println(getSerialNo());
	}
}
