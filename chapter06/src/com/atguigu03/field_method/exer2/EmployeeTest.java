package com.atguigu03.field_method.exer2;

/**
 * ClassName:EmployeeTest
 * Package:com.java.atguigu03.field_method.exer2
 * Description:
 *
 * @Author QF
 * Create 2023/12/16 21:23
 * @Version 1.0
 */
public class EmployeeTest {
    public static void main(String[] args){
        Employee emp1=new Employee();
        System.out.println("id="+emp1.id+" name="+emp1.name+" age="+emp1.age+" salary="+emp1.salary);
        Employee emp2=new Employee();
        System.out.println("id="+emp2.id+" name="+emp2.name+" age="+emp2.age+" salary="+emp2.salary);
    }
}
