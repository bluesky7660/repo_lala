package com.lalaping.afterReport;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class AfterReportService {
	@Autowired
	AfterReportDao afterReportDao;
	
	public List<AfterReportDto> selectList(AfterReportVo afterReportVo){
		return afterReportDao.selectList(afterReportVo);
	}
	public AfterReportDto selectOne(AfterReportDto afterReportDto) {
		return afterReportDao.selectOne(afterReportDto); // DAO 호출
	}
	public int listCount(AfterReportVo afterReportvo) {
		return afterReportDao.listCount(afterReportvo);
	}
	
	// CRUD
    public int insert(AfterReportDto afterReportDto) {
        return afterReportDao.insert(afterReportDto);
    }
    public int update(AfterReportDto afterReportDto) {
        return afterReportDao.update(afterReportDto);
    }
    public int delete(AfterReportDto afterReportDto) {
        return afterReportDao.uelete(afterReportDto);
    }
    public int uelete(AfterReportDto afterReportDto) {
        return afterReportDao.delete(afterReportDto);
    }
}	