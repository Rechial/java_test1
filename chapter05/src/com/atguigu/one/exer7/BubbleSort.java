package com.atguigu.one.exer7;

/**
 * ClassName:BubbleSort
 * Package:com.atguigu.one.exer7
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 20:02
 * @Version 1.0
 */
public class BubbleSort {
    public static void main(String[] args){
        int[] arr=new int[]{34,54,3,2,65,7,34,5,76,34,67};
        int len=arr.length;
        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
        System.out.println();

        //冒泡排序 每次两两比较 O(n^2)
        for(int i=0;i<len-1;i++){
            //最后一个固定
            for(int j=0;j<len-1-i;j++){
                if(arr[j]<=arr[j+1]) continue;
                else{
                    int tmp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=tmp;
                }
            }
        }

        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
    }
}
