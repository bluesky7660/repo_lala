package com.lalaping.qna;

import java.util.Date;

public class QnaDto {
	//QnA 문의
	private String qrSeq;
	private String qrTitle;
	private String qrContent;
	private Integer qrDelNy;
	private Date qrRegDate;
	private Integer qrType;
	private String umName;
	private String userMember_umSeq;
	private Integer qrStatus;
	private Integer qrTypeCount;
	private String cdSeq;
	private Integer qnaStatusCount;
	//QnA 답변
	private String qaSeq;
	private String qaContent;
	private Integer qaDelNy;
	private Date qaRegDate;
	private Date qaModDate;
	private String staffMember_sfSeq;
	private String qnaRequests_qrSeq;
	private String sfName;
//-----------------------------------------------
	//QnA 문의 get,set
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
	public Integer getQrDelNy() {
		return qrDelNy;
	}
	public void setQrDelNy(Integer qrDelNy) {
		this.qrDelNy = qrDelNy;
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
	public Integer getQrStatus() {
		return qrStatus;
	}
	public void setQrStatus(Integer qrStatus) {
		this.qrStatus = qrStatus;
	}
	public Integer getQrTypeCount() {
		return qrTypeCount;
	}
	public void setQrTypeCount(Integer qrTypeCount) {
		this.qrTypeCount = qrTypeCount;
	}
	public String getCdSeq() {
		return cdSeq;
	}
	public void setCdSeq(String cdSeq) {
		this.cdSeq = cdSeq;
	}
	public Integer getQnaStatusCount() {
		return qnaStatusCount;
	}
	public void setQnaStatusCount(Integer qnaStatusCount) {
		this.qnaStatusCount = qnaStatusCount;
	}
//-----------------------------------------------------------
	//QnA 답변 get,set
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
	public Integer getQaDelNy() {
		return qaDelNy;
	}
	public void setQaDelNy(Integer qaDelNy) {
		this.qaDelNy = qaDelNy;
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
