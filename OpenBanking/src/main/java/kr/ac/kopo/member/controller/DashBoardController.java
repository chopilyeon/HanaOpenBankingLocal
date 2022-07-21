package kr.ac.kopo.member.controller;

import java.util.List;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;
import kr.ac.kopo.transaction.Service.TransactionService;

public class DashBoardController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		HttpSession session = request.getSession();
		TransactionService transactionService = new TransactionService();
		BankService bankService = new BankService();
		
		MemberVO MemberVO = (MemberVO)session.getAttribute("userVO");
		BankVO userVO=new BankVO(MemberVO.getPhoneNumber());

		
	
		List<Map<String, Object>> transactionList = transactionService.checkoutTransaction(MemberVO.getPhoneNumber());
		
		
	
		List<BankVO> bankList=bankService.checkAccount(userVO);
		
		request.setAttribute("bankList", bankList);
		
		request.setAttribute("transactionList", transactionList);
		
		System.out.println(transactionList);
		
		
		
		
		
		
		return "/jsp/board/dashboard.jsp";
		
	}

}
