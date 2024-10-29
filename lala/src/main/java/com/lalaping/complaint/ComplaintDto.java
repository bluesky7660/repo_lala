package com.lalaping.complaint;

import java.util.Date;

public class ComplaintDto {
	//민원 신청
	private String rcSeq;
	private String rcTitle;
	private String rcContent;
	private String rcStatus;
	private Integer rcType;
	private Integer rcDelNy;
	private Date rcRegDate;
	private String userMember_umSeq;
    private String umName;
    private Integer rcTypeCount;
    private Integer rcStatusCount;
    //민원 답변
    private String awSeq;
	private String awContent;
	private Integer awDelNy;
	private Date awRegDate;
	private Date awModDate;
	private String staffMember_sfSeq;
	private String reception_rcSeq;
	private String sfName;
	private Integer awDept;
	private String umSeq;
	private Integer awDeptCount;
	private String cdSeq;
//---------------------------------------
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
	public Integer getRcType() {
		return rcType;
	}
	public void setRcType(Integer rcType) {
		this.rcType = rcType;
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
	public String getUmName() {
		return umName;
	}
	public void setUmName(String umName) {
		this.umName = umName;
	}
	public Integer getRcTypeCount() {
		return rcTypeCount;
	}
	public void setRcTypeCount(Integer rcTypeCount) {
		this.rcTypeCount = rcTypeCount;
	}
	public Integer getRcStatusCount() {
		return rcStatusCount;
	}
	public void setRcStatusCount(Integer rcStatusCount) {
		this.rcStatusCount = rcStatusCount;
	}
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
	public Date getAwModDate() {
		return awModDate;
	}
	public void setAwModDate(Date awModDate) {
		this.awModDate = awModDate;
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
	public String getSfName() {
		return sfName;
	}
	public void setSfName(String sfName) {
		this.sfName = sfName;
	}
	public Integer getAwDept() {
		return awDept;
	}
	public void setAwDept(Integer awDept) {
		this.awDept = awDept;
	}
	public String getUmSeq() {
		return umSeq;
	}
	public void setUmSeq(String umSeq) {
		this.umSeq = umSeq;
	}
	public Integer getAwDeptCount() {
		return awDeptCount;
	}
	public void setAwDeptCount(Integer awDeptCount) {
		this.awDeptCount = awDeptCount;
	}
	public String getCdSeq() {
		return cdSeq;
	}
	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}
	
}
