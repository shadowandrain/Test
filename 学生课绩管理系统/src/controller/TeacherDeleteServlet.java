package controller;

import dao.UserDao;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TeacherDeleteServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        PrintWriter out = null;
        UserDao dao = new UserDao();
        HttpSession session = request.getSession();
        String user = null;
        String Id = null;
        user = request.getParameter("user");
        Id =request.getParameter("Id");
        System.out.println(Id);
        int result = dao.t_del(Id);
        response.setContentType("text/html;charset=utf-8");
        out = response.getWriter();
        if(result != 0){
            request.getRequestDispatcher("/tAll").forward(request,response);
        }else{
            out.write("删除失败，用户不存在。");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
