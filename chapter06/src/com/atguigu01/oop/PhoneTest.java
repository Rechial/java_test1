package com.atguigu01.oop;

/**
 * ClassName:PhoneTest
 * Package:com.atguigu01.oop
 * Description:
 *
 * @Author QF
 * Create 2023/12/16 13:41
 * @Version 1.0
 */
//phone类测试类
public class PhoneTest {
    public static void main(String[] args){
//        Scanner scan = new Scanner(System.in);
        //创建具体对象
        Phone p1=new Phone();
        p1.name="huawei mate50";
        p1.price=6999;
        System.out.println("name="+p1.name+" price="+p1.price);
        p1.call();
        p1.sendMessage("有内鬼，终止交易");
        p1.playGame();
    }
}
