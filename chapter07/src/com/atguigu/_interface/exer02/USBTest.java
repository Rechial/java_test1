package com.atguigu._interface.exer02;

/**
 * ClassName:USBTest
 * Package:com.atguigu._interface.exer02
 * Description:
 *
 * @Author QF
 * Create 2024/1/2 15:17
 * @Version 1.0
 */
public class USBTest {
    public static void main(String[] args) {
        Computer computer=new Computer();
        //1 创建接口实现类的对象
        Printer printer=new Printer();
        computer.transferData(printer);
        //2 创建接口实现类的匿名对象
        computer.transferData(new Camera());
        //3 创建接口匿名实现类的对象
        USB usb1=new USB() {
            @Override
            public void start() {
                System.out.println("U盘开始工作");
            }

            @Override
            public void stop() {
                System.out.println("U盘结束工作");
            }
        };
        computer.transferData(usb1);
        //4 创建接口匿名实现类的匿名对象
        computer.transferData(new USB() {
            @Override
            public void start() {
                System.out.println("扫描仪开始工作");
            }

            @Override
            public void stop() {
                System.out.println("扫描仪结束工作");
            }
        });
    }
}
class Computer{
    public void transferData(USB usb){
        System.out.println("设备连接成功...");
        usb.start();
        System.out.println("数据传输细节操作...");
        usb.stop();
    }
}

class Camera implements USB{
    @Override
    public void start() {
        System.out.println("照相机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("照相机结束工作");
    }
}

class Printer implements USB{
    @Override
    public void start() {
        System.out.println("打印机开始工作");
    }

    @Override
    public void stop() {
        System.out.println("打印机结束工作");
    }
}
interface USB{
    public abstract void start();
    void stop();
}
