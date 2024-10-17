package com.lalaping.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;

//	StaffMember
	public List<StaffMemberDto> staffSelectList(StaffMemberVo staffMemberVo) {
		return memberDao.staffSelectList(staffMemberVo);
	}
	public int staffListCount(StaffMemberVo staffMemberVo) {
		return memberDao.staffListCount(staffMemberVo);
	}

//	UserMember
	public List<UserMemberDto> userSelectList(UserMemberVo userMemberVo) {
		return memberDao.userSelectList(userMemberVo);
	}
	public int userListCount(UserMemberVo userMemberVo) {
		return memberDao.userListCount(userMemberVo);
	}
}
