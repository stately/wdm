/**
 * 
 */
package com.statelyis.wdm.transaction.controller;

import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.get;
import static org.springframework.test.web.servlet.request.MockMvcRequestBuilders.post;
import static org.springframework.test.web.servlet.result.MockMvcResultHandlers.print;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.forwardedUrl;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.model;
import static org.springframework.test.web.servlet.result.MockMvcResultMatchers.status;

import java.util.ArrayList;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.springframework.http.MediaType;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.web.servlet.MockMvc;
import org.springframework.test.web.servlet.MvcResult;
import org.springframework.test.web.servlet.setup.MockMvcBuilders;

import com.statelyis.wdm.transaction.data.TransactionData;
import com.statelyis.wdm.transaction.facade.TransactionFacade;

import org.hamcrest.Matchers.*;




/**
 * @author jonholme1
 *
 */

// THIS IS THE FULL WAC EQUIVALENT
//@RunWith(SpringJUnit4ClassRunner.class)
//@WebAppConfiguration
//@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
//public class TransactionControllerTest {

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(locations = { "classpath:applicationContext.xml" })
public class TransactionControllerTest {

	// if I run the test with @WebAppConfiguration and MockMvcBuilders.webAppContextSetup
	// then I effectively run an integration test and use the DB
	// however if there is no wac and I use MockMvcBuilders.standaloneSetup then
	// I have a more conventional unit test of the controller
	// IMPORTANT make sure to remeber calling initMocks i setup !?!?!?!?
	
	//@Autowired
    //private WebApplicationContext wac;
	
	@InjectMocks
	private TransactionController controllerUnderTest;
	
	private MockMvc mockMvc;
	
	@Mock
	public TransactionFacade transactionFacade;

	
	//private TransactionController controllerUnderTest = new TransactionController();

	/**
	 * @throws java.lang.Exception
	 */
	@Before
	public void setUp() throws Exception {
		MockitoAnnotations.initMocks(this);
		//this.mockMvc = MockMvcBuilders.webAppContextSetup(this.wac).build();
        this.mockMvc = MockMvcBuilders.standaloneSetup(controllerUnderTest).build();
	}

	/**
	 * @throws java.lang.Exception
	 */
	@After
	public void tearDown() throws Exception {
	}

	/**
	 * Test method for {@link com.statelyis.wdm.transaction.controller.TransactionController#getTransactions()}.
	 */
	@Test
	public void testGetTransactions() throws Exception {
		
		ArrayList<TransactionData> td = new ArrayList<TransactionData>();
		//when(transactionFacade.getTransactions()).thenReturn(td);
		
		this.mockMvc.perform(get("/transactions").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
		this.mockMvc.perform(get("/transactions.json").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().isOk());
		this.mockMvc.perform(get("/transactions.xml").accept(MediaType.parseMediaType("application/xml;charset=UTF-8")))
		.andExpect(status().isOk());
		this.mockMvc.perform(get("/transactions.htm").accept(MediaType.parseMediaType("application/html;charset=UTF-8")))
		.andExpect(status().isOk());		
		this.mockMvc.perform(get("/transactions.json").accept(MediaType.parseMediaType("application/xml;charset=UTF-8")))
		.andExpect(status().is4xxClientError());
		this.mockMvc.perform(get("/transactions.xml").accept(MediaType.parseMediaType("application/json;charset=UTF-8")))
		.andExpect(status().is4xxClientError());
		this.mockMvc.perform(get("/transactions.htm").accept(MediaType.parseMediaType("application/xml;charset=UTF-8")))
		.andExpect(status().is4xxClientError());		
		
		//.andExpect(jsonPath("$.composers[0]").exists());
	}
	
	@Test
	public void testCreateTransaction() throws Exception {
		
		MvcResult result = this.mockMvc.perform(post("/transactions").param("id", "value").param("id1","value1")).andReturn();
		
		System.out.println(result);
		System.out.println(result.getResponse());
		System.out.println(result.getResponse().getContentAsString());
		
		Assert.assertEquals(result.getResponse().getForwardedUrl(), TransactionController.DESTINATION_CREATE_TRANSACTION_PAGE);
		//Assert.
		
		this.mockMvc.perform(post("/transactions")
		.param("id", "value")
		.param("id1","value1"))
		.andDo(print())
		.andExpect(forwardedUrl(TransactionController.DESTINATION_CREATE_TRANSACTION_PAGE));
		
		//https://www.petrikainulainen.net/programming/spring-framework/unit-testing-of-spring-mvc-controllers-normal-controllers/
	}

}
