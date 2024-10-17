package com.lalaping.qna;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class QnaService {
	@Autowired
	QnaDao qnaDao;
	
	public int listCountA(QnaVo vo) {
		return qnaDao.listCountA(vo);
	}
	public int listCountR(QnaVo vo) {
		return qnaDao.listCountR(vo);
	}
}
