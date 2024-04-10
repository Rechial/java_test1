package com.atguigu01._class;

/**
 * ClassName:AccountTest
 * Package:com.atguigu01._class
 * Description:
 *
 * @Author QF
 * Create 2023/12/25 19:43
 * @Version 1.0
 */
public class AccountTest {
    public static void main(String[] args) {
        Account acc1=new Account();
        System.out.println(acc1.toString());
        Account acc2=new Account("123456",1000);
        System.out.println(acc2.toString());
        System.out.println("银行存款的利率为："+Account.getInterestRate());
        System.out.println("银行存款的最小存款额度为："+Account.getMinBalance());
    }
}
