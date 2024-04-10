package com.atguigu08.singleton;

/**
 * ClassName:GirlFrend
 * Package:com.atguigu08.singleton
 * Description:
 *
 * @Author QF
 * Create 2024/1/5 22:39
 * @Version 1.0
 */
public class GirlFrendTest {
    public static void main(String[] args) {
        GirlFriend girl1=GirlFriend.getInstance();
        GirlFriend girl2=GirlFriend.getInstance();
        System.out.println(girl1==girl2);
    }
}

class GirlFriend{
    private GirlFriend(){

    }
    private static GirlFriend instance=null;
    public static GirlFriend getInstance(){
        if(instance==null){
            instance=new GirlFriend();
            return instance;
        }else{
            return instance;
        }
    }
}
