package kr.ac.kopo.test;

import static org.junit.Assert.assertNotNull;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;
import kr.ac.kopo.board.dao.BoardDAO;

public class Test {
	
	
	@org.junit.Test
	public void myConfig테스트() throws Exception{
		
		MyConfig config=new MyConfig();
		SqlSession session = config.getInstance();
		//이런 메소드로 null인지 확인함. null 인지 아닌지가 중요함. 
		assertNotNull(session);
	}
	
	@org.junit.Test
	public void BoardDAO생성테스트() throws Exception{
		BoardDAO dao = new BoardDAO();
	}
	
	

}
