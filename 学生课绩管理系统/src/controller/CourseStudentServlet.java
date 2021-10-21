package controller;

import dao.UserDao;
import entity.ClassesUser;
import entity.CourseUser;
import entity.StudentUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class CourseStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String class_id,teacher_id;
        class_id = request.getParameter("class_id");
        teacher_id = request.getParameter("teacher_id");
        UserDao dao = new UserDao();
        List<StudentUser> studentList = dao.Course_Student(class_id,teacher_id);
        HttpSession session = request.getSession();
        session.setAttribute("courseStudentList",studentList);
        session.setAttribute("class_id",class_id);
        request.getRequestDispatcher("/course_student.jsp").forward(request,response);

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
