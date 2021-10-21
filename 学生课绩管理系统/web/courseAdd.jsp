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
    <font style="font-size: 30px;font-family: 楷体;color: red">新增课程</font>
    <form action="/myWeb/course_add">
        <table border="1">
            <tr>
                <td>课程名</td>
                <td><input type="text" name="course_name"></td>
            </tr>
            <tr>
                <td>课程号</td>
                <td><input type="text" name="course_id"></td>
            </tr>
            <tr>
                <td>学分</td>
                <td>
                    <select name="mark">
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>系别</td>
                <td>
                    <select name="dep">
                        <option value="计算机系">计算机系</option>
                        <option value="电子系">电子系</option>
                        <option value="机械系">机械系</option>
                        <option value="public">public</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>预修课</td>
                <td>
                    <select name="prepare">
                        <option value="无预修课">无预修课</option>
                        <option value="0">0</option>
                        <option value="1">1</option>
                        <option value="2">2</option>
                        <option value="3">3</option>
                        <option value="4">4</option>
                        <option value="5">5</option>
                        <option value="6">6</option>
                        <option value="7">7</option>
                        <option value="8">8</option>
                        <option value="9">9</option>
                        <option value="10">10</option>
                    </select>
                </td>
            </tr>
        </table>
        <p></p>
        <input type="submit" value="提交">
    </form>
</center>
<a href="/myWeb/getCourse.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
