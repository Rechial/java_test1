package com.atguigu07._abstract;

/**
 * ClassName:SalariedEmployee
 * Package:com.atguigu07._abstract
 * Description:
 *
 * @Author QF
 * Create 2023/12/29 16:19
 * @Version 1.0
 */
public class SalariedEmployee extends Employee{
    private double monthlySalary;
    SalariedEmployee(){}
    SalariedEmployee(String name,double number,MyDate birthday,double monthlySalary){
        super(name,number,birthday);
        this.monthlySalary=monthlySalary;
    }
    public double earnings(){
        return monthlySalary;
    }
    public String toString(){
        return "SalariedEmployee["+super.toString()+"]";
    }
}
