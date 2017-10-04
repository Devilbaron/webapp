<%--
  Created by IntelliJ IDEA.
  User: Dabing
  Date: 2017/10/3
  Time: 11:39
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html; charset=gbk" import="com.mysql.itme.entity.User" %>

<html>
<head>
    <script type="text/javascript" src="https://code.jquery.com/jquery-3.2.1.min.js">
    </script>
    <script type="text/javascript">
        $(function () {
            $('input[name=tDay]').blur(function () {
                $.get("AjaxServlet",{tDay: $('input[name=tDay]').val()},function (data) {
                    $("#formid").submit();
                    if ('true'== data){
                        $('input[name=tDay]').css('border','1px solid green')
                    }else {
                        $('input[name=tDay]').css('border','1px solid red')
                    }
                    $('#hcontent').html(data);
                });
            });
        });
    </script>
</head>
<body>
<h1>登录成功,<%=session.getAttribute("user") %></h1

<form name=insertForm action="InsetServlet" method=post>
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
