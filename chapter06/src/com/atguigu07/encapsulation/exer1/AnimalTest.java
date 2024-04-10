package com.atguigu07.encapsulation.exer1;

/**
 * ClassName:AnimalTest
 * Package:com.atguigu07.encapsulation.exer1
 * Description:
 *
 * @Author QF
 * Create 2023/12/19 15:33
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args){
        Animal animal1=new Animal();
        animal1.name="虎皮鹦鹉";
        animal1.setLegs(2);
        System.out.println("name="+animal1.name+" legs="+animal1.getLegs());
        animal1.setLegs(-2);
        System.out.println("name="+animal1.name+" legs="+animal1.getLegs());
        animal1.eat();
    }
}

class Animal{
    String name;
    private int legs;
    public void setLegs(int l){
        if(l>=0&&l%2==0) legs=l;
        else System.out.println("你输入的数据非法");
    }
    public int getLegs(){
        return legs;
    }
    public void eat(){
        System.out.println("动物觅食");
    }
}
