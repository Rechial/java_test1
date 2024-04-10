package com.atguigu._interface.exer05;

/**
 * ClassName:ElectricVehicle
 * Package:com.atguigu._interface.exer05
 * Description:
 *
 * @Author QF
 * Create 2024/1/3 13:50
 * @Version 1.0
 */
public class ElectricVehicle extends Vehicle implements IPower{
    public ElectricVehicle() {
    }

    public ElectricVehicle(String brand, String color) {
        super(brand, color);
    }

    public void run(){
        System.out.println("电动车通过电机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("电动车使用电力提供动力");
    }
}
