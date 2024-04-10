package com.atguigu04_throw;

/**
 * ClassName:ThrowTest
 * Package:com.atguigu04_throw
 * Description:
 *
 * @Author QF
 * Create 2024/4/8 20:37
 * @Version 1.0
 */
public class ThrowTest {
    public static void main(String[] args) {
        Student s1 = new Student();
        try {
            s1.regist(10);
            s1.regist(-10);
            System.out.println(s1);
        }catch(Exception e){
            e.printStackTrace();
        }
    }
}

class Student{
    int id;
//    public void regist(int id){
//        if(id > 0){
//            this.id = id;
//        }else{
//            throw new RuntimeException("输入的id非法");
//        }
//    }

    public void regist(int id) throws Exception{
        if(id > 0){
            this.id = id;
        }else{
            throw new BelowZeroException("输入的id非法");
        }
    }
}