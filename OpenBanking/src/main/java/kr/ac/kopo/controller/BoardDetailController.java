package kr.ac.kopo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.board.service.BoardService;

public class BoardDetailController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		BoardService boardService = new BoardService();

		String first_boardNo = request.getParameter("boardNo");
		int boardNo = Integer.parseInt(first_boardNo);
		boardService 
		
		
		
		
		
		
		
		return "/jsp/board/detail.jsp";
	}

}
