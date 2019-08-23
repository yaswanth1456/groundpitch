<%@ taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c" %>
<%@ taglib uri="http://www.springframework.org/tags" prefix="spring" %>
<%@ taglib uri="http://www.springframework.org/tags/form" prefix="form" %>


<!DOCTYPE html>
<html>
<body>

<h1>My First Heading</h1>

<p>My first paragraph.</p>
<a href="/getAllCustomers">to get all customers details</a>
<form:form method="post"  action="/getuserbyid">
<input type="text" name="id" />
<input type="submit" />
</form:form>
</body>
</html>
