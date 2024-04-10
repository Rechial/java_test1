package com.atguigu05.polymorphism.test2;

/**
 * ClassName:AnimalTest
 * Package:com.atguigu01.polymorphism.test2
 * Description:
 *
 * @Author QF
 * Create 2023/12/22 13:58
 * @Version 1.0
 */
public class AnimalTest {
    public static void main(String[] args) {
        AnimalTest test=new AnimalTest();
        test.adopt(new Dog());
        test.adopt(new Cat());
    }
    public void adopt(Animal animal){
        if(animal instanceof Dog){
            Dog dog = (Dog)animal;
            System.out.println("汪汪汪");
        }
        else if(animal instanceof Cat){
            Cat cat=(Cat)animal;
            System.out.println("喵喵喵");
        }
    }
}
