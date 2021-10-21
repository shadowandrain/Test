package controller;

import dao.UserDao;
import entity.StudentUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;

public class Login_confirm extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String user,Id,password;
        int result = 0;
        HttpSession session = null;
        user = request.getParameter("user");
        Id = request.getParameter("Id");
        password = request.getParameter("password");
        StudentUser users = new StudentUser(user,Id,null,password,null,null,null,null,null,null);
        UserDao dao = new UserDao();
        result = dao.login(users);
        if(result == 1){
            Cookie user2 = new Cookie("key",user);
            session = request.getSession();
            session.setAttribute("userId",Id);
            response.addCookie(user2);
            request.getRequestDispatcher("/" + user + ".jsp").forward(request,response);
            System.out.println("登陆成功");
        }else{
            request.getRequestDispatcher("/login_error.jsp").forward(request,response);
        }

    }
}
