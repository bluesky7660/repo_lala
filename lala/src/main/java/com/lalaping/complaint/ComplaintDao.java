package com.lalaping.complaint;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintDao {
//	민원 reception
	public List<ReceptionDto> receptionSelectList(ReceptionVo vo);
	public int rcInsert(ReceptionDto receptionDto);
	public ReceptionDto rcSelectOne(ReceptionDto receptionDto);
	public int rcUpdate(ReceptionDto receptionDto);
	public int rcUelete(ReceptionDto receptionDto);
	public int rcDelete(ReceptionDto receptionDto);
	public int receptionListCount(ReceptionVo vo);
	
	
//	답변 answer
	public List<AnswerDto> answerSelectList(AnswerVo vo);
	public int awInsert(AnswerDto answerDto);
	public AnswerDto awSelectOne(AnswerDto answerDto);
	public int awUpdate(AnswerDto answerDto);
	public int awUelete(AnswerDto answerDto);
	public int awDelete(AnswerDto answerDto);
	public int answerListCount(AnswerVo vo);

}
