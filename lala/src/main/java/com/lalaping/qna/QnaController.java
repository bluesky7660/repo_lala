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
	public String qnaAnswersXdmList(Model model,@ModelAttribute("vo") QnaAnswerVo qnaAnswerVo) {
		qnaAnswerVo.setShDateStart(qnaAnswerVo.getShDateStart() == null || qnaAnswerVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaAnswerVo.getShDateStart()));
		qnaAnswerVo.setShDateEnd(qnaAnswerVo.getShDateEnd() == null || qnaAnswerVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaAnswerVo.getShDateEnd()));
		qnaAnswerVo.setParamsPaging(qnaService.listCountA(qnaAnswerVo));
		return "xdm/v1/qna/qnaAnswersXdmList";
	}
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmList")
	public String qnaRequestsXdmList(Model model,@ModelAttribute("vo") QnaRequestVo qnaRequestVo) {
		qnaRequestVo.setShDateStart(qnaRequestVo.getShDateStart() == null || qnaRequestVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaRequestVo.getShDateStart()));
		qnaRequestVo.setShDateEnd(qnaRequestVo.getShDateEnd() == null || qnaRequestVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaRequestVo.getShDateEnd()));
		qnaRequestVo.setParamsPaging(qnaService.listCountR(qnaRequestVo));
		return "xdm/v1/qna/qnaRequestsXdmList";
	}
}
