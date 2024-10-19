package com.lalaping.complaint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ComplaintService {
	@Autowired
	ComplaintDao complaintDao;
	
//	민원 reception
	
	public List<ReceptionDto> receptionSelectList(ReceptionVo vo) {
		return complaintDao.receptionSelectList(vo);
	}
	public int rcInsert(ReceptionDto receptionDto) {
		return complaintDao.rcInsert(receptionDto);
	}
	public ReceptionDto rcSelectOne(ReceptionDto receptionDto) {
		return complaintDao.rcSelectOne(receptionDto);
	}
	public int rcUpdate(ReceptionDto receptionDto) {
		return complaintDao.rcUpdate(receptionDto);
	}
	public int rcUelete(ReceptionDto receptionDto) {
		return complaintDao.rcUelete(receptionDto);
	}
	public int rcDelete(ReceptionDto receptionDto) {
		return complaintDao.rcDelete(receptionDto);
	}
	public int receptionListCount(ReceptionVo vo) {
		return complaintDao.receptionListCount(vo);
	}
	
//	답변 answer
	
	public List<AnswerDto> answerSelectList(AnswerVo vo){
		return complaintDao.answerSelectList(vo);
	}
	public int awInsert(AnswerDto answerDto) {
		return complaintDao.awInsert(answerDto);
	}
	public AnswerDto awSelectOne(AnswerDto answerDto) {
		return complaintDao.awSelectOne(answerDto);
	}
	public int awUpdate(AnswerDto answerDto) {
		return complaintDao.awUpdate(answerDto);
	}
	public int awUelete(AnswerDto answerDto) {
		return complaintDao.awUelete(answerDto);
	}
	public int awDelete(AnswerDto answerDto) {
		return complaintDao.awDelete(answerDto);
	}
	public int answerListCount(AnswerVo vo) {
		return complaintDao.answerListCount(vo);
	}

}
