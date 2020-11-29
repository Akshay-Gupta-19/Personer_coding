<%-- 
    Document   : displayDetails
    Created on : Aug 27, 2019, 10:50:39 PM
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
        <h1>Hi your details 
            Name: ${sessionScope.user_name}<br>
            City: ${sessionScope.user_city}<br>
            Phone no :${sessionScope.user_phoneNo}<br>
            <% session.setMaxInactiveInterval(10); %>
            <a href="logout.jsp">Logout</a>
        </h1>
    </body>
</html>
