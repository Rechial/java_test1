package com.atguigu.singleton;

/**
 * ClassName:BankTest
 * Package:com.atguigu.singleton
 * Description:
 *
 * @Author QF
 * Create 2023/12/26 20:13
 * @Version 1.0
 */
//饿汉式
public class BankTest {
    public static void main(String[] args) {
        Bank bank1 = Bank.getInstance();
        Bank bank2 = Bank.getInstance();
        System.out.println(bank1 == bank2);
    }
}
class Bank{
    //类的构造器私有化
    private Bank(){

    }
    //在类的内部创建当前类的实例
    private static Bank instance = new Bank();
    //使用get方法获取当前类的实例，必须声明为static
    public static Bank getInstance(){
        return instance;
    }
}
