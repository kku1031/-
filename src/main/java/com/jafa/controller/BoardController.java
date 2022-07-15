package com.jafa.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.jafa.model.BoardVO;
import com.jafa.service.BoardService;

@Controller
@RequestMapping("/board")
public class BoardController {
	
	private BoardService service;	
	
	@Autowired
	@Qualifier("boardServiceImplBB")
	public void setService(BoardService service) {
		this.service = service;
	}

	@GetMapping("/list")
	public String getList(Model model) {
		List<BoardVO> readAll = service.readAll();
		System.out.println(readAll);
		model.addAttribute("list", readAll);
		return "board/list";
	}
	
	@GetMapping("/get")
	public String get(Long bno, Model model) {
		System.out.println(bno);
		model.addAttribute("board",service.read(bno));
		return "board/get";
	}
}
