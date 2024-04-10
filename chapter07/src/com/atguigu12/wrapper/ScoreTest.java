package com.atguigu12.wrapper;

import java.util.Scanner;
import java.util.Vector;

/**
 * ClassName:ScoreTest
 * Package:com.atguigu12.wrapper
 * Description:
 *
 * @Author QF
 * Create 2024/1/5 14:21
 * @Version 1.0
 */
public class ScoreTest {
    public static void main(String[] args) {
        //1.创建Vector对象
        Vector v = new Vector();
        //2.从键盘获取多个学生成绩存放到v中以负数代表输入结束
        Scanner scanner = new Scanner(System.in);
        int maxScore=0;
        while (true){
            System.out.print("请输入学生成绩");
            int i = scanner.nextInt();
//            Integer i1 = Integer.valueOf(i);
            if(i<0) break;
            v.addElement(i);
            if(maxScore<i) maxScore=i;
        }
        //3.获取学生成绩的最大值
        //4.一次获取v中每个学生成绩，与最高分进行比较，获取学生等级并输出
        for(int i=0;i<v.size();i++){
            Object objScore = v.elementAt(i);
//            Integer integerScore = (Integer) objScore;
//            //拆箱
//            int score=integerScore.intValue();
            //自动拆箱
            char grade=' ';
            int score = (Integer)objScore;
            if(maxScore-score<=10) grade='A';
            else if(maxScore-score<=20) grade='B';
            else if(maxScore-score<=30) grade='C';
            else grade='D';
            System.out.println("成绩"+grade);
        }
    }
}
