package com.zhang.model;

/**
 * 实体类
 * @Author:xiaotao
 * @Date: 2023/02/23/9:03
 */

public class UserModel {
    private int id;
    private String user_name;
    private String password;
    private String role_name;

    public UserModel(int id, String user_name, String password, String role_name) {
        this.id = id;
        this.user_name = user_name;
        this.password = password;
        this.role_name = role_name;
    }

    public UserModel() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUser_name() {
        return user_name;
    }

    public void setUser_name(String user_name) {
        this.user_name = user_name;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getRole_name() {
        return role_name;
    }

    public void setRole_name(String role_name) {
        this.role_name = role_name;
    }

    @Override
    public String toString() {
        return "userModel{" +
                "id=" + id +
                ", user_name='" + user_name + '\'' +
                ", password='" + password + '\'' +
                ", role_name='" + role_name + '\'' +
                '}';
    }
}
