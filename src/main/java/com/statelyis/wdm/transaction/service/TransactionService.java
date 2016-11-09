package com.statelyis.wdm.transaction.service;

import java.util.ArrayList;

import com.statelyis.wdm.transaction.model.TransactionModel;

public interface TransactionService{
	
	TransactionModel findById(String id);
	TransactionModel persist(TransactionModel transaction);
	ArrayList<TransactionModel> findAll();

}
