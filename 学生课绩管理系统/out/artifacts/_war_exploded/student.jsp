<%--
  Created by IntelliJ IDEA.
  User: zhandongyuan
  Date: 2021/6/19
  Time: 20:36
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <style type="text/css">
        body{
            background: url(img/login.jpeg);
            width: 100%;
            height: 100%;
        }
        a:hover{text-decoration:none;}
        a{
            text-decoration: none;
            color: aqua;
        }
    </style>
    <title></title>
</head>
<body>
<font style="font-family: 楷体;font-size: 30px;color: red">您已经成功通过验证/您可以更改以下内容</font>
<br>
<center>
    <a href="/myWeb/display_course?id=${userId}"><font color="aqua">选课&gt;&gt;</font></a>
    <a href="/myWeb/view_mark?id=${userId}"><font color="aqua">查看学分&gt;&gt;</font></a>
    <a href="/myWeb/StudentUpdateOneself.jsp?id=${userId}"><font color="aqua">更改信息&gt;&gt;</font></a>
</center>
<br>
<br>
<a href="login.jsp"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;注销</font></a>
</body>
</html>