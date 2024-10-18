package com.lalaping.afterReport;

import java.util.Date;

import com.lalaping.infra.util.BaseVo;

public class AfterReportVo extends BaseVo{
	
	private String arSeq;
	private Date arRegDate;
	private Date arModDate;
	//-------------------------------
	public String getArSeq() {
		return arSeq;
	}
	public void setArSeq(String arSeq) {
		this.arSeq = arSeq;
	}
	public Date getArRegDate() {
		return arRegDate;
	}
	public void setArRegDate(Date arRegDate) {
		this.arRegDate = arRegDate;
	}
	public Date getArModDate() {
		return arModDate;
	}
	public void setArModDate(Date arModDate) {
		this.arModDate = arModDate;
	}
	
}
