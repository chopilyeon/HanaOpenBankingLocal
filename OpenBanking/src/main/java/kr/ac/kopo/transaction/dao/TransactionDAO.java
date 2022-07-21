package kr.ac.kopo.transaction.dao;

import java.util.List;
import java.util.Map;
import java.util.Set;

import org.apache.ibatis.session.SqlSession;

import kr.ac.kopo.MyConfig;

public class TransactionDAO {
	private SqlSession session;
	
	
	public TransactionDAO() {
		session  = new MyConfig().getInstance();
		System.out.println("session : "+ session);
	}
	
	public List<Map<String, Object>> checkoutTransaction(String phoneNumber) {	 		
			 
		// List<TransactionVO> transactionList = session.selectList("dao.TransactionDAO.checkTransaction",phoneNumber);	 
		 List<Map<String, Object>> transactionList = session.selectList("dao.TransactionDAO.checkTransaction",phoneNumber);	 
		 System.out.println(transactionList.toString());
		 
		 
		
		 for(Map<String, Object> data : transactionList) {
			 Set<String> keys = data.keySet();
			 for(String key : keys) {
				 System.out.println(key + " : " + data.get(key));
			 }
		 }
		 
		 
		 
		 //return null;
		 return transactionList;	 
		}
	
	
}




