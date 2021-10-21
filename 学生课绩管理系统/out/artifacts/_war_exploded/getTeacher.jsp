<%@ page import="entity.TeacherUser" %>
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
        a:hover{text-decoration:none;}
        a{
            text-decoration: none;
            color: #ff3796;
        }
    </style>
</head>
<body>
<center>
    <font style="font-size: 30px;font-family: 楷体;color: red">所有学生</font>
</center>
<a href="/myWeb/teacherAdd.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">新增教师</font></a>
<center>
    <form>
        <table border="1">
            <tr>
                <td>教师号</td>
                <td>姓名</td>
                <td>职称</td>
                <td>密码</td>
                <td colspan="2" align="center">功能</td>
<%--                <td>更新</td>--%>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("key");
                for(int i=0;i<list.size();i++){
                    TeacherUser t_information = (TeacherUser) list.get(i);
            %>
            <tr>
                <td><%=t_information.getId()%></td>
                <td><%=t_information.getName()%></td>
                <td><%=t_information.getTitle()%></td>
                <td><%=t_information.getPassword()%></td>
                <td><a href="/myWeb/tDel?Id=<%=t_information.getId()%>&user=${key2}">删除</a></td>
                <td><a href="/myWeb/teacherUpdate.jsp?Id=<%=t_information.getId()%>&user=${key2}">更新</a></td>
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
