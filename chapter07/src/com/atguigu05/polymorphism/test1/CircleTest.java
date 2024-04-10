package com.atguigu05.polymorphism.test1;

/**
 * ClassName:CircleTest
 * Package:com.atguigu01.polymorphism.test1
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 15:33
 * @Version 1.0
 */
public class CircleTest {
    public static void main(String[] args) {
        Circle c1=new Circle(1.0,"white",1.0);
        Circle c2=new Circle(1.0,"white",1.0);
        if(c1.equals(c2)) System.out.println("两圆半径相等");
        else System.out.println("两圆半径不等");
        System.out.println(c1.toString());
        System.out.println(c2.toString());
        System.out.println(c1.getColor().equals(c2));
    }
}
