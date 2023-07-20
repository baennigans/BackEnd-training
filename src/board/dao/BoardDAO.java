package board.dao;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import board.vo.BoardVO;

public class BoardDAO {

	private SqlSession session;
	
	
	public BoardDAO() {
		session = new MyConfig().getInstance();
	}
	
	
	public void work() {
//		insert();
//		select();
//		selectOne();
//		selectWhere();
//		selectWhere2();
		selectWhere3();
	}
	
	
	public void insert() {
		
		BoardVO board = new BoardVO();
		board.setTitle("VO·Î »ðÀÔ");
		board.setWriter("hong");
		
		int cnt = session.insert("board.dao.BoardDAO.insert", board);
		session.commit();
		System.out.println("ÃÑ »ðÀÔ °³¼ö : "+cnt);
	}
	
	
	public void select() {
		//ÀüÃ¼°Ô½Ã±Û Á¶È¸
//		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectAll");
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectAll2");
		
		for(BoardVO board : list) {
			System.out.println(board);
		}
	}
	
	
	public void selectOne() {
		
		int boardNo = 41;
		BoardVO result = session.selectOne("board.dao.BoardDAO.selectByNo", boardNo);
		System.out.println(result);
		
		BoardVO board = new BoardVO();
		board.setNo(41);
		result = session.selectOne("board.dao.BoardDAO.selectByNo2", board);
		System.out.println(result);
	}
	
	
	public void selectWhere() {
		
		BoardVO board = new BoardVO();
		board.setTitle("Á¦¸ñÀÌ¿À");
//		board.setWriter("È«±æµÐ");
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectWhere", board);
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	
	public void selectWhere2() {
		
		Map<String, String> board = new HashMap<>();
		board.put("title", "Á¦¸ñÀÌ¿À");
		board.put("writer", "È«±æµ¿");
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectWhere2", board);
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	
	public void selectWhere3() {
		
		Map<String, String> board = new HashMap<>();
		board.put("no", "41");
		
		Map<String, Object> result = session.selectOne("board.dao.BoardDAO.selectWhere3", board);
		
		Set<String> keys = result.keySet();
		for(String key : keys) {
			System.out.println("key : "+key+", value : "+result.get(key));
		}
		
	}
	
	
	public void selectNos() {
		int[] nos = {1, 2, 4, 5, 7, 10, 20, 21, 22};
		
		List<BoardVO> list = session.selectList("board.dao.BoardDAO.selectNos", nos);
		
		for(BoardVO b : list) {
			System.out.println(b);
		}
	}
	
	
	
}
