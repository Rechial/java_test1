package com.atguigu03._super;

/**
 * ClassName:Kids
 * Package:com.atguigu01._extends
 * Description:
 *
 * @Author QF
 * Create 2023/12/21 17:41
 * @Version 1.0
 */
public class Kids extends ManKind {
    private int yearsOld;
    public void setYearsOld(int yearsOld){
        this.yearsOld=yearsOld;
    }
    public void printAge(){
        System.out.println("I am "+yearsOld+" years old.");
    }
    public void employeed(){
        super.employeed();
        System.out.println("Kids should study and no job.");
    }
}
