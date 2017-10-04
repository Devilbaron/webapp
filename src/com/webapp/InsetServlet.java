package com.webapp;

import com.mysql.itme.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;

/**
 * Created by Dabing on 2017/10/4.
 */
@WebServlet(name = "InsetServlet")
public class InsetServlet extends HttpServlet {
    String username=null;
    String password=null;

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        username=request.getParameter("username");
        System.out.println("开始添加用户请求");
        String user =request.getParameter("username");
        if (new UserDAO().SelectUsers(username,password)){

            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("ok.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
