<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<body>
	<c:if test="${not empty lists}">

 <div align="center">
        <table border="1" bordercolor="#5dade2" cellspacing="1" cellpadding="0" RULES=ROWS  FRAME=BOX>
        <col style="width:10%"> 
        <col style="width:10%"> 
         <col style="width:15%">
          <col style="width:15%">
           <col style="width:5%">
           <col style="width:5%">
           <col style="width:5%">
            <col style="width:5%">
            <caption><h1>Report</h1></caption>
            <thead>
            <tr bgcolor="#aeb6bf">>
                <th align="left">First Name</th>
                <th align="left">Last Name</th>
                <th align="left">Address1</th>
                <th align="left">Address2</th>
                <th align="left">City</th>
                <th align="left">State</th>
                <th align="left">Zip</th>
                <th align="left">Country</th>
            </tr>
            </thead>
            <c:forEach var="listValue" items="${lists}">
                <tr>
                    <td><c:out value="${listValue.userName}" /></td>
                    <td><c:out value="${listValue.lastName}" /></td>
                    <td><c:out value="${listValue.address1}" /></td>
                    <td><c:out value="${listValue.address2}" /></td>
                    <td><c:out value="${listValue.city}" /></td>
                    <td><c:out value="${listValue.state}" /></td>
                    <td><c:out value="${listValue.zip}" /></td>
                    <td><c:out value="${listValue.country}" /></td>
                </tr>
            </c:forEach>
        </table>
    </div>

	</c:if>
</body>
</html>