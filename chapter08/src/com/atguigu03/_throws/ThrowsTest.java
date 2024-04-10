package com.atguigu03._throws;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName:ThrowsTest
 * Package:com.atguigu03._throws
 * Description:
 *
 * @Author QF
 * Create 2024/4/8 11:37
 * @Version 1.0
 */
public class ThrowsTest{
    public void method2() throws FileNotFoundException, IOException{
        method1();
    }
    public void method1() throws FileNotFoundException, IOException {
        File file = new File("D:\\ideaPractice\\hello.txt");
        FileInputStream fis = new FileInputStream(file);//可能报FileNotFoundException
        int data = fis.read();//可能报IOException
        while (data != -1){
            System.out.print((char)data);
            data = fis.read();//可能报IOException
        }
        fis.close();
    }
}
