package controller;

import dao.UserDao;
import entity.CourseUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class CourseUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldId = null;
        String course_name,course_id,dep,prepare;
        Integer mark = 0;
        UserDao dao = new UserDao();
        oldId = request.getParameter("oldId");
        course_name = request.getParameter("course_name");
        course_id = request.getParameter("course_id");
        mark = Integer.valueOf(request.getParameter("mark"));
        dep = request.getParameter("dep");
        prepare = request.getParameter("prepare");
        CourseUser user = new CourseUser(null,course_id,course_name,mark,prepare,dep);
        int result = 0;
        PrintWriter out = null;
        result = dao.courseUpdate(oldId,user);
        if(result != 0){
            request.getRequestDispatcher("/course_All").forward(request,response);
        }else{
            out.write("修改失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
