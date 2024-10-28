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
	public List<ReceptionDto> receptionTypeCount(){
		return complaintDao.receptionTypeCount();
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
	public List<AnswerDto> answerTypeCount(){
//		System.out.println("확인:"+answerTypeCount());
		return complaintDao.answerTypeCount();
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
	
	//대시보드
	public int getReceptionTypeCountForType(String type) {
	    List<ReceptionDto> rcList = complaintDao.receptionTypeCount();
	    for (ReceptionDto rc : rcList) {
	        if (rc.getRcType() != null && rc.getRcType().toString().equals(type)) {
	            return rc.getRcTypeCount(); // 해당하는 값 반환
	        }
	        
	    }
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}
	public int getAnswerTypeCountForDept(String dept) {
	    List<AnswerDto> answerList = complaintDao.answerTypeCount();
	    for (AnswerDto answer : answerList) {
	        if (answer.getAwDept() != null && answer.getAwDept().toString().equals(dept)) {
	            return answer.getAwDeptCount(); // 해당하는 값 반환
	        }
	        
	    }
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}
	public int getCompStatusCount(String status) {
	    List<ComplaintDto> compList = complaintDao.compStatusCount();
	    for (ComplaintDto comp : compList) {
	        if (comp.getRcStatus() != null && comp.getRcStatus().toString().equals(status)) {
	            return comp.getRcStatusCount(); // 해당하는 값 반환
	        }
	        
	    }
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}

}
