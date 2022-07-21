package kr.ac.kopo.board.service;

import java.util.List;

import kr.ac.kopo.board.dao.BoardDAO;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardService {

	private BoardDAO boardDao;

	
	public List<BoardVO> selectAllBoard(){
		boardDao = new BoardDAO();
		List<BoardVO> boardList	= boardDao.selectAllBoard();
	
		
		return boardList;
	}
	
	
	
	
	
}
