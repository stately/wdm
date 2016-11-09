/**
 * 
 */
package com.statelyis.wdm.transaction.model;

import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.Valid;
import javax.validation.constraints.NotNull;

import org.hibernate.annotations.GenericGenerator;

import com.statelyis.core.AbstractEntity;

/**
 * @author jon.holmes
 *
 */
@javax.persistence.Entity
@Table(name = "wdm_transaction")
public class TransactionModel extends AbstractEntity<String>{
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	/**
	 * Default Constructor for Transaction
	 */
	public TransactionModel() {
		super();
	}
	@Id @GeneratedValue(generator="system-uuid")
	@GenericGenerator(name="system-uuid", strategy = "uuid")
	private String id;
	
	@NotNull
	@Valid
	private String description;
	
	/**
	 * @return the id
	 */
	public String getId() {
		return id;
	}
	/**
	 * @param id the id to set
	 */
	public void setId(String id) {
		this.id = id;
	}
	/**
	 * @return the description
	 */
	public String getDescription() {
		return description;
	}
	/**
	 * @param description the description to set
	 */
	public void setDescription(String description) {
		this.description = description;
	}	
	
}
