package com.lalaping.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

//	StaffMember
public interface MemberDao {
	public List<StaffMemberDto> selectList(StaffMemberVo staffMemberVo);
	public int listCount(StaffMemberVo staffMemberVo);

//	UserMember
	public List<UserMemberDto> selectList(UserMemberVo userMemberVo);
	public int listCount(UserMemberVo userMemberVo);
}
