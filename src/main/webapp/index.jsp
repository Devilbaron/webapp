<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
<html>
    <body>
        <h2>Hello World!</h2>
        <form action="Servlet" method="post">
            <%--项目名称:<input type="text" name="tName"><br>--%>
            <%--临时个数:<input type="password" name="tamCount"><br>--%>
            <%--项目总数:<input type="text" name="tCount"><br>--%>
            <%--项目日期:<input type="password" name="tDay"><br>--%>
            <button type="submit" value="Submit">提交</button>
        </form>
        <form action="Servlet" method="get">
            <button type="submit" value="Submit">提交</button>
        </form>
    </body>
</html>
