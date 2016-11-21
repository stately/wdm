/**
 * 
 */
package com.statelyis.wdm.transaction.data;

import javax.xml.bind.annotation.XmlRootElement;

/**
 * @author jonholme1
 *
 */
@XmlRootElement
public class TransactionData {

	public static final String NAME_TRANSACTION = "transaction";
	public static final String NAME_TRANSACTIONS = "transactions";
	
	private String id;
	
	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

}
