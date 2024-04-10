package com.atguigu09.inner;

/**
 * ClassName:test
 * Package:com.atguigu09.inner
 * Description:
 *
 * @Author QF
 * Create 2024/1/3 19:26
 * @Version 1.0
 */
public class ObjectTest {
    public static void main(String[] args) {
//        SubObject subObject=new SubObject();
//        subObject.test();

        //提供一个继承于Object的匿名子类的匿名对象
        new Object(){
            public void test(){
                System.out.println("尚硅谷");
            }
        }.test();
    }
}

class SubObject extends Object{
    public void test(){
        System.out.println("尚硅谷");
    }
}