package com.jafa.data;

import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

import com.jafa.AppTest;
import com.jafa.mapper.BoardMapper;
import com.jafa.model.BoardVO;

public class DataInsertTest extends AppTest{

	@Autowired
	BoardMapper mapper;

	@Test
	public void dataInsert() {
		
		for (int i = 1; i <= 412; i++) {
		
			BoardVO vo= new BoardVO();
			vo.setTitle("페이징 처리 연습"+i);
			vo.setContent("내용 페이징 처리 연습"+i);
			vo.setWriter("작성자");
			mapper.insert(vo);
		}
		
	}
}


