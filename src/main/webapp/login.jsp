<%@ page import="java.io.PrintWriter" %>
<%@ page import="org.omg.PortableInterceptor.SYSTEM_EXCEPTION" %><%--
  Created by IntelliJ IDEA.
  User: Dabing
  Date: 2017/10/3
  Time: 10:35
  To change this template use File | Settings | File Templates.
--%>

<%@page contentType="text/html; charset=gbk" import="com.mysql.itme.entity.User" %>

<!-- ��Ƕjava���룬��Ҫ�����߼���ת -->
<%
    String username = request.getParameter("username");
    String password = request.getParameter("password");
    session.setAttribute("username",username);
    session.setAttribute("password",password);

    if(username.equals("admin")&&password.equals("123")){
        User u = new User(username,password);

        pageContext.forward("ok.jsp");
    }else{
        pageContext.forward("index.jsp");
    }
%>