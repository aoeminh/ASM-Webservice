<%-- 
    Document   : transaction
    Created on : Aug 21, 2018, 10:07:05 PM
    Author     : apple
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Transaction</title>
    </head>
    <body>
        <h1>Transaction</h1>
        <form action="TransactionSvl" method="POST">
            ClientID<br>
            <input type="text" name ="clientid"/><br>
            PinCode<br>
            <input type="password" name ="cpassword"/><br>
            Transaction name<br>
            <input type="text" name ="transname"/><br>
            Money<br>
            <input type="text" name ="money"/><br>
            <input type="checkbox" name="check"/>
            Client fee
            <br>
            <input type="submit" value="Submit"/>

        </form>
    </body>
</html>
