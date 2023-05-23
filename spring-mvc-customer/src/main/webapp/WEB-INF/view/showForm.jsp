<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib uri="http://www.springframework.org/tags/form" prefix="form" %>
    <%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>student-form</title>
</head>
<body>
<form:form action="processForm" modelAttribute="customer">
First Name: <form:input path="firstname"/><br/>
Last Name: <form:input path="lastname"/><br/>
Email: <form:input path="email"/><br/>
Country:<form:select path="Country">
<form:option value="Brazil" label="Brazil"/>
<form:option value="India" label="India"/>
<form:option value="USA" label="USA"/>
</form:select><br/>
<input type="submit" value="submit student">
</form:form>
</body>
</html>