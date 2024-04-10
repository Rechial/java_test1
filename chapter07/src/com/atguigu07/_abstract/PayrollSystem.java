package com.atguigu07._abstract;

import java.util.Scanner;

/**
 * ClassName:PayrollSystem
 * Package:com.atguigu07._abstract
 * Description:
 *
 * @Author QF
 * Create 2023/12/29 16:34
 * @Version 1.0
 */
public class PayrollSystem {
    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        Employee[] employees=new Employee[2];
        employees[0]=new SalariedEmployee("mike",1001,new MyDate(1992,12,21),18000);
        employees[1]=new HourlyEmployee("shara",1002,new MyDate(1998,3,28),240,100);

        System.out.println("请输入当前月份：");
        int month= scan.nextInt();

        for(int i=0;i<employees.length;i++){
            System.out.println(employees[i].toString());
            System.out.println("工资为："+employees[i].earnings());

            if(month==employees[i].getBirthday().getMonth()) System.out.println("生日快乐！加薪100");
        }
    }
}
