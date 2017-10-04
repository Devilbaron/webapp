package com.webapp;

import com.mysql.itme.dao.UserDAO;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * Created by Dabing on 2017/10/3.
 */
@WebServlet(name = "LoginServlet")
public class LoginServlet extends HttpServlet {
    String username=null;
    String password=null;
    @Override
    protected void service(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        super.service(req, resp);
    }

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        request.setCharacterEncoding("utf-8");
        username=request.getParameter("username");
        System.out.println("开始post请求");
        String user =request.getParameter("username");
        if (new UserDAO().SelectUsers(username,password)){

            request.getSession().setAttribute("user",user);
            request.getRequestDispatcher("ok.jsp").forward(request,response);
        }else{
            response.sendRedirect("index.jsp");
        }
//        password=request.getParameter("password");
//        if (new UserDAO().SelectUsers(username,password)){
//            System.out.println("成功");
//        }else{
//            System.out.println("失败");
//        }
    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
