package com.atguigu05_exer.exer2;

/**
 * ClassName:DivisionDemo
 * Package:com.atguigu05_exer.exer2
 * Description:
 *
 * @Author QF
 * Create 2024/4/9 15:55
 * @Version 1.0
 */
public class DivisionDemo {
    public static void main(String[] args) {
        try {
            int m = Integer.parseInt(args[0]);
            int n = Integer.parseInt(args[1]);
            int res = divide(m,n);
            System.out.println("结果为"+res);
        }catch(BelowZeroException e){
            System.out.println(e.getMessage());
        }catch (NumberFormatException e){
            System.out.println("数据类型格式不一致");
        }catch (ArrayIndexOutOfBoundsException e){
            System.out.println("缺少命令行参数");
        }catch (ArithmeticException e){
            System.out.println("除数为0");
        }
    }

    public static int divide(int m,int n) throws BelowZeroException{
        if(m < 0 || n < 0){
            throw new BelowZeroException("输入的值为负数");
        }
        return m/n;
    }
}
