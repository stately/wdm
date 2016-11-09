package com.statelyis.wdm.transaction.facade;

import java.util.ArrayList;
import java.util.Iterator;

import com.statelyis.wdm.transaction.converter.TransactionConverter;
import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.model.TransactionModel;
import com.statelyis.wdm.transaction.service.TransactionService;

public class DefaultTransactionFacadeImpl implements TransactionFacade{
	
	private TransactionService transactionService;
	private TransactionConverter transactionConverter;
	
	public TransactionData getTransaction(String transactionId) {
		transactionService.findById(transactionId);
		return new TransactionData();
	}	

	public TransactionData createTransaction(TransactionData transaction) {
		return transaction;
	}

	public ArrayList<TransactionData> getTransactions() {
		ArrayList<TransactionData> transactionDatas = new ArrayList<TransactionData>();
		Iterator<TransactionModel> i = transactionService.findAll().iterator();
		while (i.hasNext()){
			transactionDatas.add(transactionConverter.convert(i.next()));
		}
		return transactionDatas;
	}	
	
	public TransactionService getTransactionService() {
		return transactionService;
	}

	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}

	public TransactionConverter getTransactionConverter() {
		return transactionConverter;
	}

	public void setTransactionConverter(TransactionConverter transactionConverter) {
		this.transactionConverter = transactionConverter;
	}
}
