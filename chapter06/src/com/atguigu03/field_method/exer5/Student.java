package com.atguigu03.field_method.exer5;

/**
 * ClassName:Student
 * Package:com.java.atguigu03.field_method.exer5
 * Description:
 *
 * @Author QF
 * Create 2023/12/17 17:26
 * @Version 1.0
 */
public class Student {
    int number;
    int state;
    int score;

    //声明方法显示学生属性信息
    public String show(){
        return "学生编号:"+number+ " 学生年级:"+state+" 学生成绩:"+score;
    }
}
