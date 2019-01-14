<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>User Page</title>
	<link href="${pageContext.request.contextPath}/WEB-INF/styles/mystyle.css" rel="stylesheet" />
	<style>
.error {
	color: red;
	font-style: italic;
	font-weight: bold;
}
</style>
</head>
<body>
<h1>
add  User
</h1>
<c:url var="addAction" value="/user/add" ></c:url>
<form:form action="${addAction}" 
	modelAttribute="user">
<table border="1">
	<c:if test="${!empty user.emailId}">
	<tr>
		<td>
			<form:label path="emailId">
				<spring:message text="Email ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="emailId" readonly="true" 
			size="8"  disabled="true" />
			<form:hidden path="emailId" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="">
				<spring:message text="Person Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="name" />
			<form:errors path="name" cssClass="errors"></form:errors>
		</td> 
	</tr>
	<tr>
		<td>
			<form:label path="country">
				<spring:message text="Country Name"/>
			</form:label>
		</td>
		<td>
			<form:input path="country" />
			<form:errors path="country" cssClass="errors"></form:errors>
		</td>
	</tr>
	<tr>
		<td colspan="2">
<%-- 			<c:if test="${!empty user.emailId}"> --%>
<!-- 				<input type="submit" -->
<%-- 					value="<spring:message  --%>
<%-- 					text="Edit Person"/>" /> --%>
<%-- 			</c:if> --%>
			<c:if test="${empty user.emailId}">
				<input type="submit"
					value="<spring:message 
					text="Add user"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>User List</h3>
<c:if test="${!empty listUser}">
	<table class="tg" border="1">
	<tr>
		<th width="80">emailI</th>
			<th width="120">Person Country</th>
		
	</tr>
	<c:forEach items="${listUser}" var="user">
		<tr>
			<td>${user.emailId}</td>
			<td>${user.country}</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>
