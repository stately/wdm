<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=utf-8" />

<!-- Viewport metatags -->
<meta name="HandheldFriendly" content="true" />
<meta name="MobileOptimized" content="320" />
<meta name="viewport" content="width=device-width, initial-scale=1.0, maximum-scale=1.0, user-scalable=no" />

<!-- iOS webapp metatags -->
<meta name="apple-mobile-web-app-capable" content="yes" />
<meta name="apple-mobile-web-app-status-bar-style" content="black" />

<!-- iOS webapp icons -->
<link rel="apple-touch-icon-precomposed" href="${pageContext.request.contextPath}/images/touch-icon-iphone.png" />
<link rel="apple-touch-icon-precomposed" sizes="72x72" href="${pageContext.request.contextPath}/images/touch-icon-ipad.png" />
<link rel="apple-touch-icon-precomposed" sizes="114x114" href="${pageContext.request.contextPath}/images/touch-icon-retina.png" />

<!-- CSS Reset -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/reset.css" media="screen" />
<!--  Fluid Grid System -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/fluid.css" media="screen" />
<!-- Theme Stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dandelion.theme.css" media="screen" />
<!--  Main Stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/dandelion.css" media="screen" />
<!-- Demo Stylesheet -->
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/css/demo.css" media="screen" />

<!-- jQuery JavaScript File -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery-1.7.2.min.js"></script>

<!-- jQuery-UI JavaScript Files -->
<script type="text/javascript" src="${pageContext.request.contextPath}/jui/js/jquery-ui-1.8.20.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jui/js/jquery.ui.timepicker.min.js"></script>
<script type="text/javascript" src="${pageContext.request.contextPath}/jui/js/jquery.ui.touch-punch.min.js"></script>
<link rel="stylesheet" type="text/css" href="${pageContext.request.contextPath}/jui/css/jquery.ui.all.css" media="screen" />

<!-- Plugin Files -->

<!-- FileInput Plugin -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.fileinput.js"></script>
<!-- Placeholder Plugin -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.placeholder.js"></script>
<!-- Mousewheel Plugin -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.mousewheel.min.js"></script>
<!-- Scrollbar Plugin -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/jquery.tinyscrollbar.min.js"></script>
<!-- Tooltips Plugin -->
<script type="text/javascript" src="${pageContext.request.contextPath}/plugins/tipsy/jquery.tipsy-min.js"></script>
<link rel="stylesheet" href="${pageContext.request.contextPath}/plugins/tipsy/tipsy.css" />

<!-- Demo JavaScript Files -->

<!-- Core JavaScript Files -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/core/dandelion.core.js"></script>

<!-- Page specific includes -->

<c:choose>
	<c:when test="${param.includedFilePath != null}">
		<jsp:include page="${param.includedFilePath}"/>	
	</c:when>
	<c:otherwise>
		<!-- No additional imports -->
	</c:otherwise>
</c:choose>
    

<!-- Customizer JavaScript File (remove if not needed) -->
<script type="text/javascript" src="${pageContext.request.contextPath}/js/core/dandelion.customizer.js"></script>


<title>Transaction Test</title>

</head>