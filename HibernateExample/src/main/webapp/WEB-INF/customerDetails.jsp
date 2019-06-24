<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
<html>
<head>

</head>
<body>
<form:form id="regForm" modelAttribute="user" action="addCustomer" method="post">
                <table align="center">
                    <tr>
                        <td>
                            <form:label path="name">name</form:label>
                        </td>
                        <td>
                            <form:input path="name" name="name" id="username" />
                        </td>
                    </tr>
                    <tr>
                        
                    </tr>
                    <tr>
                        <td>
                            <form:label path="age">age</form:label>
                        </td>
                        <td>
                            <form:input path="age" name="age" id="age" />
                        </td>
                    </tr>
                    <tr>
                        <td>
                            <form:label path="dob">dob</form:label>
                        </td>
                        <td>
                            <form:input type="date" path="dob" name="dob" id="dob" />
                        </td>
                    </tr>
                   
                    
                       <tr>
                        <td>
                            <form:button id="adduser" name="register">adduser</form:button>
                        </td>
                    </tr>
                    <tr></tr>
                    
                </table>
            </form:form>
<form:form method="post" modelAttribute="user" action="${pageContext.request.contextPath}/addCustomer">
<table>
		<tr>
			<th colspan="2">Add Customer</th>
		</tr>
		<tr>
	<form:hidden path="id" />
          <td><form:label path="name">Customer Name:</form:label></td>
           <td><form:label path="age">Customer age:</form:label></td>
          <td><form:input path="id" size="30" maxlength="30"></form:input></td>
        </tr>
		<tr>
			    <td><form:label path="dob">dob:</form:label></td>
          <td>
		</tr>
		<tr>
			<td colspan="2"><input type="submit"
				class="blue-button" /></td>
		</tr>
	</table> 
</form:form>
</br>
<h3>Customer List</h3>
<c:if test="${!empty listOfCustomers}">
	<table class="tg">
	<tr>
		<th width="80">id</th>
		<th width="120">name</th>
		<th width="120">age</th>
		<th width="60">dob</th>
		
	</tr>
	<c:forEach items="${listOfCustomers}" var="customer">
		<tr>
			<td>${customer.id}</td>
			<td>${customer.name}</td>
			<td>${customer.age}</td>
			<td>${customer.dob}</td>
			
		</tr>
	</c:forEach>
	</table>
</c:if>
</body>
</html>