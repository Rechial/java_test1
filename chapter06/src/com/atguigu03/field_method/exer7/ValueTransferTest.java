package com.atguigu03.field_method.exer7;

/**
 * ClassName:ValueTransferTest
 * Package:com.java.atguigu03.field_method.exer7
 * Description:
 *
 * @Author QF
 * Create 2023/12/18 19:05
 * @Version 1.0
 */
public class ValueTransferTest {
    public static void main(String[] args){
        ValueTransferTest test=new ValueTransferTest();
//        int m=10;
//        int n=20;
        Data data=new Data();
        data.m=10;
        data.n=20;
        System.out.println("m="+data.m+",n="+data.n);
        test.swap(data);
        System.out.println("m="+data.m+",n="+data.n);
    }
    public void swap(int m,int n){
        int tmp=m;
        m=n;
        n=tmp;
    }
    public void swap(Data data){
        int tmp=data.m;
        data.m=data.n;
        data.n=tmp;
    }
}
class Data{
    int m;
    int n;
}
