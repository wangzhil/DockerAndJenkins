package com.guobao.dto.finance.query.req;

public class IN {
  
	//收款指令流水号                     必录            
	private String RdSeq;
	//签名信息
	private String S3Sign;
	
	public String getRdSeq() {
		return RdSeq;
	}
	public void setRdSeq(String rdSeq) {
		RdSeq = rdSeq;
	}
	public String getS3Sign() {
		return S3Sign;
	}
	public void setS3Sign(String s3Sign) {
		S3Sign = s3Sign;
	}	
	
	
	
	
}
