package com.atguigu._interface.exer01;

/**
 * ClassName:InterfaceTest
 * Package:com.atguigu._interface.exer01
 * Description:
 *
 * @Author QF
 * Create 2024/1/2 15:00
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        System.out.println(Flyable.MIN_SPEED);
        System.out.println(Flyable.MAX_SPEED);
        Bullet b1=new Bullet();
        b1.fly();
        b1.attack();
        //接口的多态性 接口类型 变量名=new 实现类名称;
        Flyable f1=new Bullet();
        f1.fly();
    }
}
interface Flyable{
    //全局变量
    public static final int MIN_SPEED=0;
    //可以省略public static final
    int MAX_SPEED=7900;
    //方法 省略public abstract
    void fly();
}

interface Attackable{
    public abstract void attack();
}

abstract class Plane implements Flyable{

}

class Bullet implements Flyable,Attackable{
    public void fly(){
        System.out.println("让子弹飞一会儿");
    }

    @Override
    public void attack() {
        System.out.println("子弹可以击穿身体");
    }
}
