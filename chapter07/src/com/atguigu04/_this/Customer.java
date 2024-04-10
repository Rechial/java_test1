package com.atguigu04._this;

/**
 * ClassName:Customer
 * Package:com.atguigu01._this
 * Description:
 *
 * @Author QF
 * Create 2023/12/20 11:36
 * @Version 1.0
 */
public class Customer {
    private String firstName;
    private String lastName;
    private Account account;
    //构造器不应该有返回类型修饰
    public Customer(String f,String l){
        this.firstName=f;
        this.lastName=l;
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName(){
        return lastName;
    }
    public Account getAccount(){
        return account;
    }
    public void setAccount(Account acct){
        account=acct;
    }
}
