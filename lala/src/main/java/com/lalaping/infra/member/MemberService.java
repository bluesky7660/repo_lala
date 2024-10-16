package com.lalaping.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {

	@Autowired
	MemberDao memberDao;
	
	public List<StaffMemberDto> selectList(StaffMemberVo vo){
		return memberDao.selectList(vo);
	};
	public int listCount(StaffMemberVo vo) {
		return memberDao.listCount(vo);
	}
	
	public List<UserMemberDto> selectList(UserMemberVo vo){
		return memberDao.selectList(vo);
	};
	public int listCount(UserMemberVo vo) {
		return memberDao.listCount(vo);
	}
}
