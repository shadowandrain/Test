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
    <font style="font-size: 30px;font-family: 楷体;color: red">更改学生</font>
    <%
        String Id = request.getParameter("Id");
    %>
    <form action="/myWeb/sUpdate">
        <table border="1">
            <tr>
                <td>旧学生号</td>
                <td><input type="text" name="oldId" value="<%=Id%>" readonly="ture"></td>
            </tr>
            <tr>
                <td>新学生号</td>
                <td><input type="text" name="student_id"></td>
            </tr>
            <tr>
                <td>学生姓名</td>
                <td><input type="text" name="student_name"></td>
            </tr>
            <tr>
                <td>密码</td>
                <td><input type="password" name="password"></td>
            </tr>
            <tr>
                <td>学生所在系</td>
                <td>
                    <select name="department">
                        <option value="计算机系">计算机系</option>
                        <option value="电子系">电子系</option>
                        <option value="机械系">机械系</option>
                        <option value="public">public</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>性别</td>
                <td>
                    <select name="sex">
                        <option value="男">男</option>
                        <option value="女">女</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>籍贯</td>
                <td>
                    <select name="address">
                        <option value="江西">江西</option>
                        <option value="广西">广西</option>
                        <option value="山西">山西</option>
                        <option value="陕西">陕西</option>
                    </select>
                </td>
            </tr>

        </table>
        <p></p>
        <input type="submit" value="提交">
    </form>
</center>
<a href="/myWeb/getStudent.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
