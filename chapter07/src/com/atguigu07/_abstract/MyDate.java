package com.atguigu07._abstract;

/**
 * ClassName:MyDate
 * Package:com.atguigu07._abstract
 * Description:
 *
 * @Author QF
 * Create 2023/12/29 16:13
 * @Version 1.0
 */
public class MyDate {
    private int year;
    private int month;
    private int day;
    MyDate(){}
    MyDate(int year,int month,int day){
        this.year=year;
        this.month=month;
        this.day=day;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getMonth() {
        return month;
    }

    public void setMonth(int month) {
        this.month = month;
    }

    public int getDay() {
        return day;
    }

    public void setDay(int day) {
        this.day = day;
    }

    public String toDateString(){
        return this.year+"年"+this.month+"月"+this.day+"日";
    }
}
