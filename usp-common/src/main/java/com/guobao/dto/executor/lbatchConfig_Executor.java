package com.guobao.dto.executor;

public class lbatchConfig_Executor {

	//批处理唯一id标识
	private int JobCode;
	//代表批处理当前时间规则
	private String JobCorn;
	//批处理的具体意义
	private String JobName;
	//该批处理执行类
	private String JobClass;
	//配置时间
	private String MakeTime;
	//修改时间
	private String ModifyTime;
	//是否可用标志
	private String UsedFlag;

	public String getUsedFlag() {
		return UsedFlag;
	}

	public void setUsedFlag(String usedFlag) {
		UsedFlag = usedFlag;
	}

	public int getJobCode() {
		return JobCode;
	}

	public void setJobCode(int jobCode) {
		JobCode = jobCode;
	}

	public String getJobCorn() {
		return JobCorn;
	}

	public void setJobCorn(String jobCorn) {
		JobCorn = jobCorn;
	}

	public String getJobName() {
		return JobName;
	}

	public void setJobName(String jobName) {
		JobName = jobName;
	}

	public String getJobClass() {
		return JobClass;
	}

	public void setJobClass(String jobClass) {
		JobClass = jobClass;
	}

	public String getMakeTime() {
		return MakeTime;
	}

	public void setMakeTime(String makeTime) {
		MakeTime = makeTime;
	}

	public String getModifyTime() {
		return ModifyTime;
	}

	public void setModifyTime(String modifyTime) {
		ModifyTime = modifyTime;
	}
	
	
}
