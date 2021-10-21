<%--
  Created by IntelliJ IDEA.
  User: zhandongyuan
  Date: 2021/6/22
  Time: 20:13
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
    <font style="font-size: 40px;font-family: 楷体;color: red">学生成绩</font>
    <%
        String studentId = (String) request.getParameter("studentId");
        String class_id = (String) request.getParameter("class_id");
    %>
    <form action="/myWeb/teacher_grade">
        <table border="1">
            <tr>
                <td>学生号</td>
                <td>班级号</td>
                <td>成绩</td>
            </tr>
            <tr>
                <td><input type="text" name="studentId" value="<%=studentId%>" readonly="ture"></td>
                <td><input type="text" name="class_id" value="<%=class_id%>" readonly="ture"></td>
                <td><input type="text" name="teacherGrade"></td>
            </tr>
        </table>
        <br>
        <input type="submit" value="提交">
    </form>
    <font style="font-family: 楷体;font-size: 20px;color: red">打分失败</font>
</center>
<a href="/myWeb/course_student.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>