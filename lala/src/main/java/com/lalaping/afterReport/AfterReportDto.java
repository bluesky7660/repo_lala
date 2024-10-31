package com.lalaping.afterReport;

import java.util.Date;

public class AfterReportDto {
	
	private String arSeq;
    private String arTitle;
    private String arContent;
    private Integer arDelNy;
    private Date arRegDate;
    private Date arModDate;
    private String staffMember_sfSeq;
    private String sfName;
    private String sfDept;
    private String sfTel;
    private String sfEmail;
    private String reception_rcSeq;
    private String rcSeq;
    private Integer rcType;
    private String rcTitle;
    private String rcContent;
    private Integer rcStatus;
    private Integer userMember_umSeq;
    private String umName;
	//----------------------------
    public String getArSeq() {
		return arSeq;
	}
	public String getUmName() {
		return umName;
	}
	public void setUmName(String umName) {
		this.umName = umName;
	}
	public Integer getUserMember_umSeq() {
		return userMember_umSeq;
	}
	public void setUserMember_umSeq(Integer userMember_umSeq) {
		this.userMember_umSeq = userMember_umSeq;
	}
	public String getReception_rcSeq() {
		return reception_rcSeq;
	}
	public void setReception_rcSeq(String reception_rcSeq) {
		this.reception_rcSeq = reception_rcSeq;
	}
	public String getRcSeq() {
		return rcSeq;
	}
	public void setRcSeq(String rcSeq) {
		this.rcSeq = rcSeq;
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
	public String getRcContent() {
		return rcContent;
	}
	public void setRcContent(String rcContent) {
		this.rcContent = rcContent;
	}
	public Integer getRcStatus() {
		return rcStatus;
	}
	public void setRcStatus(Integer rcStatus) {
		this.rcStatus = rcStatus;
	}
	public String getSfEmail() {
		return sfEmail;
	}
	public void setSfEmail(String sfEmail) {
		this.sfEmail = sfEmail;
	}
	public String getSfTel() {
		return sfTel;
	}
	public void setSfTel(String sfTel) {
		this.sfTel = sfTel;
	}
	public String getSfDept() {
		return sfDept;
	}
	public void setSfDept(String sfDept) {
		this.sfDept = sfDept;
	}
	public void setArSeq(String arSeq) {
		this.arSeq = arSeq;
	}
	public String getArTitle() {
		return arTitle;
	}
	
	public void setArTitle(String arTitle) {
		this.arTitle = arTitle;
	}
	public String getArContent() {
		return arContent;
	}
	public void setArContent(String arContent) {
		this.arContent = arContent;
	}
	public Integer getArDelNy() {
		return arDelNy;
	}
	public void setArDelNy(Integer arDelNy) {
		this.arDelNy = arDelNy;
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
	public String getStaffMember_sfSeq() {
		return staffMember_sfSeq;
	}
	public void setStaffMember_sfSeq(String staffMember_sfSeq) {
		this.staffMember_sfSeq = staffMember_sfSeq;
	}
	public String getSfName() {
		return sfName;
	}
	public void setSfName(String sfName) {
		this.sfName = sfName;
	}
}
