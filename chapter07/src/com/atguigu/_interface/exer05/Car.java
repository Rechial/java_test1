package com.atguigu._interface.exer05;

/**
 * ClassName:Car
 * Package:com.atguigu._interface.exer05
 * Description:
 *
 * @Author QF
 * Create 2024/1/3 13:52
 * @Version 1.0
 */
public class Car extends Vehicle implements IPower{
    private String carNumber;
    public Car() {
    }

    public Car(String brand, String color, String carNumber) {
        super(brand, color);
        this.carNumber = carNumber;
    }

    public String getCarNumber() {
        return carNumber;
    }

    public void setCarNumber(String carNumber) {
        this.carNumber = carNumber;
    }

    public void run(){
        System.out.println("汽车通过发动机驱动行驶");
    }

    @Override
    public void power() {
        System.out.println("汽车使用燃油提供动力");
    }
}
