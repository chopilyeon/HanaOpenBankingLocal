package kr.ac.kopo.member.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import kr.ac.kopo.controller.Controller;
import kr.ac.kopo.member.service.MemberService;
import kr.ac.kopo.member.vo.MemberVO;

public class JoinProcessController implements Controller {

	@Override
	public String handleRequest(HttpServletRequest request, HttpServletResponse response) throws Exception {
		
		
		
		request.setCharacterEncoding("utf-8");
		
		String name = request.getParameter("name");
		String id = request.getParameter("id");
		String identity1 = request.getParameter("iden_number1");
		String identity2 = request.getParameter("iden_number2");
		String password = request.getParameter("password");
		String zipCode = request.getParameter("zipCode");
		String address = request.getParameter("address");
		String detailAddress = request.getParameter("detailAddress");
		String tel1 = request.getParameter("tel1");
		String tel2 = request.getParameter("tel2");
		String tel3 = request.getParameter("tel3");
		
		String gender;
		String identity = identity1 + identity2;	
		String phonenumber = tel1+tel2+tel3;
		
		if(identity2.startsWith("1")||identity2.startsWith("3")) {
			gender="M";
		}else {
			gender="F";
		}
		
		
		
		MemberVO userVO = new MemberVO(name,id,identity,password,gender,phonenumber,address,detailAddress,zipCode);
		System.out.println(userVO.toString());
		
		MemberService service = new MemberService();
		

		
		service.join(userVO);
		
		
		
	
		
		return "redirect:/jsp/welcome/welcomeJoin.jsp";
	}

}
