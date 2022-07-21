package kr.ac.kopo.bank.controller;

import java.util.Random;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.bank.service.BankService;
import kr.ac.kopo.bank.vo.BankVO;
import kr.ac.kopo.controller.Controller;

public class MakeAccountProcessingController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		Random random = new Random();
		int accountNumber1;
		int accountNumber2;
		int accountNumber3;
		
		
		while(true) {
			accountNumber1=(int)random.nextInt(100000);
			if(accountNumber1>10000) {
				break;
			}
		}
		while(true) {	
			accountNumber2=(int)random.nextInt(100);
			if(accountNumber2>10) {
				break;
			}
		}
		while(true) {	
			accountNumber3=(int)random.nextInt(100000);
			if(accountNumber3>10000) {
				break;
			}
		}
		
		
		
		
		
		StringBuilder stb = new StringBuilder();
		stb.append(accountNumber1);
		stb.append("-");
		stb.append(accountNumber2);
		stb.append("-");
		stb.append(accountNumber3);
		
		
	
		
		request.setCharacterEncoding("utf-8");
		
	
		String phoneNumber = request.getParameter("phoneNumber");
		String accountPassword = request.getParameter("password");
		String bankAlias = request.getParameter("alias");
		String stringBalance = request.getParameter("balance");
		int balance = Integer.parseInt(stringBalance);
		String accountNumber = stb.toString();
		String transfer_limit1 = request.getParameter("transfer_limit");
		int transferLimit = Integer.parseInt(transfer_limit1);
		
		
		String bankCode = "20";
		
		BankVO bankvo = new BankVO(accountNumber,phoneNumber,accountPassword,bankCode,balance,bankAlias,transferLimit);
	
		System.out.println(bankvo);
		
		
		
		
		
		
		
		
		BankService bankService = new BankService();
		
		
		
		bankService.insertAccount(bankvo);
		
		
		
		
		
		return "redirect:/welcome.do";
	}

}
