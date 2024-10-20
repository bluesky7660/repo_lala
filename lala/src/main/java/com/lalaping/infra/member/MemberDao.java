package com.lalaping.infra.member;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface MemberDao {
	
	// StaffMember
	public List<StaffMemberDto> staffSelectList(StaffMemberVo staffMemberVo);
	public List<StaffMemberDto> staffTypeList(StaffMemberVo staffMemberVo);
	public int staffListCount(StaffMemberVo staffMemberVo);

	public int insertStaffMember(StaffMemberDto staffMemberDto);
	public int updateStaffMember(StaffMemberDto staffMemberDto);
	public int ueleteStaffMember(StaffMemberDto staffMemberDto);
	public int deleteStaffMember(StaffMemberDto staffMemberDto);
	
	// UserMember
	public List<UserMemberDto> userSelectList(UserMemberVo userMemberVo);
	public int userlistCount(UserMemberVo userMemberVo);

	public int insertUserMember(UserMemberDto userMemberDto);
	public int updateUserMember(UserMemberDto userMemberDto);
	public int ueleteUserMember(UserMemberDto userMemberDto);
	public int deleteUserMember(UserMemberDto userMemberDto);
}