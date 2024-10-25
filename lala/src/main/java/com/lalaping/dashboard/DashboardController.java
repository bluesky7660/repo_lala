package com.lalaping.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.complaint.ComplaintService;
import com.lalaping.complaint.ReceptionVo;
import com.lalaping.qna.QnaRequestVo;
import com.lalaping.qna.QnaService;


@Controller
public class DashboardController {
	@Autowired
	ComplaintService complaintService;
	
	@Autowired
	QnaService qnaService;
	
	@RequestMapping(value = "/v1/dashboard")
	public String index(Model model, QnaRequestVo qnaRequestVo, ReceptionVo receptionVo) {
//		System.out.println("getAwDept:"+complaintService.answerTypeCount().get(0).getCdSeq());
		qnaRequestVo.setRowNumToShow(5);
		receptionVo.setRowNumToShow(5);
		model.addAttribute("qnaList", qnaService.selectListRequest(qnaRequestVo));
		model.addAttribute("qnaStatus", qnaService.qnaStatusCount());
		model.addAttribute("comList", complaintService.receptionSelectList(receptionVo));
		model.addAttribute("DeptType", complaintService.answerTypeCount());
		model.addAttribute("CompType", complaintService.receptionTypeCount());
		model.addAttribute("qnaType", qnaService.qnaTypeCount());
		return "xdm/v1/index";
	}
}
