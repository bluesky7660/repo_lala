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
	private MemberService memberService;

	// StaffMember 영역
	@RequestMapping(value = "/v1/member/staffMemberXdmList")
	public String staffMemberXdmList(@ModelAttribute("vo") StaffMemberVo staffMemberVo, Model model) {
		System.out.println("시작날: " + staffMemberVo.getShDateStart());
		System.out.println("마감날: " + staffMemberVo.getShDateEnd());

		staffMemberVo.setShDateStart(
				staffMemberVo.getShDateStart() == null || staffMemberVo.getShDateStart().isEmpty() ? null
						: UtilDateTime.add00TimeString(staffMemberVo.getShDateStart()));
		staffMemberVo.setShDateEnd(staffMemberVo.getShDateEnd() == null || staffMemberVo.getShDateEnd().isEmpty() ? null
				: UtilDateTime.add59TimeString(staffMemberVo.getShDateEnd()));

//		System.out.println("패스워드:"+memberService.selectStaffMemberList(staffMemberVo).get(0).getSfPasswd());
		model.addAttribute("list", memberService.selectStaffMemberList(staffMemberVo));
		model.addAttribute("formLink", "staffMemberXdmForm");
		return "/xdm/v1/member/stf/staffMemberXdmList";
	}

	@RequestMapping(value = "/v1/member/staffMemberXdmForm")
	public String staffMemberXdmForm(Model model) {
		model.addAttribute("listLink", "staffMemberXdmList");
		return "/xdm/v1/member/stf/staffMemberXdmForm";
	}
	@RequestMapping(value = "/v1/member/staffMemberXdmMfom")
	public String staffMemberXdmMfom(Model model) {
		model.addAttribute("listLink", "staffMemberXdmList");
		return "/xdm/v1/member/stf/staffMemberXdmMfom";
	}

	// CRUD
	@RequestMapping(value = "/v1/member/staffMemberXdmInst")
	public String staffMemberXdmInst(StaffMemberDto staffMemberDto) {
		System.out.println("StaffMemberDto.getsfName(): " + staffMemberDto.getSfSeq());
		int inst = memberService.insertStaffMember(staffMemberDto);
		System.out.println("memberService.insertStaffMember(staffMemberDto): " + inst);
		return "redirect:/v1/member/staffMemberXdmList";
	}
	@RequestMapping(value = "/v1/member/staffMemberXdmUpdate")
	public String staffMemberXdmUpdate(StaffMemberDto staffMemberDto) {
		System.out.println("StaffMemberDto.getsfSeq(): " + staffMemberDto.getSfSeq());
		int updt = memberService.updateStaffMember(staffMemberDto);
		System.out.println("memberService.updateStaffMember(staffMemberDto): " + updt);
		return "redirect:/v1/member/staffMemberXdmList";
	}
	@RequestMapping(value = "/v1/member/staffMemberXdmDelete")
	public String staffMemberXdmDelete(StaffMemberDto staffMemberDto) {
		System.out.println("StaffMemberDto.getsfSeq(): " + staffMemberDto.getSfSeq());
		int delt = memberService.deleteStaffMember(staffMemberDto);
		System.out.println("memberService.deleteStaffMember(staffMemberDto): " + delt);
		return "redirect:/v1/member/staffMemberXdmList";
	}
	@RequestMapping(value = "/v1/member/staffMemberXdmUelete")
	public String staffMemberXdmUelete(StaffMemberDto staffMemberDto) {
		System.out.println("StaffMemberDto.getsfSeq(): " + staffMemberDto.getSfSeq());
		int uelt = memberService.ueleteStaffMember(staffMemberDto);
		System.out.println("memberService.ueleteStaffMember(staffMemberDto): " + uelt);
		return "redirect:/v1/member/staffMemberXdmList";
	}
	
	//-------------------------------------------------------------------
	
	// UserMember 영역
	@RequestMapping(value = "/v1/member/userMemberXdmList")
	public String userMemberXdmList(@ModelAttribute("vo") UserMemberVo userMemberVo, Model model) {
	    System.out.println("시작날: " + userMemberVo.getShDateStart());
	    System.out.println("마감날: " + userMemberVo.getShDateEnd());

	    userMemberVo.setShDateStart(
	        userMemberVo.getShDateStart() == null || userMemberVo.getShDateStart().isEmpty() ? null
	            : UtilDateTime.add00TimeString(userMemberVo.getShDateStart()));
	    userMemberVo.setShDateEnd(userMemberVo.getShDateEnd() == null || userMemberVo.getShDateEnd().isEmpty() ? null
	            : UtilDateTime.add59TimeString(userMemberVo.getShDateEnd()));
	    System.out.println("패스워드:"+memberService.selectUserMemberList(userMemberVo).get(0).getUmPasswd());
	    model.addAttribute("list", memberService.selectUserMemberList(userMemberVo));
	    model.addAttribute("formLink", "userMemberXdmForm");
	    return "/xdm/v1/member/usr/userMemberXdmList";
	}

	@RequestMapping(value = "/v1/member/userMemberXdmForm")
	public String userMemberXdmForm(Model model) {
//		model.addAttribute("userItem", memberService.selectUserMemberList(userMemberVo));
		model.addAttribute("listLink", "userMemberXdmList");
	    return "/xdm/v1/member/usr/userMemberXdmForm";
	}
	@RequestMapping(value = "/v1/member/userMemberXdmMfom")
	public String userMemberXdmMfom(Model model) {
		model.addAttribute("listLink", "userMemberXdmList");
	    return "/xdm/v1/member/usr/userMemberXdmMfom";
	}

	// CRUD
	@RequestMapping(value = "/v1/infra/member/userMemberXdmInst")
	public String userMemberXdmInst(UserMemberDto userMemberDto) {
	    System.out.println("UserMemberDto.getUmName(): " + userMemberDto.getUmName());
	    int inst = memberService.insertUserMember(userMemberDto);
	    System.out.println("memberService.insertUserMember(userMemberDto): " + inst);
	    return "redirect:/v1/member/userMemberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/userMemberXdmUpdate")
	public String userMemberXdmUpdate(UserMemberDto userMemberDto) {
	    System.out.println("UserMemberDto.getUmSeq(): " + userMemberDto.getUmSeq());
	    int updt = memberService.updateUserMember(userMemberDto);
	    System.out.println("memberService.updateUserMember(userMemberDto): " + updt);
	    return "redirect:/v1/member/userMemberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/userMemberXdmDelete")
	public String userMemberXdmDelete(UserMemberDto userMemberDto) {
	    System.out.println("UserMemberDto.getUmSeq(): " + userMemberDto.getUmSeq());
	    int delt = memberService.deleteUserMember(userMemberDto);
	    System.out.println("memberService.deleteUserMember(userMemberDto): " + delt);
	    return "redirect:/v1/member/userMemberXdmList";
	}
	@RequestMapping(value = "/v1/infra/member/userMemberXdmUelete")
	public String userMemberXdmUelete(UserMemberDto userMemberDto) {
	    System.out.println("UserMemberDto.getUmSeq(): " + userMemberDto.getUmSeq());
	    int uelt = memberService.ueleteUserMember(userMemberDto);
	    System.out.println("memberService.ueleteUserMember(userMemberDto): " + uelt);
	    return "redirect:/v1/member/userMemberXdmList";
	}

}