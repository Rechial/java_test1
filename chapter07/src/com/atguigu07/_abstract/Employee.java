package com.atguigu07._abstract;

/**
 * ClassName:Employee
 * Package:com.atguigu07._abstract
 * Description:
 *
 * @Author QF
 * Create 2023/12/29 16:09
 * @Version 1.0
 */
public abstract class Employee {
    private String  name;
    private double number;
    private MyDate birthday;
    Employee(){

    }
    Employee(String name,double number,MyDate birthday){
        this.name=name;
        this.number=number;
        this.birthday=birthday;
    }
    public abstract double earnings();

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public double getNumber() {
        return number;
    }

    public void setNumber(double number) {
        this.number = number;
    }

    public MyDate getBirthday() {
        return birthday;
    }

    public void setBirthday(MyDate birthday) {
        this.birthday = birthday;
    }

    @Override
    public String toString() {
        return "Employee{" +
                "name='" + name + '\'' +
                ", number=" + number +
                ", birthday=" + birthday.toDateString() +
                '}';
    }
}
