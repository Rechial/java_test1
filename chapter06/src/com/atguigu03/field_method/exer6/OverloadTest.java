package com.atguigu03.field_method.exer6;

/**
 * ClassName:OverloadTest
 * Package:com.java.atguigu03.field_method.exer6
 * Description:
 *
 * @Author QF
 * Create 2023/12/18 15:10
 * @Version 1.0
 */
public class OverloadTest {
    public static void main(String[] args){
        OverloadTest test = new OverloadTest();
        String info=test.concat("-","hello","world");
        System.out.println(info);
        //可以直接后面写.sout
        System.out.println(test.concat("/", "hello"));
        System.out.println(test.concat("-"));
    }
    //n个字符串进行拼接，每一个字符串之间使用某字符进行分割，如果没有传入字符串，返回空字符串""
    public String concat(String operator,String ... strs){
        String res="";
        for(int i=0;i<strs.length;i++){
            if(i==0) res+=strs[i];
            else res+=(operator+strs[i]);
        }
        return res;
    }
}
