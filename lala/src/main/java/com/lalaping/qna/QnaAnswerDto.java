package com.lalaping.qna;

import java.util.Date;

public class QnaAnswerDto {
	private String qaSeq;
	private String qaContent;
	private Date qaRegDate;
	private Date qaModDate;
	private String staffMember_sfSeq;
	private String qnaRequests_qrSeq;
	private String sfName;
//---------------------------------------
	public String getQaSeq() {
		return qaSeq;
	}
	public void setQaSeq(String qaSeq) {
		this.qaSeq = qaSeq;
	}
	public String getQaContent() {
		return qaContent;
	}
	public void setQaContent(String qaContent) {
		this.qaContent = qaContent;
	}
	public Date getQaRegDate() {
		return qaRegDate;
	}
	public void setQaRegDate(Date qaRegDate) {
		this.qaRegDate = qaRegDate;
	}
	public Date getQaModDate() {
		return qaModDate;
	}
	public void setQaModDate(Date qaModDate) {
		this.qaModDate = qaModDate;
	}
	public String getStaffMember_sfSeq() {
		return staffMember_sfSeq;
	}
	public void setStaffMember_sfSeq(String staffMember_sfSeq) {
		this.staffMember_sfSeq = staffMember_sfSeq;
	}
	public String getQnaRequests_qrSeq() {
		return qnaRequests_qrSeq;
	}
	public void setQnaRequests_qrSeq(String qnaRequests_qrSeq) {
		this.qnaRequests_qrSeq = qnaRequests_qrSeq;
	}
	public String getSfName() {
		return sfName;
	}
	public void setSfName(String sfName) {
		this.sfName = sfName;
	}
	
}
