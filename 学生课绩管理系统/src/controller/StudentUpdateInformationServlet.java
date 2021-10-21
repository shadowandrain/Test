package controller;

import dao.UserDao;
import entity.StudentUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class StudentUpdateInformationServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldId = null;
        String student_id,student_name,password,department,sex,address,tel,e_mail;
        int result = 0;
        oldId = request.getParameter("oldId");
        student_id = request.getParameter("student_id");
        student_name = request.getParameter("student_name");
        password = request.getParameter("password");
        department = request.getParameter("department");
        sex = request.getParameter("sex");
        address = request.getParameter("address");
        tel = request.getParameter("tel");
        e_mail = request.getParameter("e_mail");
        StudentUser user = new StudentUser(null,student_id,student_name,password,address,department,sex,null,tel,e_mail);
        response.setContentType("text/html;charset=utf-8");
        PrintWriter out = null;
        out =response.getWriter();
        UserDao dao = new UserDao();
        result = dao.studentUpdateOnself(oldId,user);
        if(result != 0){
            out.print("修改成功");
        }else{
            out.print("修改失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
