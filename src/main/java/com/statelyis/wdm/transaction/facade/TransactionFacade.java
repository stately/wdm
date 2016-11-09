package com.statelyis.wdm.transaction.facade;

import java.util.ArrayList;

import com.statelyis.wdm.transaction.data.TransactionData;

public interface TransactionFacade {
	
	TransactionData getTransaction(String transactionId);
	TransactionData createTransaction(TransactionData transaction);
	ArrayList<TransactionData> getTransactions();

}
