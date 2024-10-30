package com.lalaping.qna;

import com.lalaping.infra.util.BaseVo;

public class QnaVo extends BaseVo{
	private String sessSeqXdm;
	private Integer shQnaType;
	private Integer shQrStatus;
//-------------------------------
	public Integer getShQnaType() {
		return shQnaType;
	}

	public void setShQnaType(Integer shQnaType) {
		this.shQnaType = shQnaType;
	}

	public Integer getShQrStatus() {
		return shQrStatus;
	}

	public void setShQrStatus(Integer shQrStatus) {
		this.shQrStatus = shQrStatus;
	}

	public String getSessSeqXdm() {
		return sessSeqXdm;
	}

	public void setSessSeqXdm(String sessSeqXdm) {
		this.sessSeqXdm = sessSeqXdm;
	}
}
