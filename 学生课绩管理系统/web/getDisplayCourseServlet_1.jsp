<%@ page import="entity.StudentUser" %>
<%@ page import="java.util.List" %>
<%@ page import="entity.Student_DisplaySourse" %>
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
    <font style="font-size: 30px;font-family: 楷体;color: red">您可以选报的课程为</font>
</center>
<center>
    <form>
        <table border="1">
            <tr>
                <td>课程号</td>
                <td>课程名</td>
                <td>预修课</td>
                <td>系别</td>
                <td>班级号</td>
                <td>教室号</td>
                <td>上课时间</td>
                <td>教师</td>
                <td>选择</td>
            </tr>
            <%
                HttpSession session1 = request.getSession();
                List list = (List) session1.getAttribute("StudentOptionalCourses_List");
                for(int i=0;i<list.size();i++){
                    Student_DisplaySourse s_d_information = (Student_DisplaySourse) list.get(i);
            %>
            <tr>
                <td><%=s_d_information.getCourse_id()%></td>
                <td><%=s_d_information.getCourse_name()%></td>
                <td> <%=s_d_information.getPrepare()%></td>
                <td><%=s_d_information.getDepatment()%></td>
                <td><%=s_d_information.getClasses_id()%></td>
                <td><%=s_d_information.getClasses_room_id()%></td>
                <td><%=s_d_information.getCour_time()%></td>
                <td><%=s_d_information.getTeacher_name()%></td>
                <td><a href="/myWeb/SelectCourse?Student_Id=${student_id}&Classes_Id=<%=s_d_information.getClasses_id()%>">注册</a></td>
            </tr>
            <%
                }
            %>

        </table>
    </form>
    <font style="font-size: 30px;font-family: 楷体;color: red">选课成功</font>
</center>
<a href="/myWeb/student.jsp" class="add"><font style="font-family: 楷体;font-size: 20px;color: red">&lt;&lt;back</font></a>
</body>
</html>