package kr.ac.kopo.member.service;

import kr.ac.kopo.member.dao.MemberDAO;
import kr.ac.kopo.member.vo.MemberVO;

public class MemberService {
	
	private MemberDAO memberDao;
	
	
	public MemberService() {
		memberDao = new MemberDAO();
	}
	
	
	public void join(MemberVO memberVO) {

		memberDao.join(memberVO);
		
		
	}
	
	public MemberVO login(MemberVO memberVO) {
		
		MemberVO userVO= memberDao.login(memberVO);
		
		System.out.println(userVO.toString());
		return userVO;
	}
	
	public MemberVO APILogin(String name) {
		MemberVO userVO = memberDao.APILogin(name);
		System.out.println(userVO);
		return userVO;
	}
	


	
	public void consentOpenBanking(MemberVO userVO) {
		memberDao=new MemberDAO();
		memberDao.consentOpenBanking(userVO);
		
	}
	
	
	
	
	

}
