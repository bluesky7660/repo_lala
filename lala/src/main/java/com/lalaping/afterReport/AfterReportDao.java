package com.lalaping.afterReport;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AfterReportDao {
	
	public List<AfterReportDto> selectList(AfterReportVo afterReportVo);
	public AfterReportDto selectOne(AfterReportDto afterReportDto);
	public int listCount(AfterReportVo afterReportvo);
	public int insert(AfterReportDto afterReportDto);
	public int update(AfterReportDto afterReportDto);
	public int uelete(AfterReportDto afterReportDto);
	public int delete(AfterReportDto afterReportDto);
}