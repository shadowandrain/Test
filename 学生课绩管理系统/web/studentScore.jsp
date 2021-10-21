<%@ page import="entity.StudentUser" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.StudentScore" %>
<%--
  Created by IntelliJ IDEA.
  User: zhandongyuan
  Date: 2021/6/19
  Time: 20:45
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
    <font style="font-size: 30px;font-family: 楷体;color: red">学生成绩</font>
    <form>
        <table border="1">
            <tr>
                <td>课程</td>
                <td>学分</td>
                <td>成绩</td>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("studentScoreList");
                Integer grade = 0;
                for(int i=0;i<list.size();i++){
                    StudentScore sScore_information = (StudentScore) list.get(i);
            %>
            <tr>
                <td><%=sScore_information.getCourse_name()%></td>
                <td><%=sScore_information.getMark()%></td>
                <td><%=sScore_information.getScore()%></td>
            </tr>
            <%
                    grade += Integer.valueOf(sScore_information.getMark());
                }
            %>
        </table>
    </form>
</center>
<font style="font-family: 楷体;font-size: 20px;color: red">您的总得分为：<%=grade%></font>
<br>
<br>
<a href="/myWeb/student.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>