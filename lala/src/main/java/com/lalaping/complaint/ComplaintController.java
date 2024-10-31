package com.lalaping.complaint;

import java.util.List;
import java.util.Random;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;
import com.lalaping.infra.code.CodeService;
import com.lalaping.infra.member.MemberService;
import com.lalaping.infra.member.StaffMemberDto;
import com.lalaping.infra.member.StaffMemberVo;

import jakarta.servlet.http.HttpSession;

@Controller
public class ComplaintController {
	@Autowired
	ComplaintService complaintService;
	@Autowired
	MemberService memberService;
	@Autowired
	CodeService codeService;
//	민원 reception
	
	@RequestMapping(value = "/v1/complaint/receptionXdmList")
	public String receptionXdmList(@ModelAttribute("vo") ComplaintVo vo ,Model model) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(complaintService.receptionListCount(vo));
		model.addAttribute("list", complaintService.receptionSelectList(vo));
		model.addAttribute("formLink", "receptionXdmForm");
		return "xdm/v1/complaint/receptionXdmList";
	} 
	@RequestMapping(value = "/v1/complaint/receptionXdmForm")
	public String receptionXdmForm(Model model) {
		model.addAttribute("listLink", "receptionXdmList");
		return "/xdm/v1/complaint/receptionXdmForm";
	}
	@RequestMapping(value = "/v1/complaint/recepitonInst")
	public String recepitonInst(ComplaintDto complaintDto, StaffMemberVo staffMemberVo) {
		complaintService.rcInsert(complaintDto);
		//담당자배정
		List<StaffMemberDto> type = memberService.staffSeqList();
		
		Random random = new Random();
	    StaffMemberDto randomStaff = type.get(random.nextInt(type.size()));
	    
	    complaintDto.setStaffMember_sfSeq(randomStaff.getSfSeq());
	    
	    complaintDto.setReception_rcSeq(complaintDto.getRcSeq());
		complaintService.awInsert(complaintDto);
		return "redirect:/v1/complaint/receptionXdmList";
	}
	
	@RequestMapping(value = "/v1/complaint/receptionXdmMFom")
	public String receptionXdmMFom(Model model,ComplaintDto complaintDto) {
		model.addAttribute("item", complaintService.rcSelectOne(complaintDto));
		model.addAttribute("listLink", "receptionXdmList");
		return "/xdm/v1/complaint/receptionXdmMFom";
	}
	
	/*
	 * @RequestMapping(value = "/v1/complaint/receptionXdmUpdt") public String
	 * receptionXdmInst(ComplaintDto receptionDto,ComplaintDto answerDto) {
	 * System.out.println("receptionXdmUpdt");
	 * complaintService.rcUpdate(receptionDto); System.out.println("awInsert");
	 * complaintService.awInsert(answerDto); return
	 * "redirect:/v1/complaint/answerXdmList"; }
	 */
	
	@RequestMapping(value = "/v1/complaint/receptionXdmUete")
	public String receptionXdmUete(ComplaintDto complaintDto) {
		complaintService.rcUelete(complaintDto);
		return "redirect:/v1/complaint/receptionXdmList";
	}
	
	@RequestMapping(value = "/v1/complaint/receptionXdmDete")
	public String receptionXdmDete(ComplaintDto complaintDto) {
		complaintService.rcDelete(complaintDto);
		return "redirect:/v1/complaint/receptionXdmList";
	}
	
//	답변 answer
	
	@RequestMapping(value = "/v1/complaint/answerXdmList")
	public String answerXdmList(@ModelAttribute("vo") ComplaintVo vo ,Model model,HttpSession httpSession) {
		vo.setShDateStart(vo.getShDateStart() == null || vo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(vo.getShDateStart()));
		vo.setShDateEnd(vo.getShDateEnd() == null || vo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(vo.getShDateEnd()));
		vo.setParamsPaging(complaintService.answerListCount(vo));
		String sessSeqXdm = String.valueOf(httpSession.getAttribute("sessSeqXdm")) ;
		vo.setSessSeqXdm(sessSeqXdm);
		model.addAttribute("list", complaintService.answerSelectList(vo));
		return "/xdm/v1/complaint/answerXdmList";
	}
	@RequestMapping(value = "/v1/complaint/answerXdmMFom")
	public String answerXdmMFom(Model model,ComplaintDto complaintDto) {
		model.addAttribute("item", complaintService.awSelectOne(complaintDto));
		return "/xdm/v1/complaint/answerXdmMFom";
	}
	@RequestMapping(value = "/v1/complaint/answerXdmComplete")
	public String answerXdmComplete(Model model,ComplaintDto complaintDto) {
		model.addAttribute("item", complaintService.awSelectOne(complaintDto));
		model.addAttribute("listLink", "answerXdmList");
		return "/xdm/v1/complaint/answerXdmComplete";
	}
	@RequestMapping(value = "/v1/complaint/answerXdmUpdt")
	public String answerXdmUpdt(ComplaintDto complaintDto) {
		complaintService.rcUpdate(complaintDto);
		complaintService.awUpdate(complaintDto);
		return "redirect:/v1/complaint/answerXdmList";
	}
	@RequestMapping(value = "/v1/complaint/answerXdmUete")
	public String answerXdmUete(ComplaintDto complaintDto) {
		complaintService.awUelete(complaintDto);
		return "redirect:/v1/complaint/answerXdmList";
	}
	@RequestMapping(value = "/v1/complaint/answerXdmDete")
	public String answerXdmDete(ComplaintDto complaintDto) {
		complaintService.awDelete(complaintDto);
		return "redirect:/v1/complaint/answerXdmList";
	}

}
