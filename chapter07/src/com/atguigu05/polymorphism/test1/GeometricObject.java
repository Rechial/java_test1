package com.atguigu05.polymorphism.test1;

/**
 * ClassName:GeometricObject
 * Package:com.atguigu01.polymorphism.test1
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 13:09
 * @Version 1.0
 */
public class GeometricObject {
    //属性
    protected String color;
    protected double weight;
    //构造器
    protected GeometricObject(String color,double weight){
        this.color=color;
        this.weight=weight;
    }
    //方法
    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double findArea(){
        return 0.0;
    }
}
