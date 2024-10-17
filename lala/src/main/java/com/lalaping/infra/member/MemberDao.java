package com.lalaping.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository

//	StaffMember
public interface MemberDao {
	public List<StaffMemberDto> staffSelectList(StaffMemberVo staffMemberVo);
	public int staffListCount(StaffMemberVo staffMemberVo);

//	UserMember
	public List<UserMemberDto> userSelectList(UserMemberVo userMemberVo);
	public int userListCount(UserMemberVo userMemberVo);
}
