package com.atguigu08.singleton;

/**
 * ClassName:BankTest
 * Package:com.atguigu08.singleton
 * Description:
 *
 * @Author QF
 * Create 2024/1/5 22:33
 * @Version 1.0
 */
public class BankTest {
    public static void main(String[] args) {
        Bank1 bank1=Bank1.getInstance();
        Bank1 bank2=Bank1.getInstance();
        System.out.println(bank1==bank2);
    }
}

class Bank1{
    private Bank1(){

    }
    private static Bank1 instance =new Bank1();

    public static Bank1 getInstance(){
        return instance;
    }
}
