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

</body>
</html>