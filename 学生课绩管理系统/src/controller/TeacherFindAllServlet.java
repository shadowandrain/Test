package controller;

import dao.UserDao;
import entity.StudentUser;
import entity.TeacherUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class TeacherFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        String user = null;
        user = request.getParameter("user");
        List<TeacherUser> userList = dao.teacherFindAll();
        HttpSession session = request.getSession();
        session.setAttribute("key",userList);
        request.setAttribute("key2",user);
        request.getRequestDispatcher("/getTeacher.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
