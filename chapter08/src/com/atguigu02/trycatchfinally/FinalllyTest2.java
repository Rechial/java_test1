package com.atguigu02.trycatchfinally;

/**
 * ClassName:FinalllyTest2
 * Package:com.atguigu02.trycatchfinally
 * Description:
 *
 * @Author QF
 * Create 2024/4/1 11:29
 * @Version 1.0
 */
public class FinalllyTest2 {
    public static void main(String[] args) {
        int res = test("ab");
        System.out.println(res);
    }

    public static int test(String str){
        try {
            Integer.parseInt(str);
            return 1;
        }catch (NumberFormatException e){
            return -1;
        }finally {
            System.out.println("test结束");
        }
    }
}
