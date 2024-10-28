package com.lalaping.qna;

import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface QnaDao {
	//Qna Request
	public List<QnaDto> selectListRequest(QnaRequestVo vo);
	public List<QnaDto> qnaTypeCount();
	public List<QnaDto> qnaStatusCount();
	public int listCountR(QnaRequestVo vo);
	public QnaDto selectOneRequest(QnaDto qnaDto);
	public int insertRequest(QnaDto qnaDto);
	public int updateRequest(QnaDto qnaDto);
	public int ueleteRequest(QnaDto qnaDto);
	public int deleteRequest(QnaDto qnaDto);
	//Qna Answer
	public List<QnaAnswerDto> selectListAnswer(QnaAnswerVo vo);
	public int listCountA(QnaAnswerVo vo);
	public QnaAnswerDto selectOneAnswer(QnaAnswerDto qnaAnswerDto);
	public int insertAnswer(QnaAnswerDto qnaAnswerDto);
	public int updateAnswer(QnaAnswerDto qnaAnswerDto);
	public int ueleteAnswer(QnaAnswerDto qnaAnswerDto);
	public int deleteAnswer(QnaAnswerDto qnaAnswerDto);
}
