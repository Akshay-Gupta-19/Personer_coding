<%-- 
    Document   : sessionWrtie
    Created on : Aug 27, 2019, 10:48:03 PM
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
<%
            session.setAttribute("user_name", request.getParameter("username"));
            session.setAttribute("user_city", request.getParameter("city"));
            session.setAttribute("user_phoneNo", request.getParameter("phoneNo"));
        %>
        Session id :<%= session.getId()%>
                <h1 font-size: 10>hi ${param.username}<a href="displayDetails.jsp">Click here</a> to view your detail</h1>
    </body>
</html>
