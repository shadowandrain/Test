package controller;

import dao.UserDao;
import entity.StudentScore;

import javax.servlet.*;
import javax.servlet.http.*;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class ViewMarkServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String userId = (String)request.getParameter("id");
        UserDao dao = new UserDao();
        List<StudentScore> studentScoreList = dao.studentScore(userId);
        HttpSession session = request.getSession();
        session.setAttribute("studentScoreList",studentScoreList);
        request.getRequestDispatcher("/studentScore.jsp").forward(request,response);
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
