package com.lalaping.qna;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;
import com.lalaping.infra.member.MemberService;
import com.lalaping.infra.member.StaffMemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class QnaController {
	@Autowired
	QnaService qnaService;
	
	@Autowired
	MemberService memberService;
	
	//qna 답변
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmList")
//	public String qnaAnswersXdmList(Model model,@ModelAttribute("vo") QnaAnswerVo qnaVo) {
//		qnaVo.setShDateStart(qnaVo.getShDateStart() == null || qnaVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaVo.getShDateStart()));
//		qnaVo.setShDateEnd(qnaVo.getShDateEnd() == null || qnaVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaVo.getShDateEnd()));
//		qnaVo.setParamsPaging(qnaService.listCountA(qnaVo));
//		model.addAttribute("list",qnaService.selectListAnswer(qnaVo));
//		model.addAttribute("formLink", "qnaAnswersXdmForm");
//		return "xdm/v1/qna/qnaAnswersXdmList";
//	}
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmForm")
//	public String qnaAnswersXdmForm(Model model) {
//		model.addAttribute("listLink", "qnaAnswersXdmList");
//		return "xdm/v1/qna/qnaAnswersXdmForm";
//	}
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
	
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmUete")
//	public String qnaAnswersXdmUete(QnaAnswerDto qnaAnswerDto) {
//		qnaService.ueleteAnswer(qnaAnswerDto);
//		return "redirect:/v1/qna/qnaAnswersXdmList";
//	}
//	
//	@RequestMapping(value = "/v1/qna/qnaAnswersXdmDete")
//	public String qnaAnswersXdmDete(QnaAnswerDto qnaAnswerDto) {
//		qnaService.deleteAnswer(qnaAnswerDto);
//		return "redirect:/v1/qna/qnaAnswersXdmList";
//	}
	
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
	public String qnaRequestsXdmList(Model model, HttpSession httpSession,@ModelAttribute("vo") QnaVo qnaRequestVo) {
		qnaRequestVo.setShDateStart(qnaRequestVo.getShDateStart() == null || qnaRequestVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaRequestVo.getShDateStart()));
		qnaRequestVo.setShDateEnd(qnaRequestVo.getShDateEnd() == null || qnaRequestVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaRequestVo.getShDateEnd()));
		qnaRequestVo.setParamsPaging(qnaService.listCountReg(qnaRequestVo));
		System.out.println("seq:"+httpSession.getAttribute("sessSeqXdm"));
		System.out.println("type:"+httpSession.getAttribute("sessSeqXdm").getClass().getName());
		// 세션에서 값을 가져오고, 문자열로 캐스팅한 후 int로 변환하여 설정
		// 세션에서 Integer 값을 가져와 String으로 변환 (Integer.toString() 사용)
		String sessSeqXdm = String.valueOf(httpSession.getAttribute("sessSeqXdm")) ;
		qnaRequestVo.setSessSeqXdm(sessSeqXdm);
		model.addAttribute("list",qnaService.selectListQnaReq(qnaRequestVo));
//		System.out.println("qnaService.selectListQnaReq(qnaRequestVo):"+qnaService.selectListRequest(qnaRequestVo).get(0).getQaSeq());
		model.addAttribute("formLink", "qnaRequestsXdmForm");
		return "xdm/v1/qna/qnaRequestsXdmList";
	}
	@RequestMapping(value = "/v1/qna/qnaAnswersXdmMFom")
	public String qnaAnswersXdmMFom(Model model,HttpSession httpSession, QnaDto qnaDto) {
		System.out.println("httpSession:"+httpSession.getAttribute("sessSeqXdm"));
		System.out.println("item:"+qnaService.selectOneQnaAns(qnaDto).getStaffMember_sfSeq());
		model.addAttribute("item", qnaService.selectOneQnaAns(qnaDto));
		model.addAttribute("listLink", "qnaAnswersXdmList");
		return "/xdm/v1/qna/qnaAnswersXdmMFom";
	}
	
	@RequestMapping(value = "/v1/qna/qnaXdmComplete")
	public String qnaAnswersXdmComplete(Model model,QnaDto qnaDto) {
		model.addAttribute("item", qnaService.selectOneQnaReq(qnaDto));
		model.addAttribute("listLink", "qnaAnswersXdmList");
		return "/xdm/v1/qna/qnaXdmComplete";
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
	public String qnaAnswersXdmList(Model model, HttpSession httpSession,@ModelAttribute("vo") QnaVo qnaVo) {
		qnaVo.setShDateStart(qnaVo.getShDateStart() == null || qnaVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(qnaVo.getShDateStart()));
		qnaVo.setShDateEnd(qnaVo.getShDateEnd() == null || qnaVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(qnaVo.getShDateEnd()));
		qnaVo.setParamsPaging(qnaService.listCountAns(qnaVo));
		String sessSeqXdm = String.valueOf(httpSession.getAttribute("sessSeqXdm")) ;
		qnaVo.setSessSeqXdm(sessSeqXdm);
		model.addAttribute("list",qnaService.selectListQnaAns(qnaVo));
		model.addAttribute("formLink", "qnaAnswersXdmForm");
		return "xdm/v1/qna/qnaAnswersXdmList";
	}
	
	@RequestMapping(value = "/v1/qna/qnaXdmUpdt")
	public String qnaXdmUpdt(QnaDto qnaDto) {
		qnaService.updateQna(qnaDto);
		return "redirect:/v1/qna/qnaRequestsXdmList";
	}
}
