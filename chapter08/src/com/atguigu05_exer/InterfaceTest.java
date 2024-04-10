package com.atguigu05_exer;

/**
 * ClassName:InterfaceTest
 * Package:com.atguigu._interface.exer04
 * Description:
 *
 * @Author QF
 * Create 2024/1/2 15:46
 * @Version 1.0
 */
public class InterfaceTest {
    public static void main(String[] args) {
        ComparableCircle c1=new ComparableCircle(2.3);
        ComparableCircle c2=new ComparableCircle(2.3);
        try {
            int compareVal = c1.compareTo(c2);
            if(compareVal > 0) System.out.println("c1对象大");
            else if (compareVal < 0) System.out.println("c2对象大");
            else System.out.println("一样大");
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

interface CompareObject {
    public int compareTo(Object o) throws Exception;
}

class Circle{
    private double radius;

    public Circle() {
    }

    public Circle(double radius) {
        this.radius = radius;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public String toString() {
        return "Circle{" +
                "radius=" + radius +
                '}';
    }
}

class ComparableCircle extends Circle implements CompareObject{
    public ComparableCircle() {
    }

    public ComparableCircle(double radius) {
        super(radius);
    }

    @Override
    public int compareTo(Object o) throws Exception{
        //地址相同，直接返回相等
        if(this==o) return 0;
        //instanceof类型判别
        if(o instanceof ComparableCircle){
            ComparableCircle c=(ComparableCircle)o;
//            if(this.getRadius()>c.getRadius()) return 1;
//            else if(this.getRadius()<c.getRadius()) return -1;
//            else return 0;

            Double.compare(this.getRadius(),c.getRadius());
        }else{
//            throw new RuntimeException("输入的类型不匹配");
            throw new Exception("输入的类型不匹配");
        }
        return 0;
    }
}