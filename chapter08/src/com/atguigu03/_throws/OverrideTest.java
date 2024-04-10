package com.atguigu03._throws;

import java.io.FileNotFoundException;
import java.io.IOException;

/**
 * ClassName:OverrideTest
 * Package:com.atguigu03._throws
 * Description:
 *
 * @Author QF
 * Create 2024/4/8 11:54
 * @Version 1.0
 */
public class OverrideTest {
    public static void main(String[] args){
        Father f = new Son();
        try {
            f.method1();
        }catch (IOException e){
            e.printStackTrace();
        }
        //利用多态来解释
        Number n = f.method2();
    }

}

class Father{
    public void method1() throws IOException {

    }

    public Number method2(){
        return null;
    }
}

class Son extends Father{
    public void method1() throws FileNotFoundException {

    }

    public Integer method2(){
        return null;
    }
}