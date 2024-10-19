package com.lalaping.complaint;

import java.util.Date;

public class ReceptionDto {
	private String rcSeq;
	private String rcTitle;
	private String rcContent;
	private String rcStatus;
	private Integer rcType;
	private Integer rcDelNy;
	private Date rcRegDate;
	private String userMember_umSeq;
	private String staffMember_sfSeq;
	private String reception_rcSeq;
	private String awContent;
	private Integer awDelNy;
    private Date awRegDate;
	
//	----------------------------------
	
	public String getRcSeq() {
		return rcSeq;
	}
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
	}
	public String getRcTitle() {
		return rcTitle;
	}
	public void setRcTitle(String rcTitle) {
		this.rcTitle = rcTitle;
	}
	public String getRcContent() {
		return rcContent;
	}
	public void setRcContent(String rcContent) {
		this.rcContent = rcContent;
	}
	public String getRcStatus() {
		return rcStatus;
	}
	public void setRcStatus(String rcStatus) {
		this.rcStatus = rcStatus;
	}
	public Integer getRcDelNy() {
		return rcDelNy;
	}
	public void setRcDelNy(Integer rcDelNy) {
		this.rcDelNy = rcDelNy;
	}
	public Date getRcRegDate() {
		return rcRegDate;
	}
	public void setRcRegDate(Date rcRegDate) {
		this.rcRegDate = rcRegDate;
	}
	public String getUserMember_umSeq() {
		return userMember_umSeq;
	}
	public void setUserMember_umSeq(String userMember_umSeq) {
		this.userMember_umSeq = userMember_umSeq;
	}
	public Integer getRcType() {
		return rcType;
	}
	public void setRcType(Integer rcType) {
		this.rcType = rcType;
	}
	public String getStaffMember_sfSeq() {
		return staffMember_sfSeq;
	}
	public void setStaffMember_sfSeq(String staffMember_sfSeq) {
		this.staffMember_sfSeq = staffMember_sfSeq;
	}
	public String getReception_rcSeq() {
		return reception_rcSeq;
	}
	public void setReception_rcSeq(String reception_rcSeq) {
		this.reception_rcSeq = reception_rcSeq;
	}
	public String getAwContent() {
		return awContent;
	}
	public void setAwContent(String awContent) {
		this.awContent = awContent;
	}
	public Integer getAwDelNy() {
		return awDelNy;
	}
	public void setAwDelNy(Integer awDelNy) {
		this.awDelNy = awDelNy;
	}
	public Date getAwRegDate() {
		return awRegDate;
	}
	public void setAwRegDate(Date awRegDate) {
		this.awRegDate = awRegDate;
	}
	
	
	
	

	
	
	
	
	
	
	

}
