package com.atguigu.one.exer2;

import java.util.Scanner;

/**
 * ClassName:ArrayExer02
 * Package:com.atguigu.one.exer2
 * Description:
 *
 * @Author QF
 * Create 2023/12/14 13:56
 * @Version 1.0
 */
public class ArrayExer02 {
    public static void main(String[] args){
        //从键盘输入学生人数，根据人数创建数组
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入学生人数:");
        int count=scan.nextInt();
        int[] grades=new int[count];
        //根据提示输入学生成绩，并将成绩保存在数组元素中
        System.out.println("请输入"+count+"个学生的成绩:");
        for(int i=0;i<count;i++) grades[i]=scan.nextInt();
        //获取学生成绩最大值
        int maxGrade=grades[0];
        for(int i=1;i<count;i++) maxGrade=((maxGrade>=grades[i])?maxGrade:grades[i]);
        System.out.println("最高分是："+maxGrade);
        //遍历数组元素，根据学生成绩与最高分的差值，得到每个学生的等级，输出成绩和等级
        for(int i=0;i<count;i++){
            if(grades[i]>=maxGrade-10) System.out.println("学生"+i+"成绩等级为A");
            else if(grades[i]>=maxGrade-20) System.out.println("学生"+i+"成绩等级为B");
            else if(grades[i]>=maxGrade-30) System.out.println("学生"+i+"成绩等级为C");
            else System.out.println("学生"+i+"成绩等级为D");
        }
        scan.close();
    }
}
