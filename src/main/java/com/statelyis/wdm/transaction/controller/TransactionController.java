package com.statelyis.wdm.transaction.controller;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;

import com.statelyis.wdm.controller.AbstractController;
import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.facade.TransactionFacade;
import com.statelyis.wdm.transaction.service.TransactionService;

import io.swagger.annotations.Api;

/**
 * @author jon.holmes
 *
 */
@Controller
@Api(description = "transaction API")
public class TransactionController extends AbstractController{

	@Autowired
	private TransactionService transactionService;
	
	@Autowired
	private TransactionFacade transactionFacade;
	
	static final String DESTINATION_CREATE_TRANSACTION_PAGE = "transaction/createTransaction";
    
    @RequestMapping(value="/transactions", produces={"application/xml", "application/json"})
    @ResponseStatus(HttpStatus.OK)
    public @ResponseBody ArrayList<TransactionData> getTransactions() {
    	ArrayList<TransactionData> al = transactionFacade.getTransactions();
        return al;
    }        
    
    @RequestMapping(value="/transactions", method = RequestMethod.GET)
	String getTransactionsWithView(ModelMap model){

    	model.addAttribute(TransactionData.NAME_TRANSACTIONS, this.getTransactions());
    	TransactionData transaction = new TransactionData();
    	transactionFacade.createTransaction(transaction);
    	model.addAttribute(TransactionData.NAME_TRANSACTION, transaction);
    	return DESTINATION_CREATE_TRANSACTION_PAGE;
	}    

    
    @RequestMapping(value="/transaction", method = RequestMethod.POST)
    public String addTransaction( ModelMap model, @ModelAttribute("transaction") TransactionData t){
    	
    		//
    		transactionFacade.createTransaction(t);
    		return DESTINATION_CREATE_TRANSACTION_PAGE;
    	
    }
}
    
