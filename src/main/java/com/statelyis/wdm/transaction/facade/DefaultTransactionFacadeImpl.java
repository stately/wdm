package com.statelyis.wdm.transaction.facade;

import java.util.ArrayList;
import java.util.Iterator;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.statelyis.wdm.transaction.converter.TransactionDataToModelConverter;
import com.statelyis.wdm.transaction.converter.TransactionModelToDataConverter;
import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.model.TransactionModel;
import com.statelyis.wdm.transaction.service.TransactionService;

@Service("transactionFacade")
public class DefaultTransactionFacadeImpl implements TransactionFacade{

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private TransactionModelToDataConverter<TransactionData> transactionModelToDataConverter;
	
	@Autowired
	private TransactionDataToModelConverter<TransactionModel> transactionDataToModelConverter;
	
	public TransactionData getTransaction(String transactionId) {
		transactionService.findById(transactionId);
		return new TransactionData();
	}	

	public TransactionData createTransaction(TransactionData data) {
		transactionService.persist(transactionDataToModelConverter.convert(data));
		return data;
	}

	public ArrayList<TransactionData> getTransactions() {
		
		ArrayList<TransactionData> transactionDatas = new ArrayList<TransactionData>();
		Iterator<TransactionModel> i = transactionService.findAll().iterator();
		while (i.hasNext()){
			transactionDatas.add(transactionModelToDataConverter.convert(i.next()));
		}
		return transactionDatas;
	}	
}
