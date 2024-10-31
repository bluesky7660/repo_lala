package com.lalaping.complaint;

import com.lalaping.infra.util.BaseVo;

public class ComplaintVo extends BaseVo{
	private String sessSeqXdm;
//	답변 vo
	private Integer shRcType;
	private Integer shAwStatus;
//	민원vo
	private Integer shRcStatus;
//	-------------------------------
	public Integer getShRcType() {
		return shRcType;
	}
	public void setShRcType(Integer shRcType) {
		this.shRcType = shRcType;
	}
	public Integer getShAwStatus() {
		return shAwStatus;
	}
	public void setShAwStatus(Integer shAwStatus) {
		this.shAwStatus = shAwStatus;
	}
	public Integer getShRcStatus() {
		return shRcStatus;
	}
	public void setShRcStatus(Integer shRcStatus) {
		this.shRcStatus = shRcStatus;
	}
	public String getSessSeqXdm() {
		return sessSeqXdm;
	}
	public void setSessSeqXdm(String sessSeqXdm) {
		this.sessSeqXdm = sessSeqXdm;
	}
	
	
	
	
}
