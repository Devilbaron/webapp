package com.mysql.itme.dao;

import com.mysql.itme.entity.Item;
import com.mysql.itme.utill.Helper;

import java.sql.Connection;
import java.sql.PreparedStatement;

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
}
