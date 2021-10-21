package controller;

import dao.UserDao;
import entity.CourseUser;
import entity.StudentUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CourseAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String course_name,course_id,dep,prepare;
        Integer mark = 0;
        UserDao dao = new UserDao();
        course_name = request.getParameter("course_name");
        course_id = request.getParameter("course_id");
        mark = Integer.valueOf(request.getParameter("mark"));
        dep = request.getParameter("dep");
        prepare = request.getParameter("prepare");
        CourseUser user = new CourseUser(null,course_id,course_name,mark,prepare,dep);
        int result = 0;
        PrintWriter out = null;
        result = dao.courseAdd(user);
        if(result != 0){
            request.getRequestDispatcher("/course_All").forward(request,response);
        }else{
            out.write("添加失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
