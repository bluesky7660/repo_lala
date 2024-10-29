package com.lalaping.complaint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ComplaintService {
	@Autowired
	ComplaintDao complaintDao;
	
//	민원 reception
	
	public List<ComplaintDto> receptionSelectList(ReceptionVo vo) {
		return complaintDao.receptionSelectList(vo);
	}
	public List<ComplaintDto> receptionTypeCount(){
		return complaintDao.receptionTypeCount();
	}
	public int rcInsert(ComplaintDto receptionDto) {
		return complaintDao.rcInsert(receptionDto);
	}
	public ComplaintDto rcSelectOne(ComplaintDto receptionDto) {
		return complaintDao.rcSelectOne(receptionDto);
	}
	public int rcUpdate(ComplaintDto receptionDto) {
		return complaintDao.rcUpdate(receptionDto);
	}
	public int rcUelete(ComplaintDto receptionDto) {
		return complaintDao.rcUelete(receptionDto);
	}
	public int rcDelete(ComplaintDto receptionDto) {
		return complaintDao.rcDelete(receptionDto);
	}
	public int receptionListCount(ReceptionVo vo) {
		return complaintDao.receptionListCount(vo);
	}
	
	
//	답변 answer
	
	public List<ComplaintDto> answerSelectList(AnswerVo vo){
		return complaintDao.answerSelectList(vo);
	}
	public List<ComplaintDto> answerTypeCount(){
//		System.out.println("확인:"+answerTypeCount());
		return complaintDao.answerTypeCount();
	}
	public int awInsert(ComplaintDto answerDto) {
		return complaintDao.awInsert(answerDto);
	}
	public ComplaintDto awSelectOne(ComplaintDto answerDto) {
		return complaintDao.awSelectOne(answerDto);
	}
	public int awUpdate(ComplaintDto answerDto) {
		return complaintDao.awUpdate(answerDto);
	}
	public int awUelete(ComplaintDto answerDto) {
		return complaintDao.awUelete(answerDto);
	}
	public int awDelete(ComplaintDto answerDto) {
		return complaintDao.awDelete(answerDto);
	}
	public int answerListCount(AnswerVo vo) {
		return complaintDao.answerListCount(vo);
	}
	
	//대시보드
	public int getReceptionTypeCountForType(String type) {
	    List<ComplaintDto> rcList = complaintDao.receptionTypeCount();
	    for (ComplaintDto rc : rcList) {
	        if (rc.getRcType() != null && rc.getRcType().toString().equals(type)) {
	            return rc.getRcTypeCount(); // 해당하는 값 반환
	        }
	        
	    }
	    return 0; // 일치하는 항목이 없을 경우 0 반환
	}
	public int getAnswerTypeCountForDept(String dept) {
	    List<ComplaintDto> answerList = complaintDao.answerTypeCount();
	    for (ComplaintDto answer : answerList) {
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
	public List<ComplaintDto> pendingReceptionList(ReceptionVo ReceptionVo){
		return complaintDao.pendingReceptionList(ReceptionVo);
	}

}
