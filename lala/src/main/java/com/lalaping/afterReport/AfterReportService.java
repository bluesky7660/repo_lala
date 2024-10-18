package com.lalaping.afterReport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfterReportService {
	
	@Autowired
	AfterReportDao afterReportDao;
	
	public List<AfterReportDto> afterReportSelectList(AfterReportVo afterReportvo){
		return afterReportDao.afterReportSelectList(afterReportvo);
	};
	public int afterReportlistCount(AfterReportVo afterReportvo) {
		return afterReportDao.afterReportlistCount(afterReportvo);
	}
	
	// CRUD
    public int insertAfterReport(AfterReportDto afterReportDto) {
        return afterReportDao.afterReportInsert(afterReportDto);
    }
    public int updateAfterReport(AfterReportDto afterReportDto) {
        return afterReportDao.afterReportUpdate(afterReportDto);
    }
    public int deleteAfterReport(AfterReportDto afterReportDto) {
        return afterReportDao.afterReportUelete(afterReportDto);
    }
    public int ueleteAfterReport(AfterReportDto afterReportDto) {
        return afterReportDao.afterReportDelete(afterReportDto);
    }
}	
