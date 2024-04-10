package com.atguigu07._abstract;

/**
 * ClassName:HourlyEmployee
 * Package:com.atguigu07._abstract
 * Description:
 *
 * @Author QF
 * Create 2023/12/29 16:26
 * @Version 1.0
 */
public class HourlyEmployee extends Employee{
    private double wage;
    private double hour;
    HourlyEmployee(){}
    HourlyEmployee(String name,double number,MyDate birthday,double wage,double hour){
        super(name,number,birthday);
        this.wage=wage;
        this.hour=hour;
    }
    public double earnings(){
        return wage*hour;
    }
    public String toString(){
//        System.out.println(super.toString());
        return "HourlyEmployee["+super.toString()+"]";
    }
}
