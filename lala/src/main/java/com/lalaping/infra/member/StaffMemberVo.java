package com.lalaping.infra.member;

import java.util.Date;

import com.lalaping.infra.util.BaseVo;

public class StaffMemberVo extends BaseVo{
	private String sfSeq;
	private Date sfRegDate;
	private Date sfModDate;
//----------------------------------
	public String getSfSeq() {
		return sfSeq;
	}
	public void setSfSeq(String sfSeq) {
		this.sfSeq = sfSeq;
	}
	public Date getSfRegDate() {
		return sfRegDate;
	}
	public void setSfRegDate(Date sfRegDate) {
		this.sfRegDate = sfRegDate;
	}
	public Date getSfModDate() {
		return sfModDate;
	}
	public void setSfModDate(Date sfModDate) {
		this.sfModDate = sfModDate;
	}

}
