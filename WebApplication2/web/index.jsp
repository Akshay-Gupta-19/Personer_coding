<%-- 
    Document   : index
    Created on : Aug 27, 2019, 1:54:48 AM
    Author     : akggupta
--%>

<%@page import="com.oracle.entity.Accoutnt"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Login Success</h1>
        
        <div style="color: green" >
            Account: ${accInfo.accNo}
            Name: ${accInfo.name}
            Balance:${accInfo.bankBalance}
    </body>
</html>
