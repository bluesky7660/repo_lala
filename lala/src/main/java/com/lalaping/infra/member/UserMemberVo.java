package com.lalaping.infra.member;

import java.util.Date;

import com.lalaping.infra.util.BaseVo;

public class UserMemberVo extends BaseVo{
	private String umSeq;
	private Date umRegDate;
	private Date umModDate;
//-------------
	public String getUmSeq() {
		return umSeq;
	}
	public void setUmSeq(String umSeq) {
		this.umSeq = umSeq;
	}
	public Date getUmRegDate() {
		return umRegDate;
	}
	public void setUmRegDate(Date umRegDate) {
		this.umRegDate = umRegDate;
	}
	public Date getUmModDate() {
		return umModDate;
	}
	public void setUmModDate(Date umModDate) {
		this.umModDate = umModDate;
	}
	
}
