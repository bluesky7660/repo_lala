package com.lalaping.dashboard;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.complaint.ComplaintService;


@Controller
public class DashboardController {
	@Autowired
	ComplaintService complaintService;
	
	@RequestMapping(value = "/v1/dashboard")
	public String index(Model model) {
		System.out.println("getAwDept:"+complaintService.answerTypeCount().get(0).getCdSeq());
		model.addAttribute("DeptType", complaintService.answerTypeCount());
		model.addAttribute("CompType", complaintService.receptionTypeCount());
		return "xdm/v1/index";
	}
	
}
