<%-- 
    Document   : logout
    Created on : Aug 27, 2019, 11:47:14 PM
    Author     : akggupta
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1><font color="red" size="10"> session logged out</font></h1>
        <% session.invalidate(); 
          
        %>
       
    </body>
</html>
