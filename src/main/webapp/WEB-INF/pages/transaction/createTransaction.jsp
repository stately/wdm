<jsp:include page="../commonTheme/documentHead.jsp"/>
	<jsp:include page="../commonTheme/head.jsp">
		<jsp:param name="includedFilePath" value="../transaction/includes/includesCreateTransaction.jsp"/>
	</jsp:include>
	<body>

	<jsp:include page="../commonTheme/themePicker.jsp"/>

	<!-- Main Wrapper. Set this to 'fixed' for fixed layout and 'fluid' for fluid layout' -->
	<div id="da-wrapper" class="fluid">

        <!-- Header -->
        <jsp:include page="../commonTheme/header.jsp"/>

        <!-- Content -->
        <div id="da-content">

            <!-- Container -->
            <div class="da-container clearfix">

                <!-- Sidebar -->
                <div id="da-sidebar-separator"></div>


                    <!-- Main Navigation -->
                    <jsp:include page="../commonTheme/navigation.jsp"/>


                <!-- Main Content Wrapper -->
                <div id="da-content-wrap" class="clearfix">

                	<!-- Content Area -->
                	<div id="da-content-area">

						<!-- grid 3 -->
						<jsp:include page="fragments/createTransaction.jsp"/>
						
						<!-- grid 4 -->
						<jsp:include page="fragments/listTransactions.jsp"/>

						<!-- grid 2 -->
						<jsp:include page="../examples/fragments/formMessages.jsp"/>

						<!-- grid 2 -->
						<jsp:include page="../examples/fragments/formFieldsets.jsp"/>

                        <div class="clear"></div>

						<!-- grid 2 -->
						<jsp:include page="../examples/fragments/blockFormLayout.jsp"/>

						<!-- grid 2 -->
						<jsp:include page="../examples/fragments/inlineFormLayout.jsp"/>

						<!-- grid 4 -->
						<jsp:include page="../examples/fragments/columnFormLayout.jsp"/>

                    </div>

                </div>

            </div>

        </div>

        <!-- Footer -->
        <jsp:include page="../commonTheme/footer.jsp"/>

    </div>
	</body>
<jsp:include page="../commonTheme/documentFoot.jsp"/>