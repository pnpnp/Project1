<%@ taglib uri="http://java.sun.com/jsp/jstl/core" 
prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" 
prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" 
prefix="form" %>
<%@ page session="false" %>
<html>
<head>
	<title>Customer Page</title>
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
	Add a Person
</h1>
<c:url var="addAction" value="/person/add" ></c:url>
<form:form action="${addAction}" 
	modelAttribute="person">
<table border="1">
	<c:if test="${!empty customer.name}">
	<tr>
		<td>
			<form:label path="emailId">
				<spring:message text="Customer ID"/>
			</form:label>
		</td>
		<td>
			<form:input path="id" readonly="true" 
			size="8"  disabled="true" />
			<form:hidden path="id" />
		</td> 
	</tr>
	</c:if>
	<tr>
		<td>
			<form:label path="name">
				<spring:message text="customer Name"/>
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
			<c:if test="${!empty customer.name}">
				<input type="submit"
					value="<spring:message 
					text="Edit Customer"/>" />
			</c:if>
			<c:if test="${empty customer.name}">
				<input type="submit"
					value="<spring:message 
					text="Add Customer"/>" />
			</c:if>
		</td>
	</tr>
</table>	
</form:form>
<br>
<h3>Customer List</h3>
<c:if test="${!empty listCustomer}">
	<table class="tg" border="1">
	<tr>
		<th width="80">Customer ID</th>
		<th width="120">Customer Name</th>
		<th width="120">Customer Country</th>
		<th width="60">Edit</th>
		<th width="60">Delete</th>
	</tr>
	<c:forEach items="${listCustomer}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.country}</td>
			<td><a href="
			<c:url value='/edit/${customer.id}' />" >Edit</a></td>
			<td><a href="
			<c:url value='/remove/${customer.id}' />" >Delete</a>
			</td>
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>