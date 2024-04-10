package com.atguigu08.constructor.exer1;

/**
 * ClassName:PersonTest
 * Package:com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author QF
 * Create 2023/12/19 16:33
 * @Version 1.0
 */
public class PersonTest {
    public static void main(String[] args){
        Person p1=new Person();
        p1.eat();
        Person p2=new Person(1);
        System.out.println(p2.age);
    }
}
