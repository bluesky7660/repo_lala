package com.lalaping.infra.code;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface CodeDao {
	public List<CodeDto> selectList(CodeVo vo);
	public int listCount(CodeVo vo);
	public int insert(CodeDto codeDto);
	
	

}
