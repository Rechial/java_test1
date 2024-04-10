package com.atguigu.one.exer3;

/**
 * ClassName:ArrayExer03
 * Package:com.atguigu.one.exer3
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 19:01
 * @Version 1.0
 */
/*
* 定义一个int型的一维数组，包含10个元素，分别赋给一些随机整数，
* 然后求出所有元素的最大值、最小值、总和、平均值，并输出出来
* */
public class ArrayExer03 {
    public static void main(String[] args){
        //创建数组
        int[] arr=new int[10];
        for(int i=0;i<arr.length;i++) arr[i]= (int)(Math.random()*(99-10+1))+10;
        //求最大值
        int maxVal=arr[0];
        for(int i=1;i<arr.length;i++) maxVal=((maxVal>=arr[i])?maxVal:arr[i]);
        //求最小值
        int minVal=arr[0];
        for(int i=1;i<arr.length;i++) minVal=((minVal<=arr[i])?maxVal:arr[i]);
        //总和及平均值
        int sumVal=arr[0];
        double avrVal=0;
        for(int i=1;i<arr.length;i++) sumVal+=arr[i];
        avrVal=sumVal/arr.length;
        System.out.println("最大值："+maxVal+"最小值："+minVal+"总和："+sumVal+"平均值："+avrVal);
    }
}
