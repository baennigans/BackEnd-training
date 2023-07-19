package board.dao;

import org.apache.ibatis.session.SqlSession;

public class BoardDAO {

	private SqlSession session;
	
	public BoardDAO() {
		session = new MyConfig().getInstance();
	}
	
	
	public void work() {
		insert();
	}
	
	
	public void insert() {
		
		String title = "이번에는 꼭!!";
		
		int cnt = session.insert("board.dao.BoardDAO.insert", title);
		session.commit();
		System.out.println("총 삽입 개수 : "+cnt);
	}
}
