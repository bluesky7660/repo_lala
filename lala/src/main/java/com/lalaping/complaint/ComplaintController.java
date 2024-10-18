package com.lalaping.complaint;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;

@Controller
public class ComplaintController {
	@Autowired
	
	@RequestMapping(value = "/v1/complaint/answerXdmList")
	public String answerXdmList() {
//		complaintVo.setShDateStart(complaintVo.getShDateStart() == null || complaintVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(complaintVo.getShDateStart()));
//		complaintVo.setShDateEnd(complaintVo.getShDateEnd() == null || complaintVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(complaintVo.getShDateEnd()));
//		complaintVo.setParamsPaging(qnaService.listCountA(complaintVo));
		return "xdm/v1/complaint/answerXdmList";
	}
	@RequestMapping(value = "/v1/complaint/recepotionXdmList")
	public String recepotionXdmList() {

		return "xdm/v1/complaint/recepotionXdmList";
	}
}
