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
	//----------------------------
    public String getArSeq() {
		return arSeq;
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
