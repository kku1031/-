package com.jafa.mapper;

import java.util.List;

import com.jafa.model.BoardVO;
import com.jafa.model.Criteria;

public interface BoardMapper {

	List<BoardVO> getList(Criteria criteria);
	BoardVO get(Long bno);
	void insert(BoardVO vo);
	void update(BoardVO vo);
	void delete(Long bno);
}
