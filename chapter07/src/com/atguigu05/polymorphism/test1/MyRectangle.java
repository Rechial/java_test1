package com.atguigu05.polymorphism.test1;

/**
 * ClassName:MyRectangle
 * Package:com.atguigu01.polymorphism.test1
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 13:10
 * @Version 1.0
 */
public class MyRectangle extends GeometricObject{
    private double width;
    private double height;
    public MyRectangle(double width,double height,String color,double weight){
        super(color,weight);
        this.width=width;
        this.height=height;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }
    public double findArea(){
        return width*height;
    }
}
