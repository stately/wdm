/**
 * 
 */
package com.statelyis.wdm.transaction.service;

import java.util.ArrayList;

import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.statelyis.wdm.transaction.dao.TransactionDAO;
import com.statelyis.wdm.transaction.model.TransactionModel;

/**
 * @author jonholme1
 *
 */
@Transactional
@Service
public class DefaultTransactionServiceImpl implements TransactionService{

	private TransactionDAO transactionDAO;
	
	public TransactionModel findById(String id) {
		return transactionDAO.findById(id);
	}
	
	public TransactionModel persist(TransactionModel transaction) {
		transactionDAO.persist(transaction);
		return transaction;
	}
	
	public ArrayList<TransactionModel> findAll() {
		return (ArrayList<TransactionModel>)transactionDAO.findAll();
	}

	public TransactionDAO getTransactionDAO() {
		return transactionDAO;
	}

	public void setTransactionDAO(TransactionDAO transactionDAO) {
		this.transactionDAO = transactionDAO;
	}

}
