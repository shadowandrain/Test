<%@ page import="java.util.List" %>
<%@ page import="entity.CourseUser" %>
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
        <title></title>
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
    </head>
<body>
<center>
    <font style="font-size: 30px;font-family: 楷体;color: red">所有课程</font>
</center>
<a href="/myWeb/courseAdd.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">新增课程</font></a>
<center>
    <form>
        <table border="1">
            <tr>
                <td>课程号</td>
                <td>课程名</td>
                <td>学分</td>
                <td>预修课</td>
                <td>所在系</td>
                <td colspan="2" align="center">功能</td>
                <%--<td>删除</td>
                <td>更新</td>--%>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("key");
                for(int i=0;i<list.size();i++){
                    CourseUser course_information = (CourseUser) list.get(i);
            %>
            <tr>
                <td><%=course_information.getId()%></td>
                <td><%=course_information.getName()%></td>
                <td><%=course_information.getMark()%></td>
                <td><%=course_information.getPrepare()%></td>
                <td><%=course_information.getDep()%></td>
                <td><a href="/myWeb/Course_Del?Id=<%=course_information.getId()%>&user=${key2}">删除</a></td>
                <td><a href="/myWeb/course_Update.jsp?Id=<%=course_information.getId()%>">更新</a></td>
            </tr>
            <%
                }
            %>

        </table>
    </form>
</center>
<a href="/myWeb/admin.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
