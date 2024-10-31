package com.lalaping.complaint;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface ComplaintDao {
//	민원 reception
	public List<ComplaintDto> receptionSelectList(ComplaintVo vo);
	public List<ComplaintDto> receptionTypeCount();
	public int rcInsert(ComplaintDto complaintDto);
	public ComplaintDto rcSelectOne(ComplaintDto complaintDto);
	public int rcUpdate(ComplaintDto complaintDto);
	public int rcUelete(ComplaintDto complaintDto);
	public int rcDelete(ComplaintDto complaintDto);
	public int receptionListCount(ComplaintVo vo);
	
//	답변 answer
	public List<ComplaintDto> answerSelectList(ComplaintVo vo);
	public List<ComplaintDto> answerTypeCount();
	public int awInsert(ComplaintDto complaintDto);
	public ComplaintDto awSelectOne(ComplaintDto complaintDto);
	public int awUpdate(ComplaintDto complaintDto);
	public int awUelete(ComplaintDto complaintDto);
	public int awDelete(ComplaintDto complaintDto);
	public int answerListCount(ComplaintVo vo);

//민원 대시보드용
	public List<ComplaintDto> compStatusCount();
	public List<ComplaintDto> pendingReceptionList(ComplaintVo complaintVo);

}
