package com.atguigu._interface.exer05;

/**
 * ClassName:VehicleTest
 * Package:com.atguigu._interface.exer05
 * Description:
 *
 * @Author QF
 * Create 2024/1/3 14:00
 * @Version 1.0
 */
public class VehicleTest {
    public static void main(String[] args) {
        Developer developer=new Developer();
        //抽象类不能实例化，这里只是定义数组
        Vehicle[] vehicles=new Vehicle[3];
        vehicles[0]=new Bicycle("捷安特","蓝色");
        vehicles[1]=new ElectricVehicle("雅迪","紫色");
        vehicles[2]=new Car("奔驰","黑色","陕A123456");
        for(int i=0;i<vehicles.length;i++) {
            developer.takingVehicle(vehicles[i]);
            //判断是否属于该类型 强制类型转换
            if(vehicles[i] instanceof IPower){
                ((IPower)vehicles[i]).power();
            }
        }
    }
}
