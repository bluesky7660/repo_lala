package com.lalaping.infra.member;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class UserMemberDto {
	private String umSeq;
	private String umId;
	private String umPasswd;
	private String umName;
	private String umTel;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date umBirthDay;
	private Boolean umDelNy;
	private Date umRegDate;
	private Date umModDate;
	private String umEmail;
	private String umGender;
// ----------------------------
	public String getUmSeq() {
		return umSeq;
	}
	public void setUmSeq(String umSeq) {
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
	public Date getUmBirthDay() {
		return umBirthDay;
	}
	public void setUmBirthDay(Date umBirthDay) {
		this.umBirthDay = umBirthDay;
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
