package com.lalaping.qna;

import java.util.Date;

public class QnaRequestDto {
	private String qrSeq;
	private String qrTitle;
	private String qrContent;
	private Integer qrDelNy;
	private Date qrRegDate;
	private Integer qrType;
	private String umName;
	private String userMember_umSeq;
//--------------------------------
	public String getQrSeq() {
		return qrSeq;
	}
	public void setQrSeq(String qrSeq) {
		this.qrSeq = qrSeq;
	}
	public String getQrTitle() {
		return qrTitle;
	}
	public void setQrTitle(String qrTitle) {
		this.qrTitle = qrTitle;
	}
	public String getQrContent() {
		return qrContent;
	}
	public void setQrContent(String qrContent) {
		this.qrContent = qrContent;
	}
	public Date getQrRegDate() {
		return qrRegDate;
	}
	public void setQrRegDate(Date qrRegDate) {
		this.qrRegDate = qrRegDate;
	}
	public Integer getQrType() {
		return qrType;
	}
	public void setQrType(Integer qrType) {
		this.qrType = qrType;
	}
	public String getUmName() {
		return umName;
	}
	public void setUmName(String umName) {
		this.umName = umName;
	}
	public String getUserMember_umSeq() {
		return userMember_umSeq;
	}
	public void setUserMember_umSeq(String userMember_umSeq) {
		this.userMember_umSeq = userMember_umSeq;
	}
	public Integer getQrDelNy() {
		return qrDelNy;
	}
	public void setQrDelNy(Integer qrDelNy) {
		this.qrDelNy = qrDelNy;
	}
	
}
