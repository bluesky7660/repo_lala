package com.lalaping.infra.member;

import java.util.Date;

public class UserMemberDto {
	private Integer umSeq;
	private String umId;
	private String umPasswd;
	private String umName;
	private String umTel;
	private Date umBirthday;
	private Boolean umDelNy;
	private Date umRegDate;
	private Date umModDate;
	private String umEmail;
	private String umGender;
// ----------------------------
	public Integer getUmSeq() {
		return umSeq;
	}
	public void setUmSeq(Integer umSeq) {
		this.umSeq = umSeq;
	}
	public String getUmId() {
		return umId;
	}
	public void setUmId(String umId) {
		this.umId = umId;
	}
	public String getUmPasswd() {
		return umPasswd;
	}
	public void setUmPasswd(String umPasswd) {
		this.umPasswd = umPasswd;
	}
	public String getUmName() {
		return umName;
	}
	public void setUmName(String umName) {
		this.umName = umName;
	}
	public String getUmTel() {
		return umTel;
	}
	public void setUmTel(String umTel) {
		this.umTel = umTel;
	}
	public Date getUmBirthday() {
		return umBirthday;
	}
	public void setUmBirthday(Date umBirthday) {
		this.umBirthday = umBirthday;
	}
	public Boolean getUmDelNy() {
		return umDelNy;
	}
	public void setUmDelNy(Boolean umDelNy) {
		this.umDelNy = umDelNy;
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
	public String getUmEmail() {
		return umEmail;
	}
	public void setUmEmail(String umEmail) {
		this.umEmail = umEmail;
	}
	public String getUmGender() {
		return umGender;
	}
	public void setUmGender(String umGender) {
		this.umGender = umGender;
	}
	
}