/**
 * 
 */
package com.statelyis.wdm.transaction.converter;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.runners.MockitoJUnitRunner;

import com.statelyis.wdm.transaction.converter.TransactionDataToModelConverter;
import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.model.TransactionModel;

import org.junit.Assert; 

/**
 * @author jonholme1
 *
 */
@RunWith(MockitoJUnitRunner.class)
public class TransactionDataToModelConverterTest {
	
	private TransactionDataToModelConverter<TransactionModel> sut;
	private TransactionData td;


	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		
		sut = new TransactionDataToModelConverter<TransactionModel>(); 
		td = new TransactionData();
		
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void testPassedDataIdIsEmpty() {
		td.setId("passedId");
		Assert.assertEquals(sut.convert(td).getId(), null);
	}

}
