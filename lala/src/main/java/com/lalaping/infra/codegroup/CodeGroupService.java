package com.lalaping.infra.codegroup;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class CodeGroupService {
	@Autowired
	CodeGroupDao codeGroupDao;
	
	public List<CodeGroupDto> selectList(CodeGroupVo vo){
		return codeGroupDao.selectList(vo);
	};
	public int listCount(CodeGroupVo vo) {
		return codeGroupDao.listCount(vo);
	}
}
