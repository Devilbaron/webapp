package com.mysql.itme.dao;

import com.mysql.itme.entity.Item;
import com.mysql.itme.utill.Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.Statement;

/**
 * Created by Admin on 2017/8/16.
 */
public class ItemDAO {
    //添加用户信息
    public boolean addItem(Item u){
        String sql = "insert into table_item values (?,?,?,?,?)";
        Connection conn = null;
        PreparedStatement stmt = null;

        try {
            conn = Helper.getConnection();
            stmt = conn.prepareStatement(sql);
            stmt.setInt(1,u.gettId());
            stmt.setString(2,u.gettName());
            stmt.setInt(3,u.getTmpCount());
            stmt.setInt(4,u.getTcount());
            stmt.setString(5,u.gettDate());

            int result = stmt.executeUpdate();
            if (result > 0)
            {
                return true;
            }else
            {
                return false;
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }
    public boolean upItem(int id,int n)
    {
        String sql = "insert into table_item values (?,?,?,?,?)";
        Connection conn = null;
        Statement stmt = null;

        try {

            try {
                conn = Helper.getConnection();
                stmt = conn.createStatement();
                String sql = "insert into table_item SET item_tmp_count = n WHERE item_id =  )";
                stmt.executeUpdate(sql);

            int result = stmt.executeUpdate();
            if (result > 0)
            {
                return true;
            }else
            {
                return false;
            }
        }catch (Exception ex)
        {
            ex.printStackTrace();
            return false;
        }finally {
            try {
                stmt.close();
                conn.close();
            }catch (Exception ex)
            {
                ex.printStackTrace();
            }
        }
    }

    public void SelectSQL()
    {
        String sql = "Select * from table_item";
        Connection conn = null;//表示数据库连接的对象
        Statement stmt = null;//表示数据库更新操作
       try{
           conn =Helper.getConnection();
           ResultSet result = null;//表示接受数据库查询到的结果

           stmt = conn.createStatement();//tatement接口需要通过connection接口进行实例化操作

           result = stmt.executeQuery(sql);//执行sql语句，结果集放在result中

           while(result.next()){//判断是否还有下一行
               String name = result.getString("name");//获取数据库person表中name字段的值
               System.out.println(name);
           }
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
    }
}
