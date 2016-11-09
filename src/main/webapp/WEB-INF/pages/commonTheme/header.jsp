        <div id="da-header">

        	<div id="da-header-top">

                <!-- Container -->
                <div class="da-container clearfix">

                    <!-- Logo Container. All images put here will be vertically centere -->
                    <div id="da-logo-wrap">
                        <div id="da-logo">
                            <div id="da-logo-img">
                                <a href="dashboard.html">
                                    <img src="images/logo.png" alt="Dandelion Admin" />
                                </a>
                            </div>
                        </div>
                    </div>

                    <!-- Header Toolbar Menu -->
                    <jsp:include page="toolbar.jsp"/>


                </div>
            </div>

            <div id="da-header-bottom">
                <!-- Container -->
                <div class="da-container clearfix">

                	<!-- search -->
                	<jsp:include page="search.jsp"/>

                    <!-- Breadcrumbs -->
                    <jsp:include page="breadcrumb.jsp"/>

                </div>
            </div>
        </div>