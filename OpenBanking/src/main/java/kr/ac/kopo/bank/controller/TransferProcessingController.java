package kr.ac.kopo.bank.controller;

import java.util.HashMap;
import java.util.Map;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.vo.MemberVO;

public class TransferProcessingController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
	request.setCharacterEncoding("utf-8");
    BankService bankService = new BankService();
    HttpSession session = request.getSession();
    
    MemberVO memberVO=(MemberVO)session.getAttribute("userVO");
    
	String phoneNumber = memberVO.getPhoneNumber();			
	String withrawalBankName;	
	String depositBankName;
	String depositBankCode = "20";
	String withrawalBankCode = "20";
	String depositAccountNumber = request.getParameter("depositAccountNumber");	
	String withrawalAccountNumber = request.getParameter("withrawalAccountNumber");	
	String tranAmount = request.getParameter("tranAmount");	
	String depositName = request.getParameter("depositName");
	String withrawalName = request.getParameter("withrawalName");
	
	
	System.out.println(withrawalName);
	System.out.println(depositName);
	System.out.println(tranAmount);
	
	System.out.println("controller bankcode depositBankCode : " + withrawalBankCode);
	
	System.out.println("controller bankcode withrawalBankCode : " + depositBankCode);
	
	if(bankService.checkAccountBANK(withrawalAccountNumber)!=null) {
		withrawalBankCode=bankService.checkAccountBANK(withrawalAccountNumber).getBankCode();		
	};
	
	if(bankService.checkAccountBKBANK(withrawalAccountNumber)!=null) {
		withrawalBankCode=bankService.checkAccountBKBANK(withrawalAccountNumber).getBankCode();
	};
	
	if(bankService.checkAccountJBBANK(withrawalAccountNumber)!=null) {
		withrawalBankCode=bankService.checkAccountJBBANK(withrawalAccountNumber).getBankCode();
	};
	
	if(bankService.checkAccountJHBANK(withrawalAccountNumber)!=null) {
		withrawalBankCode=bankService.checkAccountJHBANK(withrawalAccountNumber).getBankCode();
	};
	
	
	if(bankService.checkAccountBANK(depositAccountNumber)!=null) {
		depositBankCode=bankService.checkAccountBANK(depositAccountNumber).getBankCode();		
	};
	
	if(bankService.checkAccountBKBANK(depositAccountNumber)!=null) {
		depositBankCode=bankService.checkAccountBKBANK(depositAccountNumber).getBankCode();		
	};
	
	if(bankService.checkAccountJBBANK(depositAccountNumber)!=null) {
		depositBankCode=bankService.checkAccountJBBANK(depositAccountNumber).getBankCode();		
	};
	
	if(bankService.checkAccountJHBANK(depositAccountNumber)!=null) {
		depositBankCode=bankService.checkAccountJHBANK(depositAccountNumber).getBankCode();		
	};
	
	
	System.out.println("controller bankcode depositBankCode : " + depositBankCode);
	 
	System.out.println("controller bankcode withrawalBankCode : " + withrawalBankCode);
	
	 BankVO withrawalBankName1 = bankService.checkBankName(withrawalBankCode);
	 BankVO depositBankName1 = bankService.checkBankName(depositBankCode);
	 
	 System.out.println(depositBankName1);
	 System.out.println(withrawalBankName1);
	 
	 withrawalBankName = withrawalBankName1.getBankName();

	 
	 depositBankName = depositBankName1.getBankName();
	

	 Map<String,String> map = new HashMap<>();
	 
	 map.put("withrawalBankName", withrawalBankName);
	 map.put("withrawalBankCode", withrawalBankCode);
	 map.put("depositBankName", depositBankName);
	 map.put("depositBankCode",depositBankCode);
	 map.put("depositAccountNumber", depositAccountNumber);
	 map.put("withrawalAccountNumber", withrawalAccountNumber);
	 map.put("withrawalName", withrawalName);
	 map.put("depositName",depositName);
	 map.put("tranAmount", tranAmount);
	 map.put("phoneNumber",phoneNumber);


	 
	 

	if(withrawalBankCode.equals("20")&&depositBankCode.equals("20")) {
		bankService.transferToOtherAccountAllSame(map);
	}else if(withrawalBankCode.equals("20")&&!depositBankCode.equals("20")){
		bankService.transferToOtherAccountAtDeposit(map);	
	}else if(!withrawalBankCode.equals("20")&&depositBankCode.equals("20")){
		bankService.transferToOtherAccountAtWithrawal(map);
	}else{
		bankService.transferToOtherAccountAllDifferent(map);
	}
	 
	 
	 
	 
	 
		
		
	return "redirect:/jsp/welcome/welcomeTransfer.jsp";
	}

}