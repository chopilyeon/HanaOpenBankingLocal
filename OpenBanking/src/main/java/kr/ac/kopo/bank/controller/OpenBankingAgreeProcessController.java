package kr.ac.kopo.bank.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

public class OpenBankingAgreeProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		

		
		request.setCharacterEncoding("utf-8");
		
	
		String consent = request.getParameter("consent");
		

		
		
		
		
		HttpSession session = request.getSession();
		
		
		MemberVO MemberVO=(MemberVO)session.getAttribute("userVO");
		
		MemberService memberService = new MemberService();
		if(consent.equals("Y")) {
			memberService.consentOpenBanking(MemberVO);	
		}
		
		MemberVO userVO=memberService.login(MemberVO);
		
		session.setAttribute("userVO", userVO);
		
		return "/jsp/welcome/welcome.jsp";
	}

}
