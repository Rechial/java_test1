package com.atguigu05.polymorphism.test1;

/**
 * ClassName:GeometricTest
 * Package:com.atguigu01.polymorphism.test1
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 13:10
 * @Version 1.0
 */
public class GeometricTest {
    public static void main(String[] args){
        GeometricTest test = new GeometricTest();
        Circle c1=new Circle(2.3,"red",1.0);
        Circle c2=new Circle(2.3,"red",1.0);
        //体现多态性
        test.displayGeometricObject(c1);
        test.displayGeometricObject(c2);
        if(test.equalsArea(c1,c2)) System.out.println("两图形面积相等");
        else System.out.println("两图形面积不相等");
    }
    /**
     *
     * */
    public boolean equalsArea(GeometricObject g1,GeometricObject g2){
        return (g1.findArea()==g2.findArea());
    }
    public void displayGeometricObject(GeometricObject g){
        System.out.println("几何图形的面积为："+g.findArea());
    }
}
