package controller;

import dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class SelectCourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String Classes_id,Student_id;
        Student_id = (String) request.getParameter("Student_Id");
        Classes_id = (String) request.getParameter("Classes_Id");
        UserDao dao = new UserDao();
        int result = 0;
        result = dao.selectCourse(Classes_id,Student_id);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        out = response.getWriter();
        if(result != 0){
            request.getRequestDispatcher("/getDisplayCourseServlet_1.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/getDisplayCourseServlet_2.jsp").forward(request,response);
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
