package com.webapp;

import com.mysql.itme.dao.ItemDAO;
import com.mysql.itme.entity.Item;
import com.mysql.itme.utill.ItemData;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;

public class ServletTest extends HttpServlet{
    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        resp.setContentType("text/html;charset=UTF-8");
        PrintWriter out = resp.getWriter();
        try {
            // Write some content
            out.println("<html>");
            out.println("<head>");
            out.println("<title>MyFirstServlet</title>");
            out.println("</head>");
            out.println("<body>");
            out.println("<h2>Servlet MyFirstServlet at " + req.getContextPath() + "</h2>");
            out.println("</body>");
            out.println("</html>");
        } finally {
            out.close();
        }
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        try {
//            Item t = new Item(2,"佳缘",869,856,"2017-08-17");
            Item t = new Item(4,"丝芙兰",0,160,new ItemData().data());
            ItemDAO udao = new ItemDAO();
            if (udao.addItem(t)){
                out.println("yes");
            }else
            {
                out.println("no");
            }
            //查询数据库
//            new ItemDAO().SelectSQL();

        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            out.close();
        }
    }
}