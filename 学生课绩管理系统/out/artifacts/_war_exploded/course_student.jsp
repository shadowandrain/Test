<%@ page import="entity.StudentUser" %>
<%@ page import="java.util.List" %>
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
  <title>title</title>
  <style type="text/css">
    body{
      background: url(img/login.jpeg);
      width: 100%;
      height: 100%;
    }
    table{
      color: aqua;
    }
    a:hover{text-decoration:none;}
    a{
      text-decoration: none;
      color: #ff3796;
    }
  </style>
</html>
</head>
  <body>
    <center>
      <font style="font-size: 30px;font-family: 楷体;color: red">选报了该课程的学生有</font>
      <form>
        <table border="1">
          <tr>
            <td>学生姓名</td>
            <td>系别</td>
            <td>性别</td>
            <td>学分</td>
            <td>电话</td>
            <td>E-mail</td>
            <td>成绩</td>
          </tr>
          <%
            HttpSession session1 = request.getSession();
            List list = (List) session1.getAttribute("courseStudentList");
            for(int i=0;i<list.size();i++){
              StudentUser s_information = (StudentUser) list.get(i);
          %>
          <tr>
            <td><%=s_information.getName()%></td>
            <td><%=s_information.getDepartment()%></td>
            <td><%=s_information.getSex()%></td>
            <td><%=s_information.getMark()%></td>
            <td><%=s_information.getTel()%></td>
            <td><%=s_information.getE_mail()%></td>
            <td><a href="/myWeb/Student_grade.jsp?studentId=<%=s_information.getId()%>&class_id=${class_id}">score</a></td>
          </tr>
          <%
            }
          %>
        </table>
      </form>
    </center>
    <a href="/myWeb/superviseClass.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
  </body>
</html>
