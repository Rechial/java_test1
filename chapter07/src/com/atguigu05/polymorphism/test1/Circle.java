package com.atguigu05.polymorphism.test1;

/**
 * ClassName:Circle
 * Package:com.atguigu01.polymorphism.test1
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 13:09
 * @Version 1.0
 */
public class Circle extends GeometricObject{
    //属性：圆半径
    private double radius;
    //构造器
    public Circle(double radius,String color,double weight){
        super(color, weight);
        this.radius=radius;
    }
    //方法
    public void setRadius(double radius){
        this.radius=radius;
    }
    public double getRadius(){
        return this.radius;
    }
    public double findArea(){
        return Math.PI*radius*radius;
    }

    @Override
    public boolean equals(Object obj) {
        if(this==obj) return true;
        if(obj instanceof Circle){
            Circle c = (Circle) obj;
            return this.radius==c.radius;
        }
        return false;
    }

    @Override
    public String toString() {
        return "Circle[radius="+radius+"]";
    }
}
