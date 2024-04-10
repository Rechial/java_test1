package com.atguigu.one.exer1;

import java.util.Scanner;

/**
 * ClassName:ArrayExer
 * Package:com.atguigu.one.exer1
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 13:44
 * @Version 1.0
 */

/*
* 输出英文星期几
* 用一个数组，保存星期一到星期天的7个英语单词，从键盘输入1-7，显示对应单词
* */
public class ArrayExer {
    public static void main(String[] args){
        String[] weeks=new String[]{"Monday","Tuesday","Wednesday","Thursday","Friday","Saturday","Sunday"};
        Scanner scan = new Scanner(System.in);
        System.out.print("请输入1-7之间的数值：");
        int day=scan.nextInt();
        if(day<1||day>7) System.out.println("您输入的数据有误！请重新输入。");
        else System.out.println(weeks[day-1]);
        scan.close();

    }
}
