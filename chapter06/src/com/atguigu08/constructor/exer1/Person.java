package com.atguigu08.constructor.exer1;

/**
 * ClassName:Person
 * Package:com.atguigu08.constructor.exer1
 * Description:
 *
 * @Author QF
 * Create 2023/12/19 16:33
 * @Version 1.0
 */
public class Person {
    //属性或实例变量
    String name;
    int age;
    public Person(int age){
        this.age=age;
    }
    public Person(String name){
        this.name=name;
    }
    public Person(){
        System.out.println("Person()");
    }
    public void eat(){
        System.out.println("人吃饭");
    }
    public void sleep(int hour){
        System.out.println("每天睡眠"+hour+"小时");
    }
//Alt+Inset快捷键 快速获取get和set方法
//    public String getName() {
//        return name;
//    }
//
//    public void setName(String name) {
//        this.name = name;
//    }
//
//    public int getAge() {
//        return age;
//    }
//
//    public void setAge(int age) {
//        this.age = age;
//    }
}
