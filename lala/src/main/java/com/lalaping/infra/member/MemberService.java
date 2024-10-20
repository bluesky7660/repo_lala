package com.lalaping.infra.member;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class MemberService {
	
	@Autowired
	public MemberDao memberDao;

	// StaffMember
    public List<StaffMemberDto> selectStaffMemberList(StaffMemberVo staffMemberVo) {
    	return memberDao.staffSelectList(staffMemberVo);
    }
    public List<StaffMemberDto> staffTypeList(StaffMemberVo staffMemberVo) {
    	return memberDao.staffTypeList(staffMemberVo);
    }
    public int listCountStaffMember(StaffMemberVo staffMemberVo) {
        return memberDao.staffListCount(staffMemberVo);
    }
    
    // StaffMember CRUD
    public int insertStaffMember(StaffMemberDto staffMemberDto) {
        return memberDao.insertStaffMember(staffMemberDto);
    }
    public int updateStaffMember(StaffMemberDto staffMemberDto) {
        return memberDao.updateStaffMember(staffMemberDto);
    }
    public int deleteStaffMember(StaffMemberDto staffMemberDto) {
        return memberDao.deleteStaffMember(staffMemberDto);
    }
    public int ueleteStaffMember(StaffMemberDto staffMemberDto) {
        return memberDao.ueleteStaffMember(staffMemberDto);
    }

    // UserMember 
    public List<UserMemberDto> selectUserMemberList(UserMemberVo userMemberVo) {
        return memberDao.userSelectList(userMemberVo);
    }
    public int listCountUserMember(UserMemberVo userMemberVo) {
        return memberDao.userlistCount(userMemberVo);
    }
    
    // UserMember CRUD
    public int insertUserMember(UserMemberDto userMemberDto) {
        return memberDao.insertUserMember(userMemberDto);
    }
    public int updateUserMember(UserMemberDto userMemberDto) {
        return memberDao.updateUserMember(userMemberDto);
    }
    public int deleteUserMember(UserMemberDto userMemberDto) {
        return memberDao.deleteUserMember(userMemberDto);
    }
    public int ueleteUserMember(UserMemberDto userMemberDto) {
        return memberDao.ueleteUserMember(userMemberDto);
    }
}
