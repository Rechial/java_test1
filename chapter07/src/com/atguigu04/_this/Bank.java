package com.atguigu04._this;

/**
 * ClassName:Bank
 * Package:com.atguigu01._this
 * Description:
 *
 * @Author QF
 * Create 2023/12/20 11:36
 * @Version 1.0
 */
public class Bank {
    private Customer[] customers;
    private int numberOfCustomer;
    public Bank(){
        //属性赋值1)显式赋值 2)构造器赋值
        customers=new Customer[10];
    }
    /**
     * 将指定姓名的客户保存在银行的客户列表中
     * */
    public void addCustomer(String f,String l){
        Customer cust=new Customer(f,l);
        customers[numberOfCustomer++]=cust;
    }
    public int getNumOfCustomers(){
        return numberOfCustomer;
    }
    public Customer getCustomer(int index){
        if(index>=0&&index<numberOfCustomer){
            return customers[index];
        }else{
            return null;
        }
    }
}
