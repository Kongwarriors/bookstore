<%-- 
    Document   : login
    Created on : Nov 18, 2023, 1:20:59 PM
    Author     : PC
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form method = POST" action = "dologin.jsp">
            <h1> Login </h1>
            Username:<br>
            <input type = “text” name ="txtusername" />
            <br>
            Password:<br>
            <input type = “password” name="txtpassword" />
            <br><br>
            <input type="submit" value="Login">
        </form>
    </body>
</html>
