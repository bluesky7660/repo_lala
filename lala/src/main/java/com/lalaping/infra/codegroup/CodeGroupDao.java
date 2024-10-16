package com.lalaping.infra.codegroup;

import java.util.List;

import org.springframework.stereotype.Repository;


@Repository
public interface CodeGroupDao {
	public List<CodeGroupDto> selectList(CodeGroupVo vo);
	public int listCount(CodeGroupVo vo);
}
