package kr.ac.kopo.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;
import kr.ac.kopo.board.vo.BoardVO;

public class BoardListController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {

		
		
		
		BoardService boardService = new BoardService();
		
		List<BoardVO> boardList = boardService.selectAllBoard();
		
		request.setAttribute("boardList", boardList);
		
		
		return "jsp/board/boarList.jsp";
	}

}
