<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
<head>
    <title>login</title>
</head>
<body>
         <!-- <p1>test!</p1> -->
         <h2 align="center">欢迎登录</h2>
         <%--<form name=loginForm action="login.jsp" method=post>--%>
         <form name=loginForm action="LoginServlet" method=post>
         <table align="center">
                 <tr>
                     <td>用户名：</td><td><input type=text name=username /></td>
                 </tr>
                 <tr>
                     <td>密码：</td><td><input type=password name=password /></td>
                 <tr/>
                 <tr>
                     <td colspan="2",align="center">
                         <input type="submit" value="submit" />
                         <input type="reset" value="reset" />
                     </td>
                 </tr>
             </table>
         </form>
</body>
</html>
