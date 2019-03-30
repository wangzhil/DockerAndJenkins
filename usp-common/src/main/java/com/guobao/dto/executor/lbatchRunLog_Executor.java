package com.guobao.dto.executor;

public class lbatchRunLog_Executor {

	//自增长id
	private int Id;
	//判断哪个批量的id
	private String JobId;
	//时间规则 
	private String JobCorn;
	//开始跑批时间
	private String StartTime;
	//跑批结束时间
	private String EndTime;
	//实际数据查询起时间
	private String RealSTime;
	//实际数据查询末时间
	private String RealETime;
	//跑批花费时间
	private String UseTime;
	//存入数据条数
	private long Amounts;
	//跑批成功与否
	private String State;
	//失败原因或者成功
	private String Remark;
	//全量是否跑过标记
	private String JobFlag;
	
	public int getId() {
		return Id;
	}
	public void setId(int id) {
		Id = id;
	}
	public String getJobId() {
		return JobId;
	}
	public void setJobId(String jobId) {
		JobId = jobId;
	}
	public String getJobCorn() {
		return JobCorn;
	}
	public void setJobCorn(String jobCorn) {
		JobCorn = jobCorn;
	}
	public String getStartTime() {
		return StartTime;
	}
	public void setStartTime(String startTime) {
		StartTime = startTime;
	}
	public String getEndTime() {
		return EndTime;
	}
	public void setEndTime(String endTime) {
		EndTime = endTime;
	}
	public String getRealSTime() {
		return RealSTime;
	}
	public void setRealSTime(String realSTime) {
		RealSTime = realSTime;
	}
	public String getRealETime() {
		return RealETime;
	}
	public void setRealETime(String realETime) {
		RealETime = realETime;
	}
	public String getUseTime() {
		return UseTime;
	}
	public void setUseTime(String useTime) {
		UseTime = useTime;
	}
	public long getAmounts() {
		return Amounts;
	}
	public void setAmounts(long amounts) {
		Amounts = amounts;
	}
	public String getState() {
		return State;
	}
	public void setState(String state) {
		State = state;
	}
	public String getRemark() {
		return Remark;
	}
	public void setRemark(String remark) {
		Remark = remark;
	}
	public String getJobFlag() {
		return JobFlag;
	}
	public void setJobFlag(String jobFlag) {
		JobFlag = jobFlag;
	}
	
	
}
