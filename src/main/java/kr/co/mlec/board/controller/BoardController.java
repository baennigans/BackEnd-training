package kr.co.mlec.board.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;

import kr.co.mlec.board.service.BoardService;
import kr.co.mlec.board.vo.BoardVO;

@Controller
public class BoardController {

	
	@Autowired
	private BoardService boardService;

	
	@GetMapping("/board")
	public String list(HttpServletRequest request) {

		List<BoardVO> boardList = boardService.getBoardList();
		request.setAttribute("boardList", boardList);

//		return "board/list";
		return "board/list2";
	}

	
	// http://localhost:8080/Mission-Spring/board/detail?no=4
	@GetMapping("/board/detail")
	public String detail(@RequestParam("no") int no, HttpServletRequest request) {

		BoardVO board = boardService.getBoardByNo(no);
		request.setAttribute("board", board);

		return "board/detail";
	}

	
	// http://localhost:8080/Mission-Spring/board/12
	// http://localhost:8080/Mission-Spring/board/24
	// http://localhost:8080/Mission-Spring/board/3
	@GetMapping("/board/{no}")
	public String detail2(@PathVariable("no") int boardNo, HttpServletRequest request) {

		BoardVO board = boardService.getBoardByNo(boardNo);
		request.setAttribute("board", board);

		return "board/detail";
	}
}
