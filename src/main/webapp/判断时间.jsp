<%--
  Created by IntelliJ IDEA.
  User: Dabing
  Date: 2017/10/2
  Time: 21:18
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<!DOCTYPE html>
<html>
<head>
    <title></title>
    <meta http-equiv="Content-Type" content="text/html; charset=utf-8" />
</head>
<body>
<script type="text/javascript">
    function myFunction()
    {
        var str=document.getElementById("text").value.split(" ");
        var k=/^(\d{4})\-([\d]+)\-([\d]+)$/;
        var D_Time = str[1].split(":");
        var YM = str[0].split("-");
        var reg = str[0].match(/^(\d{4})\-([\d]+)\-([\d]+)$/);
        var Month = Data(YM[0],YM[1]);
        if(!k.test(str[0]) || reg[2]>12 || reg[3]>Month){
            alert("日期都不对");
        }else{
            if (D_Time[0] > 24 || D_Time[1] > 60 || D_Time[2] > 60) {
                alert("日期正确，时间不正确");
            }else{
                alert("时间验证通过");
            }
        }
    }
    function Data(year,month){
        switch(parseInt(month)){
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                return 31;
                break;
            case 4:
            case 6:
            case 9:
            case 11:
                return 30;
                break;
            case 2:
                if((year%4==0 && year%100!=0) || year%400==0){
                    return 29;
                }else{
                    return 28;
                }
                break;
            default :
                break;
        }
    }
</script>
<input type="text" value="" id="text">

<button type="button" onclick="myFunction()">校验</button>


</body>
</html>


</body>
</html>
