package com.atguigu.one.exer6;

/**
 * ClassName:LinerSearch
 * Package:com.atguigu.one.exer6
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 19:39
 * @Version 1.0
 */
public class BinarySearch {
    public static void main(String[] args){
        //面向有序数组 logN
        int[] arr=new int[]{2,5,7,8,10,15,18,20,22,25,28};
        int len=arr.length;
        int left=0,right=len-1;
        int mid=left+(right-left)/2;
        int target=29;
        while(left<=right){
            if(arr[mid]==target){
                System.out.println("找到目标值");
                break;
            }
            else if(arr[mid]>target){
                right=mid-1;
                mid=left+(right-left)/2;
            }
            else{
                left=mid+1;
                mid=left+(right-left)/2;
            }
        }
        if(left>right) System.out.println("未找到目标值");
    }
}
