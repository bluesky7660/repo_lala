package com.lalaping.infra.login;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.lalaping.infra.member.StaffMemberDto;

@Service
public class LoginService {
	
	@Autowired
	LoginDao loginDao;
	
	public StaffMemberDto selectStaffOneLogin(StaffMemberDto staffMemberDto) {
		return loginDao.selectStaffOneLogin(staffMemberDto);
	}
}