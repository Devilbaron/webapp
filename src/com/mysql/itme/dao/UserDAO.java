package com.mysql.itme.dao;

import com.mysql.itme.utill.Helper;

import java.sql.Connection;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Dabing on 2017/10/3.
 */
public class UserDAO {
    public boolean SelectUsers(String name,String psw)
    {
        String sql = "Select * from table_name WHERE user='"+ name+"'/*&&psw='"+psw+"'*/;";
//        String sql = "Select * from table_name;";
        Connection conn = null;//表示数据库连接的对象
        Statement stmt = null;//表示数据库更新操作
        try{
            conn = Helper.getConnection();
            ResultSet result = null;//表示接受数据库查询到的结果

            stmt = conn.createStatement();//tatement接口需要通过connection接口进行实例化操作

            result = stmt.executeQuery(sql);//执行sql语句，结果集放在result中

            while(result.next()){//判断是否还有下一行
                System.out.println("数据库查询");
                String username = result.getString("user");
                String password = result.getString("psw");
                System.out.println(username);
                System.out.println(password);
//                upItem(tid,tmp);
                return true;
            }
            System.out.println("查询完毕");
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }
        return false;
    }

    public boolean InsetUsers(String name,String psw)
    {
        String sql = "INSERT INTO table_name (name,psw) VALUES ("+name+","+psw+");";
//        String sql = "Select * from table_name;";
        Connection conn = null;//表示数据库连接的对象
        Statement stmt = null;//表示数据库更新操作
        try{
            conn = Helper.getConnection();
            ResultSet result = null;//表示接受数据库查询到的结果

            stmt = conn.createStatement();//tatement接口需要通过connection接口进行实例化操作

            int Res = stmt.executeUpdate(sql); //执行sql语句，结果集放在result中
            System.out.println("插入完毕");
            return (Res>0?true:false);
        }catch (Exception ex)
        {
            ex.printStackTrace();
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }

        }
        return false;
    }

}
