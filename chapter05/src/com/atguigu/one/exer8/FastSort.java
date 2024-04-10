package com.atguigu.one.exer8;

/**
 * ClassName:FastSort
 * Package:com.atguigu.one.exer8
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 20:14
 * @Version 1.0
 */
public class FastSort {
    //时间复杂度O(nlogn)
    //随便挑一个元素，将其他元素分为比它大的和比它小的两组
    public static void main(String[] args){
        int[] arr=new int[]{9,-16,30,23,-30,-49,25,21,30};
        int len=arr.length;
        //排序之前输出
        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
        System.out.println();
        //快排
        quickSort(arr,0,arr.length-1);
        //排序之后输出
        for(int i=0;i<len;i++) System.out.print(arr[i]+" ");
    }
    public static void quickSort(int[] arr,int start,int end){
        if(start<end){
            int target=arr[start];
            int i=start+1,j=end;
            while(i<j){
                while(i<j&&arr[i]<=target) i++;
                while(j>i&&arr[j]>=target) j--;
                swap(arr,i,j);
            }
            //i最终多加一个 应该交换的最终位置是i-1
            swap(arr,start,i-1);
            //两个区间分别是start,i-2和i,end
            quickSort(arr,start,i-2);
            quickSort(arr,i,end);
        }
    }
    private static void swap(int[] arr,int start,int end){
        int tmp=arr[start];
        arr[start]=arr[end];
        arr[end]=tmp;
    }
}
