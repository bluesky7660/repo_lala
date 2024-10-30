package com.lalaping.qna;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;
import com.lalaping.complaint.AnswerDto;
import com.lalaping.complaint.ReceptionDto;
import com.lalaping.infra.member.MemberService;
import com.lalaping.infra.member.StaffMemberDto;
import com.lalaping.infra.member.StaffMemberVo;

@Controller
public class QnaController {
	@Autowired
	QnaService qnaService;
	
	@Autowired
	MemberService memberService;
	
	//qna 답변
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmList")
//	public String qnaAnswersXdmList(Model model,@ModelAttribute("vo") QnaAnswerVo qnaAnswerVo) {
//		qnaAnswerVo.setShDateStart(qnaAnswerVo.getShDateStart() == null || qnaAnswerVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaAnswerVo.getShDateStart()));
//		qnaAnswerVo.setShDateEnd(qnaAnswerVo.getShDateEnd() == null || qnaAnswerVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaAnswerVo.getShDateEnd()));
//		qnaAnswerVo.setParamsPaging(qnaService.listCountA(qnaAnswerVo));
//		model.addAttribute("list",qnaService.selectListAnswer(qnaAnswerVo));
//		model.addAttribute("formLink", "qnaAnswersXdmForm");
//		return "xdm/v1/qna/qnaAnswersXdmList";
//	}
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmForm")
	public String qnaAnswersXdmForm(Model model) {
		model.addAttribute("listLink", "qnaAnswersXdmList");
		return "xdm/v1/qna/qnaAnswersXdmForm";
	}
//	@RequestMapping(value = "/v1/qna/qnaAnswersInst")
//	public String qnaAnswersInst(QnaAnswerDto qnaAnswerDto) {
//		qnaService.insertAnswer(qnaAnswerDto);
//		return "redirect:/v1/qna/qnaAnswersXdmList";
//	}
	
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmMFom")
//	public String qnaAnswersXdmMFom(Model model,QnaAnswerDto qnaAnswerDto) {
//		model.addAttribute("item", qnaService.selectOneAnswer(qnaAnswerDto));
//		model.addAttribute("listLink", "qnaAnswersXdmList");
//		return "/xdm/v1/qna/qnaAnswersXdmMFom";
//	}
	
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmUpdt")
	public String qnaAnswersXdmUpdt(QnaAnswerDto qnaAnswerDto,QnaDto qnaDto) {
//		qnaService.updateAnswer(qnaAnswerDto);
		qnaService.updateRequest(qnaDto);
		return "redirect:/v1/qna/qnaAnswersXdmList";
	}
	
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmUete")
	public String qnaAnswersXdmUete(QnaAnswerDto qnaAnswerDto) {
		qnaService.ueleteAnswer(qnaAnswerDto);
		return "redirect:/v1/qna/qnaAnswersXdmList";
	}
	
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmDete")
	public String qnaAnswersXdmDete(QnaAnswerDto qnaAnswerDto) {
		qnaService.deleteAnswer(qnaAnswerDto);
		return "redirect:/v1/qna/qnaAnswersXdmList";
	}
	
