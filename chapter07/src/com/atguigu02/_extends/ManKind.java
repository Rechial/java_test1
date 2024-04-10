package com.atguigu02._extends;

/**
 * ClassName:ManKind
 * Package:com.atguigu01._extends
 * Description:
 *
 * @Author QF
 * Create 2023/12/21 17:40
 * @Version 1.0
 */
public class ManKind {
    int sex;
    int salary;
    public void manOrWoman(){
        if(sex==1) System.out.println("man");
        else System.out.println("woman");
    }
    public void employeed(){
        if(salary==0) System.out.println("no job");
        else System.out.println("has job");
    }
}
