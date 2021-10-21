<%@ page import="entity.StudentUser" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Student_DisplaySourse" %>
<%@ page import="entity.ClassesUser" %>
<%@ page import="entity.SuperviseClass" %>
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
    <font style="font-size: 30px;font-family: 楷体;color: red">您所带的班级及学生</font>
</center>
<center>
    <form>
        <table border="1">
            <tr>
                <td>班级号</td>
                <td>课程名</td>
                <td>选择</td>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("superviseClassList");
                for(int i=0;i<list.size();i++){
                    SuperviseClass superviseClass = (SuperviseClass) list.get(i);
            %>
            <tr>
                <td><%=superviseClass.getClasses_Id()%></td>
                <td><%=superviseClass.getCourse_name()%></td>
                <td><a href="/myWeb/course_student?class_id=<%=superviseClass.getClasses_Id()%>&teacher_id=${teacherId}">选择</a></td>
            </tr>
            <%
                }
            %>

        </table>
    </form>
</center>
<a href="/myWeb/teacher.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>
