package com.lalaping.qna;

import java.util.Date;

public class QnaRequestDto {
	private String qrSeq;
	private String qrTitle;
	private String qrContent;
	private Date qrRegDate;
	private Integer qrType;
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
	
}
