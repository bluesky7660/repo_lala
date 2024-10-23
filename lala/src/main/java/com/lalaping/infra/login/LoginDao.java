package com.lalaping.infra.login;

import org.springframework.stereotype.Repository;

import com.lalaping.infra.member.StaffMemberDto;

@Repository
public interface LoginDao {
	
	public StaffMemberDto selectStaffOneLogin(StaffMemberDto staffMemberDto); 
}