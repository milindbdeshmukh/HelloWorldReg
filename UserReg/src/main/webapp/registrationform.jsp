<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Hello World Register</title>
</head>
<body>
<form:form method="Post" action="registrationform.html"
	commandName="registration">
	<table >
		<tr>
			<td>First Name:<FONT color="red"><form:errors
				path="userName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="userName" /></td>
		</tr>
		<tr>
			<td>Last Name:<FONT color="red"><form:errors
				path="lastName" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="lastName" /></td>
		</tr>
		<tr>
			<td>Address 1:<FONT color="red"><form:errors
				path="address1" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="address1" /></td>
		</tr>
		<tr>
			<td>Address 2:<FONT color="red"><form:errors
				path="address2" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="address2" /></td>
		</tr>
		<tr>
			<td>City:<FONT color="red"><form:errors
				path="city" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="city" /></td>
		</tr>
		<tr>
			<td>State:<FONT color="red"><form:errors
				path="state" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="state" /></td>
		</tr>
		<tr>
			<td>Zip:<FONT color="red"><form:errors
				path="zip" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="zip" /></td>
		</tr>
		<tr>
			<td>Country:<FONT color="red"><form:errors
				path="country" /></FONT></td>
		</tr>
		<tr>
			<td><form:input path="country" /></td>
		</tr>

		
		<tr>
			<td><input type="submit" value="Submit" /></td>
		</tr>
	</table>
</form:form>
</body>
</html>