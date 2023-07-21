package kr.co.mlec.board.controller;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class BoardController {

	@GetMapping("/board")
	public String list() {
		return "board/list";
	}
	
}
