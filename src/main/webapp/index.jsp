<%@page pageEncoding="UTF-8" contentType="text/html; charset=UTF-8" %>
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
        <h2>Hello World!</h2>
        <form action="" method="post" id="formid">
            <%--项目名称:<input type="text" name="tName"><br>--%>
            <%--临时个数:<input type="password" name="tamCount"><br>--%>
            <%--项目总数:<input type="text" name="tCount"><br>--%>
            日期:<input type="text" name="tDay"><br>
            <button type="button" value="Submit" id="btn">异步请求</button>
                <br>
            <h3 id="hcontent">123</h3>
        </form>
    </body>


</html>
