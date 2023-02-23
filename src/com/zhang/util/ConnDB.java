package com.zhang.util;

import java.sql.*;

/**
 *  mysql帮助类
 *  @Author:xiaotao
 *  @Date: 2022/02/23/8:54
 */
public class ConnDB {
    /**
     * 打开连接
     * @return
     */
    public static Connection getConn(){
        Connection conn = null;
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            conn = DriverManager.getConnection("jdbc:mysql://localhost:3306/ssm?characterEncoding=UTF-8","root","root");
        } catch (Exception e) {
            e.printStackTrace();
        }
        return conn;
    }

    /**
     * 关闭连接
     */
    public static void closeDB(ResultSet rs, PreparedStatement pstmt,Connection conn){
        try {
            if(rs != null){
                rs.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if(pstmt != null){
                pstmt.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }

        try {
            if(conn != null){
                conn.close();
            }
        } catch (SQLException throwables) {
            throwables.printStackTrace();
        }
    }
}
