package controller;

import dao.UserDao;
import entity.StudentUser;
import entity.Student_DisplaySourse;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class DisplayCourseServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String id;
        id = request.getParameter("id");
        HttpSession session = request.getSession();
        session.setAttribute("student_id",id);
        UserDao dao = new UserDao();
        List<Student_DisplaySourse> StudentOptionalCourses_List = dao.StudentOptionalCourses(id);
        session.setAttribute("StudentOptionalCourses_List",StudentOptionalCourses_List);
        request.getRequestDispatcher("/getDisplayCourseServlet.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
