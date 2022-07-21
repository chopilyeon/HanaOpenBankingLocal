package kr.ac.kopo.transaction.Service;

import java.util.List;

import kr.ac.kopo.transaction.dao.TransactionDAO;
import kr.ac.kopo.transaction.vo.TransactionVO;

public class TransactionService {
	private TransactionDAO transactionDao;
	
	public TransactionService() {
		transactionDao = new TransactionDAO();
	}
	
	
	public List<TransactionVO> checkoutTransaction(String phoneNumber){
		
		List<TransactionVO> transactionList = transactionDao.checkoutTransaction(phoneNumber);
		return transactionList;
	}
	
	
	
}