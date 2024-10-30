package com.lalaping.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalaping.complaint.ReceptionDto;
import com.lalaping.infra.code.CodeDto;

@Service
public class QnaService {
	@Autowired
	QnaDao qnaDao;
	
	//Qna Request
	public List<QnaDto> selectListRequest(QnaRequestVo vo){
		return qnaDao.selectListRequest(vo);
	}
	public List<QnaDto> pendingRequestList(QnaRequestVo vo){
		return qnaDao.pendingRequestList(vo);
	}
	public List<QnaDto> qnaTypeCount(){
		return qnaDao.qnaTypeCount();
	}
	public List<QnaDto> qnaStatusCount(){
		return qnaDao.qnaStatusCount();
	}
	public int listCountR(QnaRequestVo vo) {
		return qnaDao.listCountR(vo);
	}
	public QnaDto selectOneRequest(QnaDto qnaDto) {
		return qnaDao.selectOneRequest(qnaDto);
	}
	
	
	public int updateRequest(QnaDto qnaDto){
		return qnaDao.updateRequest(qnaDto);
	}
	public int ueleteRequest(QnaDto qnaDto){
		return qnaDao.ueleteRequest(qnaDto);
	}
	public int deleteRequest(QnaDto qnaDto){
		return qnaDao.deleteRequest(qnaDto);
	}
	
	
	//Qna Answer
	public List<QnaAnswerDto> selectListAnswer(QnaAnswerVo vo){
		return qnaDao.selectListAnswer(vo);
	}
	public int listCountA(QnaAnswerVo vo) {
		return qnaDao.listCountA(vo);
	}
	public QnaAnswerDto selectOneAnswer(QnaAnswerDto qnaAnswerDto) {
		return qnaDao.selectOneAnswer(qnaAnswerDto);
	}
	public int insertAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.insertAnswer(qnaAnswerDto);
	}
	
	public int ueleteAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.ueleteAnswer(qnaAnswerDto);
	}
	public int deleteAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.deleteAnswer(qnaAnswerDto);
	}
	
	//통합
	public List<QnaDto> selectListQnaReq(QnaVo vo){
		return qnaDao.selectListQnaReq(vo);
	}
	public List<QnaDto> selectListQnaAns(QnaVo vo){
		return qnaDao.selectListQnaAns(vo);
	}
	
	public QnaDto selectOneQnaReq(QnaDto qnaDto) {
		return qnaDao.selectOneQnaReq(qnaDto);
	}
	public int listCountReg(QnaVo vo) {
		return qnaDao.listCountReg(vo);
	}
	public int listCountAns(QnaVo vo) {
		return qnaDao.listCountAns(vo);
	}
	
	public int insertRequest(QnaDto qnaDto){
		return qnaDao.insertRequest(qnaDto);
	}
	public int updateQna(QnaDto qnaDto){
		return qnaDao.updateQna(qnaDto);
	}
	
	//대시보드
	public int getQnaTypeCountForType(String type) {
	    List<QnaDto> qnaList = qnaDao.qnaTypeCount();
	    for (QnaDto qna : qnaList) {
	        if (qna.getQrType() != null && qna.getQrType().toString().equals(type)) {
	            return qna.getQrTypeCount(); // 해당하는 값 반환
	        }
	        
	    }
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}
	public int getQnaStatusCount(int status) {
	    List<QnaDto> qnaStatusList = qnaDao.qnaStatusCount();
	    for (QnaDto qnaStatus : qnaStatusList) {
	        if (qnaStatus.getQrStatus() != null && qnaStatus.getQrStatus().equals(status)) {
	        	System.out.println("성공");
	            return qnaStatus.getQnaStatusCount(); // 해당하는 값 반환
	        }
	        
	    }
	    System.out.println("실패");
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}

}
