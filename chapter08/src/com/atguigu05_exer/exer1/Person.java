package com.atguigu05_exer.exer1;

/**
 * ClassName:Person
 * Package:com.atguigu05_exer.exer1
 * Description:
 *
 * @Author QF
 * Create 2024/4/9 15:37
 * @Version 1.0
 */
public class Person {
    private String name;
    private int lifeValue;

    public Person(){}

    public Person(String name,int lifeValue){
        this.name = name;
        setLifeValue(lifeValue);
    }

    public String getName() {
        return name;
    }

    public int getLifeValue() {
        return lifeValue;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setLifeValue(int lifeValue) {
        if (lifeValue < 0){
            throw new NotLifeValueException("生命值不能为负数："+lifeValue);
        }
        this.lifeValue = lifeValue;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", lifeValue=" + lifeValue +
                '}';
    }
}
