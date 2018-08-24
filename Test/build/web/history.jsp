<%-- 
    Document   : history
    Created on : Aug 24, 2018, 4:18:45 PM
    Author     : apple
--%>
<%@taglib  prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>History</h1>
        <table border="1">

            <tr>
                <th>Trans name</th>
                <th>Money</th>
                <th>Fee</th>  
                <th>Date</th>
            </tr>
            
            <c:forEach items="${listHis}" var="h">
                <tr>
                <td>  ${h.transname} </td>
                <td>${h.transmoney}</td>
                <td>  ${h.transfee}</td> 
                <td>${h.tdate}"</td></tr>
            </c:forEach>
        
    </table>
</body>
</html>
