package kr.ac.kopo.board.dao;

import java.util.List;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardDAO {
	private SqlSession session;
	
	public BoardDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	
	public void insertBoard(BoardVO boardVO) {
		
		
		session.insert("dao.BoardDAO.insertBoard",boardVO);
		session.commit();

		System.out.println("삽입 완료");
	}

	public List<BoardVO> selectAllBoard() {
		List<BoardVO> boardList = session.selectList("dao.BoardDAO.selectAllBoard");
		
		
		for(BoardVO board:boardList) {
			System.out.println(board);
		}
		
		return boardList;
	}	
	

}
