package controller;

import dao.UserDao;
import entity.ClassesUser;
import entity.CourseUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.List;

public class ClassesFindAllServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        UserDao dao = new UserDao();
        String user = null;
        user = request.getParameter("user");
        List<ClassesUser> userList = dao.ClassesFindAll();
        HttpSession session = request.getSession();
        session.setAttribute("key",userList);
        request.setAttribute("key2",user);
        request.getRequestDispatcher("/getClasses.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
