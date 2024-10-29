package com.lalaping.infra.member;

import java.util.Date;

import org.springframework.format.annotation.DateTimeFormat;

public class StaffMemberDto {
	private String sfSeq;
	private String sfId;
	private String sfPasswd;
	private String sfName;
	private String sfTel;
	@DateTimeFormat(pattern = "yyyy-MM-dd")
	private Date sfBirthDay;
	private Boolean sfDelNy;
	private Boolean sfUseNy;
	private Date sfRegDate;
	private Date sfModDate;
	private String sfEmail;
	private String sfGender;
	private String sfDept;
//-------------------------------
	public String getSfSeq() {
		return sfSeq;
	}
	
	public Boolean getSfUseNy() {
		return sfUseNy;
	}
	public void setSfUseNy(Boolean sfUseNy) {
		this.sfUseNy = sfUseNy;
	}
	public void setSfSeq(String sfSeq) {
		this.sfSeq = sfSeq;
	}
	public String getSfId() {
		return sfId;
	}
	public void setSfId(String sfId) {
		this.sfId = sfId;
	}
	public String getSfPasswd() {
		return sfPasswd;
	}
	public void setSfPasswd(String sfPasswd) {
		this.sfPasswd = sfPasswd;
	}
	public String getSfName() {
		return sfName;
	}
	public void setSfName(String sfName) {
		this.sfName = sfName;
	}
	public String getSfTel() {
		return sfTel;
	}
	public void setSfTel(String sfTel) {
		this.sfTel = sfTel;
	}
	public Date getSfBirthDay() {
		return sfBirthDay;
	}
	public void setSfBirthDay(Date sfBirthDay) {
		this.sfBirthDay = sfBirthDay;
	}
	public Boolean getSfDelNy() {
		return sfDelNy;
	}
	public void setSfDelNy(Boolean sfDelNy) {
		this.sfDelNy = sfDelNy;
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
	public String getSfEmail() {
		return sfEmail;
	}
	public void setSfEmail(String sfEmail) {
		this.sfEmail = sfEmail;
	}
	public String getSfGender() {
		return sfGender;
	}
	public void setSfGender(String sfGender) {
		this.sfGender = sfGender;
	}
	public String getSfDept() {
		return sfDept;
	}
	public void setSfDept(String sfDept) {
		this.sfDept = sfDept;
	}
	
	
}
