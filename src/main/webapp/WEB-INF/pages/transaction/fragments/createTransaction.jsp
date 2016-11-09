<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>



                    	<div class="grid_3">
                        	<div class="da-panel">
                            	<div class="da-panel-header">
                                	<span class="da-panel-title">
                                        <img src="images/icons/black/16/pencil.png" alt="" />
                                        Create Transaction
                                    </span>
                                </div>
                                
                                <div class="da-panel-content">
                                 
									<form:form method="POST" commandName="transaction" class="da-form">
                                            <div class="da-form-row">
                                                <label>id</label>
                                                <div class="da-form-item small">
                                                	<span class="formNote">id</span>
                                                    <form:input path="id"  name="id" />
                                                </div>
                                            </div>
                                                                                    		<div class="da-button-row">
		                                        	<input type="submit" name="create" value="Add Transaction" class="da-button green" />
                                        		</div>	                                            

										<%--
                                    	<div class="da-form-inline">
                                            <div class="da-form-row">
                                                <label>Time in</label>
                                                <div class="da-form-item small">
                                                	<span class="formNote">format <strong>dd/mm/yyyy hh:mm AM/PM</strong></span>
                                                    <form:input path="timeIn"  name="timeIn" />
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Time out</label>
                                                <div class="da-form-item small">
                                                	<span class="formNote">format <strong>dd/mm/yyyy hh:mm AM/PM</strong></span>
                                                    <form:input path="timeOut"  name="timeOut" />
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Weight in</label>
                                                <div class="da-form-item small">
                                                	<span class="formNote">units <strong>kg</strong></span>
                                                    <form:input path="weightIn"  name="weightIn" />
                                                </div>
                                            </div>
                                            <div class="da-form-row">
                                                <label>Weight out</label>
                                                <div class="da-form-item small">
                                                	<span class="formNote">units <strong>kg</strong></span>
                                                    <form:input path="weightOut"  name="weightOut" />
                                                </div>
                                            </div>                                            
	                                    	<div class="da-form-row">
	                                    		<label>Vehicle</label>
												<div class="da-form-item small">
													<form:select path="vehicle" class="chzn-select" items="${vehicles}" itemLabel="registration" itemValue="id"/>
												</div>
	                                        </div>                                            
	                                        
	                                        <div id="da-ex-prettyCheckboxes">
		                                    	<div class="da-form-row">
		                                    		<label>Waste states</label>
													<div class="da-form-item">	                                        
		                                        		<ul class="da-form-list">
		                                        		<c:forEach var="wasteState" items="${wasteStates}" varStatus="loop">
															<li><form:radiobutton path="wasteState" value="${wasteState.id}"/><label for="wasteState${loop.index + 1}">${wasteState.name}</label></li>
														</c:forEach>
		                                        		</ul>		
		                                        	</div>
		                                        </div>
	                                        </div>
	                                        
                                    	<div class="da-form-row">
                                        	<label>WDA</label>
                                            <div class="da-form-item small">
                                            	<span class="formNote">This is a form note</span>
												<form:select path="wDA" items="${wdas}" itemLabel="name" itemValue="id" class="chzn-select"/>
											</div>
										</div>
										
                                    	<div class="da-form-row">
                                        	<label>Site</label>
                                            <div class="da-form-item small">
                                            	<span class="formNote">This is a form note</span>
												<form:select path="site" items="${sites}" itemLabel="name" itemValue="id" class="chzn-select"/>
											</div>
										</div>										
                                    	<div class="da-form-row">
                                        	<label>Weighbridge Ticket Id</label>
                                            <div class="da-form-item small">
                                            	<form:input path="weighbridgeTicketId" name="weighbridgeTicketId"/>
                                            </div>
                                        </div>			
										

	                                       <div id="da-ex-prettyCheckboxes">
		                                    	<div class="da-form-row">
		                                    		<label>Destinations</label>
													<div class="da-form-item">	                                        
		                                        		<ul class="da-form-list">
		                                        		<c:forEach var="destination" items="${destinations}" varStatus="loop">
															<li><form:checkbox path="destinations" value="${destination.id}"/><label for="destinations${loop.index + 1}">${destination.name}</label></li>
														</c:forEach>
		                                        		</ul>		
		                                        	</div>
		                                        </div>
		                                    </div>		
                                            
	                                        <div id="da-ex-prettyCheckboxes">
		                                    	<div class="da-form-row">
		                                    		<label>Transaction Direction</label>
													<div class="da-form-item">	                                        
		                                        		<ul class="da-form-list">
		                                        		<c:forEach var="transactionDirection" items="${transactionDirections}" varStatus="loop">
															<li><form:radiobutton path="transactionDirection" value="${transactionDirection}"/><label for="transactionDirection${loop.index + 1}">${transactionDirection}</label></li>
														</c:forEach>
		                                        		</ul>		
		                                        	</div>
		                                        </div>
	                                        </div>                                                             


                                    	<div class="da-form-row">
                                        	<label>Waste Types</label>
                                            <div class="da-form-item small">
												<form:select path="wasteType" items="${wasteTypes}" itemLabel="description" itemValue="id" class="chzn-select"/>
											</div>
										</div>		
                                    	<div class="da-form-row">
                                        	<label>Waste Collection Source</label>
                                            <div class="da-form-item small">
												<form:select path="wasteCollectionSource" items="${wasteCollectionSources}" itemLabel="name" itemValue="id" class="chzn-select"/>
											</div>
										</div>														                                    
	                                        
                                            <div class="da-form-row">
                                                <label>Textarea</label>
                                                <div class="da-form-item">
                                                	<span class="formNote">This is an another form note</span>
                                                    <textarea rows="auto" cols="auto"></textarea>
                                                </div>
                                            </div>
                                            
                                        		<div class="da-button-row">
		                                        	<input type="submit" name="create" value="Add Transaction" class="da-button green" />
                                        		</div>	                                            
                                            
                                        </div>
                                        --%>
									</form:form>     
									 
                                </div>
                            </div>
                        </div>


                    	<div class="grid_1">
                        	<div class="da-panel">
                            	<div class="da-panel-header">
                                	<span class="da-panel-title">
                                        <img src="images/icons/black/16/documents_small.png" alt="" />
                                        Upload Transactions
                                    </span>
                                </div>
                                
                                <div class="da-panel-content">
                                <%--
									<form:form method="POST" commandName="uploadItem" enctype="multipart/form-data" class="da-form">
	                                    	<div class="da-form-block">
                                    			<div class="da-form-row">
                                        			<label>Styled File Input</label>
		                                            <div class="da-form-item large">
		                                            	<form:input path="fileData" type="file" class="da-custom-file"/>
		                                            </div>
                                        		</div>		
                                        		<div class="da-button-row">
		                                        	<input type="reset" value="Reset" class="da-button gray left" />
		                                        	<input type="submit" name="upload" value="Upload Transactions" class="da-button green" />
                                        		</div>	
											</div>
									</form:form>
									 --%>     
                                </div>
                            </div>
                            
                        	<div class="da-panel">
                            	<div class="da-panel-header">
                                	<span class="da-panel-title">
                                        <img src="images/icons/black/16/info_about.png" alt="Upload Transactions" />
                                        How to upload Transactions
                                    </span>
                                    
                                </div>
                                <div class="da-panel-content with-padding">
		                        	<p>This is where you upload a list of transactions on a spreadsheet.</p>
                                </div>
                            </div>                            
                            
                        </div>


		<script>
			$('#timeIn').datetimepicker({
				ampm: true
			});

			$('#timeOut').datetimepicker({
				ampm: true
			});
		</script>

		