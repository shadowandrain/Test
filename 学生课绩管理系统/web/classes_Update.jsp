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
    <font style="font-size: 30px;font-family: 楷体;color: red">更改班级</font>
    <%
        String Id = request.getParameter("Id");
    %>
    <form action="/myWeb/classes_update">
        <table border="1">
            <tr>
                <td>旧班级号</td>
                <td><input type="text" name="oldId" value="<%=Id%>" readonly="ture"></td>
            </tr>
            <tr>
                <td>新班级号</td>
                <td><input type="text" name="classes_id"></td>
            </tr>
            <tr>
                <td>教师</td>
                <td>
                    <select name="tea_name">
                        <option value="李宁">李宁</option>
                        <option value="李强">李强</option>
                        <option value="踪强">踪强</option>
                        <option value="韩涛">韩涛</option>
                        <option value="王刚">王刚</option>
                        <option value="张丽媛">张丽媛</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>课程</td>
                <td>
                    <select name="cour_name">
                        <option value="c语言">c语言</option>
                        <option value="模拟电路">模拟电路</option>
                        <option value="邓小平理论">邓小平理论</option>
                        <option value="英语">英语</option>
                        <option value="计算机组成原理">计算机组成原理</option>
                        <option value="机械制造">机械制造</option>
                        <option value="计算机英语">计算机英语</option>
                        <option value="体育">体育</option>
                        <option value="美术">美术</option>
                        <option value="高数">高数</option>
                        <option value="电路分析">电路分析</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>教室ID</td>
                <td>
                    <select name="classRoom_id">
                        <option value="101">101</option>
                        <option value="102">102</option>
                        <option value="121">121</option>
                        <option value="202">202</option>
                        <option value="203">203</option>
                        <option value="302">302</option>
                        <option value="411">411</option>
                        <option value="454">454</option>
                        <option value="555">555</option>
                        <option value="686">686</option>
                        <option value="747">747</option>
                    </select>
                </td>
            </tr>
            <tr>
                <td>上课时间</td>
                <td>
                    <select name="cour_time">
                        <option value="Mon_1">星期一/一节</option>
                        <option value="Mon_2">星期一/两节</option>
                        <option value="Mon_3">星期一/三节</option>
                        <option value="Mon_4">星期一/四节</option>
                        <option value="Tues_1">星期二/一节</option>
                        <option value="Tues_2">星期二/二节</option>
                        <option value="Tues_3">星期二/三节</option>
                        <option value="Wed_1">星期三/一节</option>
                        <option value="Thurs_1">星期四/一节</option>
                        <option value="Thurs_3">星期四/三节</option>
                    </select>
                </td>
            </tr>
        </table>
        <p></p>
        <input type="submit" value="提交">
    </form>
</center>
<a href="/myWeb/getClasses.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
