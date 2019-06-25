<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

</head>
<body>
<c:if test="${!empty user}">
	<table class="tg">
	<tr>
		<th width="80">id</th>
		<th width="120">name</th>
		<th width="120">age</th>
		<th width="60">dob</th>
		
	</tr>
	
		<tr>
			<td>${user.id}</td>
			<td>${user.name}</td>
			<td>${user.age}</td>
			<td>${user.dob}</td>
			
		</tr>
	
	</table>
	</c:if>
	</body>