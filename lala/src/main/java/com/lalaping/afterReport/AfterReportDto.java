package com.lalaping.afterReport;

import java.sql.Date;

public class AfterReportDto {
	
	private Integer arSeq;
    private String arTitle;
    private String arContent;
    private Boolean arDelNy;
    private Date arRegDate;
    private Date arModDate;
    private Integer staffMemberSfSeq;
	//----------------------------
	public Integer getArSeq() {
		return arSeq;
	}
	public void setArSeq(Integer arSeq) {
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
	public Boolean getArDelNy() {
		return arDelNy;
	}
	public void setArDelNy(Boolean arDelNy) {
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
	public Integer getStaffMemberSfSeq() {
		return staffMemberSfSeq;
	}
	public void setStaffMemberSfSeq(Integer staffMemberSfSeq) {
		this.staffMemberSfSeq = staffMemberSfSeq;
	}
    
}
