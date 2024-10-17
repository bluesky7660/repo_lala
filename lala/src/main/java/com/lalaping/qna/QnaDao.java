package com.lalaping.qna;

import org.springframework.stereotype.Repository;

@Repository
public interface QnaDao {
	public int listCountA(QnaVo vo);
	public int listCountR(QnaVo vo);
}
