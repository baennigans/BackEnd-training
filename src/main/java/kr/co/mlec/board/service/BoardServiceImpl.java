package kr.co.mlec.board.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;

import kr.co.mlec.board.dao.BoardDAO;
import kr.co.mlec.board.vo.BoardVO;

public class BoardServiceImpl implements BoardService {

	@Autowired
	private BoardDAO boardDAO;
	
	@Override
	public List<BoardVO> getBoardList() {
		List<BoardVO> boardList = boardDAO.selectAllBoard();
		return boardList;
	}

}
