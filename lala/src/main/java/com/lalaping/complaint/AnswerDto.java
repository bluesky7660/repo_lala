package com.lalaping.complaint;

import java.util.Date;

public class AnswerDto {
	private String awSeq;
	private String awContent;
	private Integer awDelNy;
	private Date awRegDate;
	private String staffMember_sfSeq;
	private String reception_rcSeq;
	private Integer rcType;
	private String rcTitle;
	private String sfName;
	
//	-------------------------------------
	
	public String getAwSeq() {
		return awSeq;
	}
	public void setAwSeq(String awSeq) {
		this.awSeq = awSeq;
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
	
	public Integer getRcType() {
		return rcType;
	}
	public void setRcType(Integer rcType) {
		this.rcType = rcType;
	}
	public String getRcTitle() {
		return rcTitle;
	}
	public void setRcTitle(String rcTitle) {
		this.rcTitle = rcTitle;
	}
	public String getSfName() {
		return sfName;
	}
	public void setSfName(String sfName) {
		this.sfName = sfName;
	}
	
	

	

}
