package com.lalaping.qna;

import com.lalaping.infra.util.BaseVo;

public class QnaAnswerVo extends BaseVo{
	private Integer shQrStatus;
	private String shStaff;
//-------------------------------

	public Integer getShQrStatus() {
		return shQrStatus;
	}

	public void setShQrStatus(Integer shQrStatus) {
		this.shQrStatus = shQrStatus;
	}

	public String getShStaff() {
		return shStaff;
	}

	public void setShStaff(String shStaff) {
		this.shStaff = shStaff;
	}
	
}
