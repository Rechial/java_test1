package com.atguigu03.field_method.exer3;

/**
 * ClassName:MethodTest
 * Package:com.java.atguigu03.field_method.exer3
 * Description:
 *
 * @Author QF
 * Create 2023/12/17 15:20
 * @Version 1.0
 */
public class MethodTest {
    public static void main(String[] args){
        Person p1=new Person();
        p1.name="齐凡";
        p1.age=24;
        p1.gender='女';
        p1.eat();
        p1.sleep(10);
        p1.interests("吃饭");
    }
}

class Person{
    //属性
    String name;
    int age;
    char gender;
    //方法
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("人至少每天睡眠"+hour+"小时");
    }
    public String interests(String hobby){
        String info="我的爱好是"+hobby;
        System.out.println(info);
        return info;
    }
}
