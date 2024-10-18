package com.lalaping.qna;

import java.util.List;

import org.springframework.stereotype.Repository;



@Repository
public interface QnaDao {
	//Qna Request
	public List<QnaRequestDto> selectListRequest(QnaRequestVo vo);
	public int listCountR(QnaRequestVo vo);
	public QnaRequestDto selectOneRequest(QnaRequestDto qnaRequestDto);
	public int insertRequest(QnaRequestDto qnaRequestDto);
	public int updateRequest(QnaRequestDto qnaRequestDto);
	public int ueleteRequest(QnaRequestDto qnaRequestDto);
	public int deleteRequest(QnaRequestDto qnaRequestDto);
	//Qna Answer
	public List<QnaAnswerDto> selectListAnswer(QnaAnswerVo vo);
	public int listCountA(QnaAnswerVo vo);
	public QnaAnswerDto selectOneAnswer(QnaAnswerDto qnaAnswerDto);
	public int insertAnswer(QnaAnswerDto qnaAnswerDto);
	public int updateAnswer(QnaAnswerDto qnaAnswerDto);
	public int ueleteAnswer(QnaAnswerDto qnaAnswerDto);
	public int deleteAnswer(QnaAnswerDto qnaAnswerDto);
}
