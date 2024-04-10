package com.atguigu03._super;

/**
 * ClassName:KidsTest
 * Package:com.atguigu01._extends
 * Description:
 *
 * @Author QF
 * Create 2023/12/21 17:41
 * @Version 1.0
 */
public class KidsTest {
    public static void main(String[] args){
        Kids someKid=new Kids();
        someKid.sex=0;
        someKid.manOrWoman();
        someKid.salary=0;
        someKid.employeed();
        someKid.setYearsOld(15);
        someKid.printAge();
    }
}
