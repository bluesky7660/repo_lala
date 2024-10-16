package com.lalaping.infra.member;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lalaping.common.util.UtilDateTime;

@Controller
public class MemberController {
	@Autowired
	MemberService memberService;
	
	@RequestMapping(value = "/v1/infra/member/staffmemberXdmList")
	public String staffmemberXdmList(@ModelAttribute("vo") StaffMemberVo staffmemberVo, Model model) {
		System.out.println("시작날:"+staffmemberVo.getShDateStart());
		System.out.println("마감날:"+staffmemberVo.getShDateEnd());
		staffmemberVo.setShDateStart(staffmemberVo.getShDateStart() == null || staffmemberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(staffmemberVo.getShDateStart()));
		staffmemberVo.setShDateEnd(staffmemberVo.getShDateEnd() == null || staffmemberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(staffmemberVo.getShDateEnd()));
		staffmemberVo.setParamsPaging(memberService.listCount(staffmemberVo));
		System.out.println("nqonoifqs");
		model.addAttribute("list", memberService.selectList(staffmemberVo));
//		for(MemberDto item : memberService.selectList(memberVo)) {
//			System.out.println("리스트seq: " + item.get );
//		}
		return "/xdm/v1/infra/member/staffmemberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/usermemberXdmList")
	public String usermemberXdmList(@ModelAttribute("vo") UserMemberVo usermemberVo, Model model) {
		System.out.println("시작날:"+usermemberVo.getShDateStart());
		System.out.println("마감날:"+usermemberVo.getShDateEnd());
		usermemberVo.setShDateStart(usermemberVo.getShDateStart() == null || usermemberVo.getShDateStart() == "" ? null : UtilDateTime.add00TimeString(usermemberVo.getShDateStart()));
		usermemberVo.setShDateEnd(usermemberVo.getShDateEnd() == null || usermemberVo.getShDateEnd() == "" ? null : UtilDateTime.add59TimeString(usermemberVo.getShDateEnd()));
		usermemberVo.setParamsPaging(memberService.listCount(usermemberVo));
		System.out.println("nqonoifqs");
		model.addAttribute("list", memberService.selectList(usermemberVo));
//		for(MemberDto item : memberService.selectList(memberVo)) {
//			System.out.println("리스트seq: " + item.get );
//		}
		return "/xdm/v1/infra/member/usermemberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/staffMemberXdmForm")
	public String staffmemberXdmForm() {
	    return "/xdm/v1/infra/member/staffMemberXdmForm";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmForm")
	public String usermemberXdmForm() {
	    return "/xdm/v1/infra/member/userMemberXdmForm";
	}

	@RequestMapping(value = "/v1/infra/member/staffMemberXdmInst")
	public String staffmemberXdmInst(StaffMemberDto staffMemberDto) {
	    return "redirect:/v1/infra/member/staffmemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmInst")
	public String usermemberXdmInst(UserMemberDto userMemberDto) {
	    return "redirect:/v1/infra/member/usermemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/staffMemberXdmMfom")
	public String staffmemberXdmMfom(Model model, StaffMemberDto staffMemberDto) {
	    return "/xdm/v1/infra/member/staffmemberXdmMfom";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmMfom")
	public String usermemberXdmMfom(Model model, UserMemberDto userMemberDto) {
	    return "/xdm/v1/infra/member/usermemberXdmMfom";
	}

	@RequestMapping(value = "/v1/infra/member/staffMemberXdmUpdt")
	public String staffmemberXdmUpdt(StaffMemberDto staffMemberDto) {
	    return "redirect:/v1/infra/member/staffmemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmUpdt")
	public String usermemberXdmUpdt(UserMemberDto userMemberDto) {
	    return "redirect:/v1/infra/member/usermemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/staffMemberXdmUelt")
	public String staffmemberXdmUelt(StaffMemberDto staffMemberDto) {
	    return "redirect:/v1/infra/member/staffmemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmUelt")
	public String usermemberXdmUelt(UserMemberDto userMemberDto) {
	    return "redirect:/v1/infra/member/usermemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/staffMemberXdmDelt")
	public String staffmemberXdmDelt(StaffMemberDto staffMemberDto) {
	    return "redirect:/v1/infra/member/staffmemberXdmList";
	}

	@RequestMapping(value = "/v1/infra/member/userMemberXdmDelt")
	public String usermemberXdmDelt(UserMemberDto userMemberDto) {
	    return "redirect:/v1/infra/member/usermemberXdmList";
	}
}