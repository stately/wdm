<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>

						<div class="grid_4">
                        	<div class="da-panel collapsible">
                            	<div class="da-panel-header">
                                	<span class="da-panel-title">
                                        <img src="images/icons/black/16/list.png" alt="">
                                        Data Table with Numbered Pagination
                                    </span>

                                <span class="da-panel-toggler"></span></div>
                                <div class="da-panel-content">
                                    <div id="da-ex-datatable-numberpaging_wrapper" class="dataTables_wrapper" role="grid">
                                    <div id="da-ex-datatable-numberpaging_length" class="dataTables_length"><label>Show
                                    <select size="1" name="da-ex-datatable-numberpaging_length" aria-controls="da-ex-datatable-numberpaging">
                                    	<option value="10" selected="selected">10</option><option value="25">25</option>
                                    	<option value="50">50</option><option value="100">100</option>
                                    </select> entries</label>
                                    </div>
                                    <div class="dataTables_filter" id="da-ex-datatable-numberpaging_filter">
                                    	<label>Search: <input type="text" aria-controls="da-ex-datatable-numberpaging"></label>
                                    </div>
                                    <table id="da-ex-datatable-numberpaging" class="da-table dataTable" aria-describedby="da-ex-datatable-numberpaging_info">
                                        <thead>
                                            <tr role="row">
                                            	<th class="sorting_asc" role="columnheader" tabindex="0" aria-controls="da-ex-datatable-numberpaging" rowspan="1" colspan="1" style="width: 92px; " aria-sort="ascending" aria-label="Rendering engine: activate to sort column descending">Id</th>
											</tr>
                                        </thead>

                                    <tbody role="alert" aria-live="polite" aria-relevant="all">

                                    			<jsp:include page="transactionList.jsp">
													    <jsp:param name="transactions" value="${transactions}" />
												</jsp:include>

									</tbody></table><div class="dataTables_info" id="da-ex-datatable-numberpaging_info">Showing 1 to 10 of 57 entries</div><div class="dataTables_paginate paging_full_numbers" id="da-ex-datatable-numberpaging_paginate"><a tabindex="0" class="first paginate_button paginate_button_disabled" id="da-ex-datatable-numberpaging_first">First</a><a tabindex="0" class="previous paginate_button paginate_button_disabled" id="da-ex-datatable-numberpaging_previous">Previous</a><span><a tabindex="0" class="paginate_active">1</a><a tabindex="0" class="paginate_button">2</a><a tabindex="0" class="paginate_button">3</a><a tabindex="0" class="paginate_button">4</a><a tabindex="0" class="paginate_button">5</a></span><a tabindex="0" class="next paginate_button" id="da-ex-datatable-numberpaging_next">Next</a><a tabindex="0" class="last paginate_button" id="da-ex-datatable-numberpaging_last">Last</a></div></div>
                                </div>
                            </div>
                        </div>

