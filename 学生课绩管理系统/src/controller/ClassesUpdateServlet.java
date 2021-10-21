package controller;

import dao.UserDao;
import entity.ClassesUser;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.io.PrintWriter;

public class ClassesUpdateServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String oldId = null;
        String classes_id,tea_name,cour_name,classRoom_id,cour_time;
        UserDao dao = new UserDao();
        oldId = request.getParameter("oldId");
        classes_id = request.getParameter("classes_id");
        tea_name = request.getParameter("tea_name");
        cour_name = request.getParameter("cour_name");
        classRoom_id = request.getParameter("classRoom_id");
        cour_time = request.getParameter("cour_time");
        ClassesUser user = new ClassesUser(null,classes_id,tea_name,null,cour_name,null,classRoom_id,cour_time);
        int result = 0;
        PrintWriter out = null;
        result = dao.classesUpdate(oldId,user);
        if(result != 0){
            request.getRequestDispatcher("/classes_All").forward(request,response);
        }else{
            out.write("添加失败");
        }
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
