package com.lalaping.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.complaint.ComplaintService;
import com.lalaping.complaint.ComplaintVo;
import com.lalaping.qna.QnaService;
import com.lalaping.qna.QnaVo;


@Controller
public class DashboardController {
	@Autowired
	ComplaintService complaintService;
	
	@Autowired
	QnaService qnaService;
	
	@RequestMapping(value = "/v1/dashboard")
	public String index(Model model, QnaVo qnaVo, ComplaintVo complaintVo) {
//		System.out.println("getAwDept:"+complaintService.answerTypeCount().get(0).getCdSeq());
		qnaVo.setRowNumToShow(5);
		complaintVo.setRowNumToShow(5);
		model.addAttribute("qnaList", qnaService.pendingRequestList(qnaVo));
		model.addAttribute("qnaStatus", qnaService.qnaStatusCount());
		model.addAttribute("comList", complaintService.pendingReceptionList(complaintVo));
		model.addAttribute("DeptType", complaintService.answerTypeCount());
		model.addAttribute("CompType", complaintService.receptionTypeCount());
		model.addAttribute("qnaType", qnaService.qnaTypeCount());
		return "xdm/v1/index";
	}
}
