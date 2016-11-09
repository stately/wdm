package com.statelyis.wdm.transaction.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import com.statelyis.wdm.controller.AbstractController;
import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.facade.TransactionFacade;
import com.statelyis.wdm.transaction.service.TransactionService;

/**
 * @author jon.holmes
 *
 */
@Controller(value="transactionController")
@RequestMapping("/transaction.htm")
public class TransactionController extends AbstractController{
	
	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private TransactionFacade transactionFacade;
	
	static final String DESTINATION_CREATE_TRANSACTION_PAGE = "transaction/createTransaction";
	
    @RequestMapping(method = RequestMethod.GET)
	public String readEntity(ModelMap model){

    	transactionFacade.createTransaction(new TransactionData());
    	model.addAttribute(TransactionData.NAME_TRANSACTIONS, transactionFacade.getTransactions());
    	TransactionData transaction = new TransactionData();
    	model.addAttribute(TransactionData.NAME_TRANSACTION, transaction);
    	return DESTINATION_CREATE_TRANSACTION_PAGE;

	}

    
    @RequestMapping(method = RequestMethod.POST)
    public String editEntity( ModelMap model, @ModelAttribute("transaction") TransactionData t){
    	
    	//return DESTINATION_LIST_TRANSACTION_PAGE;
    	return null;
    	
    }


	public TransactionService getTransactionService() {
		return transactionService;
	}


	public void setTransactionService(TransactionService transactionService) {
		this.transactionService = transactionService;
	}


	public TransactionFacade getTransactionFacade() {
		return transactionFacade;
	}


	public void setTransactionFacade(TransactionFacade transactionFacade) {
		this.transactionFacade = transactionFacade;
	}   
}
    
