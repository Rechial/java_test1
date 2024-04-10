package com.atguigu._interface.exer03;

/**
 * ClassName:EatableTest
 * Package:com.atguigu._interface.exer03
 * Description:
 *
 * @Author QF
 * Create 2024/1/2 15:36
 * @Version 1.0
 */
public class EatableTest {
    public static void main(String[] args) {
        Eatable[] eatables=new Eatable[3];
        eatables[0]=new Chinese();
        eatables[1]=new American();
        eatables[2]=new Indian();
        for(int i=0;i<eatables.length;i++) eatables[i].eat();
    }
}

interface Eatable{
    public abstract void eat();
}

class Chinese implements Eatable{
    @Override
    public void eat() {
        System.out.println("中国人用筷子吃饭");
    }
}

class American implements Eatable{
    @Override
    public void eat() {
        System.out.println("美国人用刀叉吃饭");
    }
}

class Indian implements Eatable{
    public void eat() {
        System.out.println("印度人用手抓饭");
    }
}