	//qna 질문
//	@RequestMapping(value = "/v1/qna/qnaRequestsXdmList")
//	public String qnaRequestsXdmList(Model model,@ModelAttribute("vo") QnaRequestVo qnaRequestVo) {
//		qnaRequestVo.setShDateStart(qnaRequestVo.getShDateStart() == null || qnaRequestVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaRequestVo.getShDateStart()));
//		qnaRequestVo.setShDateEnd(qnaRequestVo.getShDateEnd() == null || qnaRequestVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaRequestVo.getShDateEnd()));
//		qnaRequestVo.setParamsPaging(qnaService.listCountR(qnaRequestVo));
//		model.addAttribute("list",qnaService.selectListRequest(qnaRequestVo));
//		System.out.println("qnaService.selectListRequest(qnaRequestVo):"+qnaService.selectListRequest(qnaRequestVo).get(0).getQaSeq());
//		model.addAttribute("formLink", "qnaRequestsXdmForm");
//		return "xdm/v1/qna/qnaRequestsXdmList";
//	}
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmForm")
	public String qnaRequestsXdmForm(Model model, QnaDto qnaDto) {
		model.addAttribute("item", qnaService.selectOneRequest(qnaDto));
		model.addAttribute("listLink", "qnaRequestsXdmList");
		return "xdm/v1/qna/qnaRequestsXdmForm";
	}
	
	
//	@RequestMapping(value = "/v1/qna/qnaRequestsXdmMFom")
//	public String qnaRequestsXdmMFom(Model model,QnaDto qnaDto) {
//		model.addAttribute("item", qnaService.selectOneRequest(qnaDto));
//		model.addAttribute("listLink", "qnaRequestsXdmList");
//		return "/xdm/v1/qna/qnaRequestsXdmMFom";
//	}
	
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmUpdt")
	public String qnaRequestsXdmInst(QnaDto qnaDto) {
		qnaService.updateRequest(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
	
	
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmUete")
	public String qnaRequestsXdmUete(QnaDto qnaDto) {
//		qnaService.ueleteRequest(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
	
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmDete")
	public String qnaRequestsXdmDete(QnaDto qnaDto) {
		qnaService.deleteRequest(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
	
	//통합
	
	@RequestMapping(value = "/v1/qna/qnaRequestsXdmList")
	public String qnaRequestsXdmList(Model model,@ModelAttribute("vo") QnaVo qnaRequestVo) {
		qnaRequestVo.setShDateStart(qnaRequestVo.getShDateStart() == null || qnaRequestVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaRequestVo.getShDateStart()));
		qnaRequestVo.setShDateEnd(qnaRequestVo.getShDateEnd() == null || qnaRequestVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaRequestVo.getShDateEnd()));
		qnaRequestVo.setParamsPaging(qnaService.listCountReg(qnaRequestVo));
		model.addAttribute("list",qnaService.selectListQnaReq(qnaRequestVo));
//		System.out.println("qnaService.selectListQnaReq(qnaRequestVo):"+qnaService.selectListRequest(qnaRequestVo).get(0).getQaSeq());
		model.addAttribute("formLink", "qnaRequestsXdmForm");
		return "xdm/v1/qna/qnaRequestsXdmList";
	}
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmMFom")
	public String qnaAnswersXdmMFom(Model model,QnaDto qnaDto) {
		model.addAttribute("item", qnaService.selectOneQnaReq(qnaDto));
		model.addAttribute("listLink", "qnaAnswersXdmList");
		return "/xdm/v1/qna/qnaAnswersXdmMFom";
	}
	
	@RequestMapping(value = "/v1/qna/qnaRequestsInst")
	public String qnaRequestsInst(QnaDto qnaDto) {
		
		//담당자배정
		List<StaffMemberDto> type = memberService.staffSeqList();
		
		Random random = new Random();
	    StaffMemberDto randomStaff = type.get(random.nextInt(type.size()));
	    
	    qnaDto.setStaffMember_sfSeq(randomStaff.getSfSeq());
	    qnaService.insertRequest(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
	
	//qna 답변
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmList")
	public String qnaAnswersXdmList(Model model,@ModelAttribute("vo") QnaVo qnaAnswerVo) {
		qnaAnswerVo.setShDateStart(qnaAnswerVo.getShDateStart() == null || qnaAnswerVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaAnswerVo.getShDateStart()));
		qnaAnswerVo.setShDateEnd(qnaAnswerVo.getShDateEnd() == null || qnaAnswerVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaAnswerVo.getShDateEnd()));
		qnaAnswerVo.setParamsPaging(qnaService.listCountAns(qnaAnswerVo));
		model.addAttribute("list",qnaService.selectListQnaAns(qnaAnswerVo));
		model.addAttribute("formLink", "qnaAnswersXdmForm");
		return "xdm/v1/qna/qnaAnswersXdmList";
	}
	
	@RequestMapping(value = "/v1/qna/qnaXdmUpdt")
	public String qnaXdmUpdt(QnaDto qnaDto) {
		qnaService.updateQna(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
}
