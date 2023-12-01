<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8" import="java.util.ArrayList,dao.*,model.*"%>
 
<%
    String username = (String)request.getParameter("username");
    String password = (String)request.getParameter("password");
    User tv = new User();
    tv.setUsername(username);
    tv.setPassword(password);
 
    UserDAO dao = new UserDAO();
    boolean kq = dao.checkLogin(tv);
     
    if(kq && (tv.getRole().equalsIgnoreCase("quan ly"))){
        session.setAttribute("sinhvien", tv);
        response.sendRedirect("sv\\gdchinhsv.jsp");
    }else if(kq &&(tv.getRole().equalsIgnoreCase("giangvien"))){
        session.setAttribute("giangvien", tv);
        response.sendRedirect("gv\\gdchinhgv.jsp");
    }else{
        response.sendRedirect("gddangnhap.jsp");
    }
%>