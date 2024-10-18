package com.lalaping.qna;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalaping.infra.code.CodeDto;

@Service
public class QnaService {
	@Autowired
	QnaDao qnaDao;
	
	//Qna Request
	public List<QnaRequestDto> selectListRequest(QnaRequestVo vo){
		return qnaDao.selectListRequest(vo);
	}
	public int listCountR(QnaRequestVo vo) {
		return qnaDao.listCountR(vo);
	}
	public QnaRequestDto selectOneRequest(QnaRequestDto qnaRequestDto) {
		return qnaDao.selectOneRequest(qnaRequestDto);
	}
	public int insertRequest(QnaRequestDto qnaRequestDto){
		return qnaDao.insertRequest(qnaRequestDto);
	}
	public int updateRequest(QnaRequestDto qnaRequestDto){
		return qnaDao.updateRequest(qnaRequestDto);
	}
	public int ueleteRequest(QnaRequestDto qnaRequestDto){
		return qnaDao.ueleteRequest(qnaRequestDto);
	}
	public int deleteRequest(QnaRequestDto qnaRequestDto){
		return qnaDao.deleteRequest(qnaRequestDto);
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
	public int updateAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.updateAnswer(qnaAnswerDto);
	}
	public int ueleteAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.ueleteAnswer(qnaAnswerDto);
	}
	public int deleteAnswer(QnaAnswerDto qnaAnswerDto){
		return qnaDao.deleteAnswer(qnaAnswerDto);
	}
	

}
