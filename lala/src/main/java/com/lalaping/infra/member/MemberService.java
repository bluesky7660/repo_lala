package com.lalaping.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;

//	StaffMember
	public List<StaffMemberDto> selectList(StaffMemberVo staffMemberVo) {
		return memberDao.selectList(staffMemberVo);
	}
	public int listCount(StaffMemberVo staffMemberVo) {
		return memberDao.listCount(staffMemberVo);
	}

//	UserMember
	public List<UserMemberDto> selectList(UserMemberVo userMemberVo) {
		return memberDao.selectList(userMemberVo);
	}
	public int listCount(UserMemberVo userMemberVo) {
		return memberDao.listCount(userMemberVo);
	}
}
