<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>


			<c:forEach var="transaction" items="${transactions}">
				<tr class="odd">
					<td><c:out value="${transaction.id}"/></td>
				</tr>
			</c:forEach>
