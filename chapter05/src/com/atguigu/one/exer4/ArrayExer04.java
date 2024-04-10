package com.atguigu.one.exer4;

/**
 * ClassName:ArrayExer04
 * Package:com.atguigu.one.exer4
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 19:16
 * @Version 1.0
 */
/*
* 数组反转：数组对称位置互换
* */
public class ArrayExer04 {
    public static void main(String[] args){
        //1)方式1：遍历len/2位置前后交换
        int[] arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int len=arr.length;
        for(int i=0;i<len;i++) System.out.print(arr[i]+"\t");
        System.out.println();
        for(int i=0;i<len/2;i++){
            int tmp=arr[i];
            arr[i]=arr[len-i-1];
            arr[len-i-1]=tmp;
        }
        for(int i=0;i<len;i++) System.out.print(arr[i]+"\t");
    }
}
