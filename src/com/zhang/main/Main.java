package com.zhang.main;

import com.zhang.model.UserModel;

/**
 * @Author:xiaotao
 * @Date: 2022/02/23/9:21
 */

public class Main {
    /**
     * curd 测试
     * @param args
     */
    public static void main(String[] args) {
        CRUD crud = new CRUD();

        UserModel user = new UserModel(100, "小灰灰", "123456", "普通管理员");
        // 添加
        int i = crud.insert(user);
        if(i > 0) {
            System.out.println("添加成功");
        } else {
            System.out.println("添加失败");
        }
        // select
        crud.selAll();

        System.out.println("\n\n");

        // 修改
        user.setPassword("root");
        user.setRole_name("超级管理员");
        int i1 = crud.update(user);
        if(i1 > 0) {
            System.out.println("修改成功");
        } else {
            System.out.println("修改失败");
        }
        // select
        crud.selAll();

        System.out.println("\n\n");

        // 删除
        int i3 = crud.delete(100);
        if(i3 > 0) {
            System.out.println("删除成功");
        } else {
            System.out.println("删除失败");
        }
        // select
        crud.selAll();
    }
}
