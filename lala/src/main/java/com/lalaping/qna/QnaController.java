package com.lalaping.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;

@Controller
public class QnaController {
	@Autowired
	QnaService qnaService;
	
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmList")
	public String qnaAnswersXdmList(Model model,@ModelAttribute("vo") QnaVo qnaVo) {
		qnaVo.setShDateStart(qnaVo.getShDateStart() == null || qnaVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaVo.getShDateStart()));
		qnaVo.setShDateEnd(qnaVo.getShDateEnd() == null || qnaVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaVo.getShDateEnd()));
		qnaVo.setParamsPaging(qnaService.listCountA(qnaVo));
		return "xdm/v1/qna/qnaAnswersXdmList";
	}
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmList")
	public String qnaRequestsXdmList(Model model,@ModelAttribute("vo") QnaVo qnaVo) {
		qnaVo.setShDateStart(qnaVo.getShDateStart() == null || qnaVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaVo.getShDateStart()));
		qnaVo.setShDateEnd(qnaVo.getShDateEnd() == null || qnaVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaVo.getShDateEnd()));
		qnaVo.setParamsPaging(qnaService.listCountR(qnaVo));
		return "xdm/v1/qna/qnaRequestsXdmList";
	}
}
