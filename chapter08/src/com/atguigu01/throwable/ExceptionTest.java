package com.atguigu01.throwable;

import org.junit.Test;

import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * ClassName:ExceptionTest
 * Package:com.atguigu01.throwable
 * Description:
 *
 * @Author QF
 * Create 2024/3/27 10:36
 * @Version 1.0
 */
public class ExceptionTest {
    @Test
    public void test1(){
        try{
        Scanner scan = new Scanner(System.in);
        int num = scan.nextInt();
        System.out.println(num);
        }catch(InputMismatchException e){
            System.out.println("出现了InputMismatchException的异常");
        }catch(NullPointerException e){
            System.out.println("出现了NullPointerException的异常");
        }catch(RuntimeException e){
            System.out.println("出现了RuntimeException的异常");
        }
        System.out.println("异常结束继续执行");
    }
    @Test
    public void test2(){
        try {
            String str = "123";
            str = "abc";
            int i = Integer.parseInt(str);
            System.out.println(i);
        }catch(NumberFormatException e){
//            e.printStackTrace();//打印堆栈信息
            System.out.println(e.getMessage());
        }
        System.out.println("异常结束继续执行");
    }
}
