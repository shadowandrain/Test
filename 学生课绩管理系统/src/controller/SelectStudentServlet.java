package controller;

import dao.UserDao;
import entity.StudentUser;
import entity.Student_DisplaySourse;
import entity.SuperviseClass;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class SelectStudentServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teacherId;
        teacherId = request.getParameter("id");
        HttpSession session = request.getSession();
        session.setAttribute("teacherId",teacherId);
        UserDao dao = new UserDao();
        List<SuperviseClass> superviseClassList = dao.superviseClass(teacherId);
        session.setAttribute("superviseClassList",superviseClassList);
        request.getRequestDispatcher("/superviseClass.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
