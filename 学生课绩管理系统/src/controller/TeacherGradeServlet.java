package controller;

import dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TeacherGradeServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teacherGrade,studentId,class_id;
        int result = 0;
        teacherGrade = request.getParameter("teacherGrade");
        studentId = request.getParameter("studentId");
        class_id = request.getParameter("class_id");
        UserDao dao = new UserDao();
        result = dao.teacherGrade(teacherGrade,studentId,class_id);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        out = response.getWriter();
        if(result != 0){
            request.getRequestDispatcher("/Student_grade_1.jsp").forward(request,response);
        }else{
            request.getRequestDispatcher("/Student_grade_2.jsp").forward(request,response);
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
