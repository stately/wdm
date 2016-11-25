/**
 * 
 */
package com.statelyis.wdm.transaction.converter;

import org.springframework.core.convert.converter.Converter;
import org.springframework.stereotype.Service;

import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.model.TransactionModel;

/**
 * @author jonholme1
 * @param <TransactionData>
 *
 */

@Service("transactionDataToModelConverter")
public class TransactionDataToModelConverter<T> implements Converter<TransactionData, TransactionModel> {

	public TransactionModel convert(TransactionData data) {
		TransactionModel model = new TransactionModel();
		return model;
	}
}
