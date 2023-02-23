package com.zhang.main;

import com.zhang.model.UserModel;
import com.zhang.util.ConnDB;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

/**
 *  mysql帮助类
 *  @Author:xiaotao
 *  @Date: 2022/02/23/8:30
 */

public class CRUD {

    /**
     * 查询
     */
    public void selAll() {
        ConnDB util = new ConnDB();
        // 获取连接
        Connection conn = util.getConn();

        // 查询 sql
        String sql = "select * from ssm_user";
        PreparedStatement pstmt = null;
        ResultSet rs = null;
        try {
            pstmt =  conn.prepareStatement(sql);
            //执行查询
            rs = pstmt.executeQuery();

            //取多行数据
            while(rs.next()){	//移动到下一条数据
                //取具体列的数据
                int id = rs.getInt("id");
                String user_name = rs.getString("user_name");
                String password = rs.getString("password");
                String role_name = rs.getString("role_name");

                System.out.println("id: " + id + "\tname: "+ user_name + "\tpassword: "+ password + "\trole_name: "+ role_name);
            }

            // 关闭连接
            util.closeDB(rs, pstmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeDB(rs, pstmt, conn);
        }
    }

    /**
     * 添加
     */
    public int insert(UserModel userModel) {
        ConnDB util = new ConnDB();
        // 获取连接
        Connection conn = util.getConn();

        int i = 0;
        // 添加 sql
        String sql = "insert into ssm_user(id, user_name, password, role_name) values(?,?,?,?)";
        PreparedStatement pstmt = null;
        try {
            pstmt =  conn.prepareStatement(sql);
            //设置参数
            pstmt.setInt(1, userModel.getId());
            pstmt.setString(2, userModel.getUser_name());
            pstmt.setString(3, userModel.getPassword());
            pstmt.setString(4, userModel.getRole_name());

            //执行
            i = pstmt.executeUpdate();

            // 关闭连接
            util.closeDB(null, pstmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeDB(null, pstmt, conn);
        }
        return i;
    }

    /**
     * 修改
     */
    public int update(UserModel userModel) {
        ConnDB util = new ConnDB();
        // 获取连接
        Connection conn = util.getConn();

        int i = 0;
        // 修改 sql
        String sql = "update ssm_user set user_name = ? , password = ? , role_name = ? where id = ? ";
        PreparedStatement pstmt = null;
        try {
            pstmt =  conn.prepareStatement(sql);
            //设置参数
            pstmt.setString(1, userModel.getUser_name());
            pstmt.setString(2, userModel.getPassword());
            pstmt.setString(3, userModel.getRole_name());
            pstmt.setInt(4, userModel.getId());

            //执行
            i = pstmt.executeUpdate();

            // 关闭连接
            util.closeDB(null, pstmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeDB(null, pstmt, conn);
        }
        return i;
    }

    /**
     * 删除
     */
    public int delete(int id) {
        ConnDB util = new ConnDB();
        // 获取连接
        Connection conn = util.getConn();

        int i = 0;
        // 修改 sql
        String sql = "delete from ssm_user where id = '"+ id +"'";
        PreparedStatement pstmt = null;
        try {
            pstmt =  conn.prepareStatement(sql);

            //执行
            i = pstmt.executeUpdate();

            // 关闭连接
            util.closeDB(null, pstmt, conn);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            util.closeDB(null, pstmt, conn);
        }
        return i;
    }

}
