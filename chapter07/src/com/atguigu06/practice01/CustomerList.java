package com.atguigu06.practice01;

/**
 * ClassName:CustomerList
 * Package:com.atguigu01.practice01
 * Description:
 *
 * @Author QF
 * Create 2023/12/20 22:12
 * @Version 1.0
 */
public class CustomerList {
    private Customer[] customers;
    private int total=0;
    /**
     * 构造器用于初始化Customer[]数组
     * */
    public CustomerList(int totalCustomer) {
        customers=new Customer[totalCustomer];
    }

    public boolean addCustomer(Customer customer){
        if(total< customers.length){
            customers[total++]=customer;
            return true;
        }
        return false;
    }

    public boolean replaceCustomer(int index,Customer cust){
        if(index>=0&&index<total){
            customers[index]=cust;
            return true;
        }
        return false;
    }
    /**
     * 将有效数组最后一个置空
     * */
    public boolean deleteCustomer(int index){
        if(index<0||index>=total) return false;
        for(int i=index;i<total-1;i++) customers[i]=customers[i+1];
        customers[--total]=null;
        return true;
    }

    public Customer[] getAllCustomers() {
//        错误的方法，将整个数组都返回了无论有无记录，应该只返回有记录的部分
//        return customers;
        Customer[] cust=new Customer[total];
        for(int i=0;i<total;i++) cust[i]=customers[i];
        return cust;
    }

    public Customer getCustomer(int index){
        if(index>=0&&index<total) return customers[index];
        return null;
    }

    public int getTotal() {
        return total;
    }
}
