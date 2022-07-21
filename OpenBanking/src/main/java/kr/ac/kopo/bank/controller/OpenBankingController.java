package kr.ac.kopo.bank.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;

public class OpenBankingController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	
		
		
		HttpSession session = request.getSession();
		
		
		MemberVO MemberVO = (MemberVO)session.getAttribute("userVO");
		BankVO userVO = new BankVO(MemberVO.getPhoneNumber());
		
		BankService bankService = new BankService();
		List<BankVO> bankList=bankService.checkAccount(userVO);
		
		request.setAttribute("bankList", bankList);
		
		
		
		
		
		
		
		return "/jsp/bank/openBanking.jsp";
	}

}
