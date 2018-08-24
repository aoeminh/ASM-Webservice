<%-- 
    Document   : clientHistory
    Created on : Aug 24, 2018, 4:31:18 PM
    Author     : apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
      
        
            <h1>Login Client</h1>
           <form action="HistoryServlet" method="POST">
            Username: <input type="text" name="username"/><br>
            Password: <input type="password" name="password"/><br>
            <input type="submit" value="Login"/>
        </form>
    </body>
</html>
