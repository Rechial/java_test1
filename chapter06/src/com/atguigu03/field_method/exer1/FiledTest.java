package com.atguigu03.field_method.exer1;

/**
 * ClassName:FiledTest
 * Package:com.java.atguigu03.field_method
 * Description:
 *
 * @Author QF
 * Create 2023/12/16 14:26
 * @Version 1.0
 */
public class FiledTest {

}

class Person{
    //属性
    String name;
    int age;
    char gender;
    //方法
    public void eat(){
        String food="宫保鸡丁";//局部变量
        System.out.println("我喜欢吃"+food);
    }
    //形参：属于局部变量
    public void sleep(int hour){
        System.out.println("人不能少于"+hour+"的睡眠");
        //超出作用域
        //System.out.println(food);
        //没有超出作用域
        //System.out.println(name);
    }
}
