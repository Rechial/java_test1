package com.atguigu01.oop;

/**
 * ClassName:Phone
 * Package:com.atguigu01.oop
 * Description:
 *
 * @Author QF
 * Create 2023/12/16 13:40
 * @Version 1.0
 */
public class Phone {
    String name;
    double price;
    public void call(){
        System.out.println("手机能够拨打电话");
    }
    public void sendMessage(String message){
        System.out.println("发送消息："+message);
    }
    public void playGame(){
        System.out.println("手机可以玩游戏");
    }
}
