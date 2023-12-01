<%-- 
    Document   : dologin
    Created on : Nov 30, 2023, 11:48:43 PM
    Author     : PC
--%>

<%@page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8" import="java.util.*, dao.*, model.*"%>

<!DOCTYPE html>
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>JSP Page</title>
</head>
<body>
    <% 
    String username = request.getParameter("txtusername");
    String password = request.getParameter("txtpassword");
    User u = new User();
    u.setUsername(username);
    u.setPassword(password);
    UserDAO uD = new UserDAO();
    boolean res = uD.checkLogin(u);
    %>
    <h1><%= u.getUsername() %></h1>
    <h1><%= u.getPassword() %></h1>
    <h1><%= res %></h1>
    <%
    
    if (res && u.getRole().equalsIgnoreCase("quan ly")) {
        session.setAttribute("manager", u);
        //response.sendRedirect("managerhome.jsp");
    } else {
        //response.sendRedirect("login.jsp");
    }
    %>
</body>
</html>
