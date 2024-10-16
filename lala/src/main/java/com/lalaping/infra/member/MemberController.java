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
	
	@RequestMapping(value = "/v1/infra/member/userMemberXdmList")
	public String userMemberXdmList(@ModelAttribute("vo") UserMemberVo usermemberVo, Model model) {
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
		
		return "/xdm/v1/infra/member/userMemberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/memberXdmList")
	public String memberXdmList(@ModelAttribute("vo") StaffMemberVo staffmemberVo, Model model) {
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
		
		return "/xdm/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmForm")
	public String memberXdmForm() {
		return "/xdm/v1/infra/member/memberXdmForm";
	}
	 
	@RequestMapping(value = "/v1/infra/member/memberXdmInst")
	public String memberXdmInst(StaffMemberDto staffmemberDto, UserMemberDto usermemberDto) {

		return "redirect:/v1/infra/member/memberXdmList";
	}
	
	@RequestMapping(value = "/v1/infra/member/memberXdmMfom")
	public String memberXdmMfom(Model model,StaffMemberDto staffmemberDto, UserMemberDto usermemberDto) {

		return "xdm/v1/infra/member/memberXdmMfom";
	}
	@RequestMapping(value = "/v1/infra/member/memberXdmUpdt")
	public String memberXdmUpdt(StaffMemberDto staffmemberDto, UserMemberDto usermemberDto) {

		return "redirect:/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/memberXdmUelt")
	public String memberXdmUelt(StaffMemberDto staffmemberDto, UserMemberDto usermemberDto) {

		return "redirect:/v1/infra/member/memberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/memberXdmDelt")
	public String memberXdmDelt(StaffMemberDto staffmemberDto, UserMemberDto usermemberDto) {

		return "redirect:/v1/infra/member/memberXdmList";
	}
}