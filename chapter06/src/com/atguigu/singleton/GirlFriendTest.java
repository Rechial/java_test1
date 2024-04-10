package com.atguigu.singleton;

/**
 * ClassName:GirlFriendTest
 * Package:com.atguigu.singleton
 * Description:
 *
 * @Author QF
 * Create 2023/12/26 20:21
 * @Version 1.0
 */
//懒汉式
public class GirlFriendTest {
    public static void main(String[] args) {
        GirlFriend.getInstance();
    }
}
class GirlFriend{
    private GirlFriend(){

    }
    private static GirlFriend instance = null;
    public static GirlFriend getInstance(){
        if(instance==null){
            instance = new GirlFriend();
        }
        return instance;
    }
}
