package controller;

import dao.UserDao;
import entity.StudentUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldId = null;
        String student_id,student_name,password,department,sex,address;
        int result = 0;
        oldId = request.getParameter("oldId");
        student_id = request.getParameter("student_id");
        student_name = request.getParameter("student_name");
        password = request.getParameter("password");
        department = request.getParameter("department");
        sex = request.getParameter("sex");
        address = request.getParameter("address");
        StudentUser user = new StudentUser(null,student_id,student_name,password,address,department,sex,null,null,null);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        out =response.getWriter();
        UserDao dao = new UserDao();
        result = dao.studentUpdate(oldId,user);
        if(result != 0){
            request.getRequestDispatcher("/sAll").forward(request,response);
        }else{
            out.print("修改失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
