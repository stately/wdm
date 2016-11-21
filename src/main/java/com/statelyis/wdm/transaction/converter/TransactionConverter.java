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

@Service("transactionConverter")
public class TransactionConverter<T> implements Converter<TransactionModel, TransactionData> {

	public TransactionData convert(TransactionModel model) {
		TransactionData data = new TransactionData();
		data.setId(model.getId());
		return data;
	}
}
