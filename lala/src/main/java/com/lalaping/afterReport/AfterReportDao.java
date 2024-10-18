package com.lalaping.afterReport;

import java.util.List;

import org.springframework.stereotype.Repository;

@Repository
public interface AfterReportDao {
	
	public List<AfterReportDto> afterReportSelectList(AfterReportVo afterReportvo);
	public int afterReportlistCount(AfterReportVo afterReportvo);

	public int afterReportInsert(AfterReportDto afterReportDto);
	public int afterReportUpdate(AfterReportDto afterReportDto);
	public int afterReportUelete(AfterReportDto afterReportDto);
	public int afterReportDelete(AfterReportDto afterReportDto);
}