package com.lalaping.complaint;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintDao {
//	민원 reception
	public List<ComplaintDto> receptionSelectList(ReceptionVo vo);
	public List<ComplaintDto> receptionTypeCount();
	public int rcInsert(ComplaintDto receptionDto);
	public ComplaintDto rcSelectOne(ComplaintDto receptionDto);
	public int rcUpdate(ComplaintDto receptionDto);
	public int rcUelete(ComplaintDto receptionDto);
	public int rcDelete(ComplaintDto receptionDto);
	public int receptionListCount(ReceptionVo vo);
	
//	답변 answer
	public List<ComplaintDto> answerSelectList(AnswerVo vo);
	public List<ComplaintDto> answerTypeCount();
	public int awInsert(ComplaintDto answerDto);
	public ComplaintDto awSelectOne(ComplaintDto answerDto);
	public int awUpdate(ComplaintDto answerDto);
	public int awUelete(ComplaintDto answerDto);
	public int awDelete(ComplaintDto answerDto);
	public int answerListCount(AnswerVo vo);

//민원 대시보드용
	public List<ComplaintDto> compStatusCount();

}
