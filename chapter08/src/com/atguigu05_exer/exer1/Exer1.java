package com.atguigu05_exer.exer1;

/**
 * ClassName:Exer1
 * Package:com.atguigu05_exer.exer1
 * Description:
 *
 * @Author QF
 * Create 2024/4/9 15:45
 * @Version 1.0
 */
public class Exer1 {
    public static void main(String[] args) {
//        Person p1 = new Person("yuan",100);
        try {
            Person p1 = new Person("yuan",-100);
            System.out.println(p1);
        }catch(NotLifeValueException e){
            e.printStackTrace();
        }

        Person p2 = new Person();
        p2.setName("shen");
        p2.setLifeValue(-3);
//        p2.setLifeValue(50);
    }
}
