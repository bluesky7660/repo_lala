package com.lalaping.complaint;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
@Service
public class ComplaintService {
	@Autowired
	ComplaintDao complaintDao;
	
//	민원 reception
	
	public List<ComplaintDto> receptionSelectList(ComplaintVo vo) {
		return complaintDao.receptionSelectList(vo);
	}
	public List<ComplaintDto> receptionTypeCount(){
		return complaintDao.receptionTypeCount();
	}
	public int rcInsert(ComplaintDto complaintDto) {
		return complaintDao.rcInsert(complaintDto);
	}
	public ComplaintDto rcSelectOne(ComplaintDto complaintDto) {
		return complaintDao.rcSelectOne(complaintDto);
	}
	public int rcUpdate(ComplaintDto complaintDto) {
		return complaintDao.rcUpdate(complaintDto);
	}
	public int rcUelete(ComplaintDto complaintDto) {
		return complaintDao.rcUelete(complaintDto);
	}
	public int rcDelete(ComplaintDto complaintDto) {
		return complaintDao.rcDelete(complaintDto);
	}
	public int receptionListCount(ComplaintVo vo) {
		return complaintDao.receptionListCount(vo);
	}
	
	
//	답변 answer
	
	public List<ComplaintDto> answerSelectList(ComplaintVo vo){
		return complaintDao.answerSelectList(vo);
	}
	public List<ComplaintDto> answerTypeCount(){
//		System.out.println("확인:"+answerTypeCount());
		return complaintDao.answerTypeCount();
	}
	public int awInsert(ComplaintDto complaintDto) {
		return complaintDao.awInsert(complaintDto);
	}
	public ComplaintDto awSelectOne(ComplaintDto complaintDto) {
		return complaintDao.awSelectOne(complaintDto);
	}
	public int awUpdate(ComplaintDto complaintDto) {
		return complaintDao.awUpdate(complaintDto);
	}
	public int awUelete(ComplaintDto complaintDto) {
		return complaintDao.awUelete(complaintDto);
	}
	public int awDelete(ComplaintDto complaintDto) {
		return complaintDao.awDelete(complaintDto);
	}
	public int answerListCount(ComplaintVo vo) {
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
	public List<ComplaintDto> pendingReceptionList(ComplaintVo complaintVo){
		return complaintDao.pendingReceptionList(complaintVo);
	}

}
