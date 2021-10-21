package controller;

import dao.UserDao;
import entity.StudentUser;
import entity.TeacherUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class TeacherAddServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String teacher_id,teacher_name,password,title;
        UserDao dao = new UserDao();
        teacher_id = request.getParameter("teacher_id");
        teacher_name = request.getParameter("teacher_name");
        password = request.getParameter("password");
        title = request.getParameter("title");
        TeacherUser user = new TeacherUser(null,teacher_id,teacher_name,password,title);
        int result = 0;
        PrintWriter out = null;
        result = dao.teacherAdd(user);
        if(result != 0){
            request.getRequestDispatcher("/tAll").forward(request,response);
        }else{
            out.write("添加失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
