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
        return ;
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        PrintWriter out = resp.getWriter();
        try {
           String data = new ItemData().data();
//            out.println(data);
            Item t = new Item(1,"佳缘",869,856,"2017-08-16");
//            Item t = new Item(1,"佳缘",869,856,data);
            ItemDAO udao = new ItemDAO();
            if (udao.addItem(t)){
                out.println("yes");
            }else
            {
                out.println("no");
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            out.close();
        }
    }
}