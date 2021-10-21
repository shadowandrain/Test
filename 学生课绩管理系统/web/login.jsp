<%--
  Created by IntelliJ IDEA.
  User: zhandongyuan
  Date: 2021/6/19
  Time: 17:28
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
    <style type="text/css">
        body{
            background: url(img/login.jpeg);
            width: 100%;
            height: 100%;
        }
    </style>
</head>
<body>
    <center>
        <font style="   font-size: 40px;color: red;font-family: 楷体" >学生课绩管理系统</font>
        <form action="/myWeb/login" method="post">
            <table border="1" style="width: 500px;height: 180px">
                <tr >
                    <td colspan="2" align="center"><font style="font-family: 楷体;font-size: 20px;color: aqua">请你输入</font></td>
                </tr>
                <tr>
                    <td align="center"><font color="aqua">用户：</font></td>
                    <td>
                        <input type="radio" name="user" value="student"><font style="font-family: 楷体;color: aqua">学生</font>
                        <input type="radio" name="user" value="teacher"><font style="font-family: 楷体;color: aqua">教师</font>
                        <input type="radio" name="user" value="admin"><font style="font-family: 楷体;color: aqua">管理员</font>
                    </td>
                </tr>
                <tr>
                    <td align="center"><font color="aqua">登录名：</font></td>
                    <td><input type="text" name="Id" /></td>
                </tr>
                <tr>
                    <td align="center"><font color="aqua">密码：</font></td>
                    <td><input type="password" name="password" /></td>
                </tr>
                <tr>
                    <td colspan="2" align="center">
                        <input type="submit" value="确认登录">&nbsp;&nbsp;&nbsp;
                        <input type="reset" value="取消登录">
                    </td>
                </tr>
            </table>
        </form>
    </center>
</body>
</html>
