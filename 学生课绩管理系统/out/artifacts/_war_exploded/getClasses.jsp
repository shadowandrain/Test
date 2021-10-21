<%@ page import="entity.StudentUser" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.ClassesUser" %>
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
        <font style="font-size: 30px;font-family: 楷体;color: red">所有班级</font>
    </center>
    <a href="/myWeb/classesAdd.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">新增班级</font></a>
    <center>
    <form>
        <table border="1">
            <tr>
                <td>班级号</td>
                <td>教师</td>
                <td>教师号</td>
                <td>课程</td>
                <td>课程号</td>
                <td>教室ID</td>
                <td>上课时间</td>
                <td colspan="2" align="center">功能</td>
                <%--<td>删除</td>
                <td>更新</td>--%>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("key");
                for(int i=0;i<list.size();i++){
                    ClassesUser classes_information = (ClassesUser) list.get(i);
            %>
            <tr>
                <td><%=classes_information.getClass_id()%></td>
                <td><%=classes_information.getTea_name()%></td>
                <td><%=classes_information.getTea_id()%></td>
                <td><%=classes_information.getCour_name()%></td>
                <td><%=classes_information.getCour_id()%></td>
                <td><%=classes_information.getClassRoom_id()%></td>
                <td><%=classes_information.getCour_time()%></td>
                <td><a href="/myWeb/Classes_Del?Id=<%=classes_information.getClass_id()%>&user=${key2}">删除</a></td>
                <td><a href="/myWeb/classes_Update.jsp?Id=<%=classes_information.getClass_id()%>&user=${key2}">更新</a></td>
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
