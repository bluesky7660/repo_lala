package com.lalaping.qna;

import com.lalaping.infra.util.BaseVo;

public class QnaRequestVo extends BaseVo{
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
	
}
