package com.atguigu04._this;

/**
 * ClassName:Account
 * Package:com.atguigu01._this
 * Description:
 *
 * @Author QF
 * Create 2023/12/20 11:36
 * @Version 1.0
 */
public class Account {
    private double balance;
    public Account(double init_balance){
        this.balance=init_balance;
    }
    public double getBalance(){
        return this.balance;
    }
    /**
     * 存钱
     * */
    public void deposit(double amt){
        if(amt>0){
            balance+=amt;
            System.out.println("成功存入:"+amt);
        }
    }
    public void withdraw(double amt){
        if(balance>=amt&&amt>0){
            balance-=amt;
            System.out.println("成功取出:"+amt);
        }else{
            System.out.println("取款数额有误或余额不足");
        }
    }
}
