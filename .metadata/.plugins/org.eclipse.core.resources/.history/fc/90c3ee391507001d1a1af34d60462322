package kr.ac.kopo.member.dao;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.member.vo.MemberVO;

public class MemberDAO {
	
	private SqlSession session;
	
	

	
	public MemberDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	
	
	public MemberVO login(MemberVO memberVO) {	 		
	 System.out.println(memberVO.toString());	 	 
	 MemberVO userVO = session.selectOne("dao.MemberDAO.SignIn",memberVO);	 
	 System.out.println(userVO.toString());
	 	 
	 return userVO;	 
	}

	
	public void join(MemberVO memberVO) {
		System.out.println(memberVO.toString());
		session.insert("dao.MemberDAO.insertCustomer",memberVO);
		session.commit();
		
	}
	

	public void consentOpenBanking(MemberVO userVO) {
		session.update("dao.MemberDAO.consentOpenBanking",userVO);
		session.commit();
	}
	
	
	
	

}
