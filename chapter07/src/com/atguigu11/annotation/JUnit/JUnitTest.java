package com.atguigu11.annotation.JUnit;

import org.junit.Test;

import java.util.Scanner;

/**
 * ClassName:JUnitTest
 * Package:com.atguigu11.annotation.JUnit
 * Description:
 *
 * @Author QF
 * Create 2024/1/4 22:20
 * @Version 1.0
 */
public class JUnitTest {
    @Test
    public void test1(){
        System.out.println("hello1");
    }

    @Test
    public void test2(){
        System.out.println("hello2");
    }
    @Test
    public void test3(){
        Scanner scan =new Scanner(System.in);
        System.out.println("请输入一个数值：");
        int num=scan.nextInt();
        System.out.println(num);
    }
    @Test
    public void test4(){
        System.out.println("hello4");
    }
}
