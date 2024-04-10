package com.atguigu03.field_method.exer4;

/**
 * ClassName:Person
 * Package:com.java.atguigu03.field_method.exer4
 * Description:
 *
 * @Author QF
 * Create 2023/12/17 17:09
 * @Version 1.0
 */

public class PersonTest {
    public static void main(String[] args){
        Person p1=new Person();
        p1.name="Jack";
        p1.age=24;
        p1.gender='男';
        p1.study();
        int age = p1.showAge();
        p1.addAge(2);

        Person p2=new Person();
        p1.name="Rose";
        p1.age=20;
        p1.gender='女';
        p1.study();
        p1.showAge();
        p1.addAge(10);
    }
}

class Person{
    String name;
    int age;
    char gender;

    public void study(){
        System.out.println(name+" is studying");
    }
    public int showAge(){
        System.out.println(name+"的年龄为"+age);
        return age;
    }
    public void addAge(int addAge){
        age+=addAge;
        System.out.println(name+"的新年龄为"+age);
    }
}
