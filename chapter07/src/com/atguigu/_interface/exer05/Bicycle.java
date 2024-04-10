package com.atguigu._interface.exer05;

/**
 * ClassName:Bicycle
 * Package:com.atguigu._interface.exer05
 * Description:
 *
 * @Author QF
 * Create 2024/1/3 13:48
 * @Version 1.0
 */
public class Bicycle extends Vehicle{
    public Bicycle() {
    }

    public Bicycle(String brand, String color) {
        super(brand, color);
    }

    public void run(){
        System.out.println("自行车通过人力脚蹬行驶");
    }
}
