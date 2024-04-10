package com.atguigu01._class;

/**
 * ClassName:Account
 * Package:com.atguigu01._class
 * Description:
 *
 * @Author QF
 * Create 2023/12/25 19:39
 * @Version 1.0
 */
public class Account {
    private int id;//账号
    private String password;//密码
    private double balance;//余额
    private static double interestRate;
    private static double minBalance=1.0;
    private static int init=1001;
    public Account(){
        this.id=init;
        init++;
    }
    public Account(String password, double balance) {
        this();
        this.password = password;
        this.balance = balance;
    }

    public static double getInterestRate() {
        return interestRate;
    }

    public static void setInterestRate(double interestRate) {
        Account.interestRate = interestRate;
    }

    public static double getMinBalance() {
        return minBalance;
    }

    public static void setMinBalance(double minBalance) {
        Account.minBalance = minBalance;
    }

    @Override
    public String toString() {
        return "Account{" +
                "id=" + id +
                ", password='" + password + '\'' +
                ", balance=" + balance +
                '}';
    }
}
