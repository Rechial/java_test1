package com.atguigu.one.exer9;

import java.util.Arrays;

/**
 * ClassName:ArraysTest
 * Package:com.atguigu.one.exer9
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 21:31
 * @Version 1.0
 */
public class ArraysTest {
    public static void main(String[] args){
        //1.比较两个数组的元素是否依次相等
        int[] arr1=new int[]{1,2,3,4,5};
        int[] arr2=new int[]{1,2,3,4,5};
        System.out.println(arr1==arr2);
        boolean isEquals= Arrays.equals(arr1,arr2);
        //内容是否相等
        System.out.println(isEquals);
        //2.输出元素信息
        System.out.println(arr1);
        System.out.println(Arrays.toString(arr1));
        //3.将指定值填充到数组中
        Arrays.fill(arr1,10);
        System.out.println(Arrays.toString(arr1));
        //4.使用快排实现排序
        int[] arr3=new int[]{9,-16,30,23,-30,-49,25,21,30};
        Arrays.sort(arr3);
        System.out.println(Arrays.toString(arr3));
        //5.二分查找 数组有序前提 找到返回索引，找不到返回-1
        int index = Arrays.binarySearch(arr3,-50);
        System.out.println(index);
    }
}
