package com.lalaping.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	public List<StaffMemberDto> selectList(StaffMemberVo vo);
	public int listCount(StaffMemberVo vo);
	
	public List<UserMemberDto> selectList(UserMemberVo vo);
	public int listCount(UserMemberVo vo);
}
