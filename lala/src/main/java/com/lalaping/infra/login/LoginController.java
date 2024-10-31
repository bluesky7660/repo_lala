package com.lalaping.infra.login;

import java.util.HashMap;
import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.lalaping.infra.member.StaffMemberDto;

import jakarta.servlet.http.HttpSession;

@Controller
public class LoginController {
	
	@Autowired
	LoginService loginService;

	@RequestMapping(value = "/v1/loginXdm")
	public String loginXdm() {
		return "/xdm/v1/loginXdm";
	}
	@RequestMapping(value = "/v1/signupXdm")
	public String signupXdm() {
		return "/xdm/v1/signupXdm";
	}

	@ResponseBody
	@RequestMapping(value = "/v1/infra/loginProc")
	public Map<String, Object> loginProc(StaffMemberDto staffMemberDto, HttpSession httpSession) throws Exception {
		Map<String, Object> returnMap = new HashMap<String, Object>(); 
		System.out.println("로그인 요청 - ID: " + staffMemberDto.getSfId() + ", PW: " + staffMemberDto.getSfPasswd());

		StaffMemberDto rtLogin = loginService.selectStaffOneLogin(staffMemberDto); 
		System.out.println("rtLogin : " +  loginService.selectStaffOneLogin(staffMemberDto));
		System.out.println("sessIdXdm : " +  rtLogin.getSfId());
		System.out.println("sessSeqXdm : " +  rtLogin.getSfSeq());
		System.out.println("sessNameXdm : " +  rtLogin.getSfName());
		System.out.println("로그인 정보 조회 결과: " + rtLogin);

		if (rtLogin != null) { 
			httpSession.setMaxInactiveInterval(60 * 30); 
			httpSession.setAttribute("sessIdXdm", rtLogin.getSfId()); 
			httpSession.setAttribute("sessSeqXdm", rtLogin.getSfSeq()); 
			httpSession.setAttribute("sessNameXdm", rtLogin.getSfName()); 
			httpSession.setAttribute("sessDeptXdm", rtLogin.getSfDept()); 

			returnMap.put("rt", "success"); 
		} else { 
			System.out.println("로그인 실패: " + staffMemberDto.getSfId()); 
			returnMap.put("rt", "fail"); 
		} 
		return returnMap; 
	} 

	@ResponseBody 
	@RequestMapping(value = "/v1/infra/logoutProc") 
	public Map<String, Object> logoutProc(HttpSession httpSession) throws Exception { 
		Map<String, Object> returnMap = new HashMap<>(); 
		httpSession.invalidate(); 
		System.out.println("Login Session 무효화 성공"); 
		returnMap.put("rt", "success"); 
		returnMap.put("redirectUrl", "/v1/loginXdm"); 
		return returnMap; 
	}
}