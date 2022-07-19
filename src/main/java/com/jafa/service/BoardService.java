package com.jafa.service;

import java.util.List;

import com.jafa.model.BoardVO;
import com.jafa.model.Criteria;

public interface BoardService {

	List<BoardVO> readAll(Criteria criteria);
	BoardVO read(Long bno);
	void register(BoardVO vo);
	void modify(BoardVO vo);
	void remove(Long bno);
}
