<%--
  Created by IntelliJ IDEA.
  User: zhandongyuan
  Date: 2021/6/20
  Time: 19:32
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
        table{
            color: aqua;
        }
    </style>
</head>
<body>
<center>
    <font style="font-size: 30px;font-family: 楷体;color: red">新增教师</font>
    <form action="/myWeb/teacher_add">
        <table border="1">
            <tr>
                <td>教师姓名</td>
                <td><input type="text" name="teacher_name"></td>
            </tr>
            <tr>
                <td>教师号</td>
                <td><input type="text" name="teacher_id"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>职称</td>
                <td>
                    <select name="title">
                        <option value="教授">教授</option>
                        <option value="讲师">讲师</option>
                    </select>
                </td>
            </tr>
        </table>
        <p></p>
        <input type="submit" value="提交">
    </form>
</center>
<a href="/myWeb/getTeacher.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
