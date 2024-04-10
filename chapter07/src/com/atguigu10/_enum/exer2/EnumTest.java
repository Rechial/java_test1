package com.atguigu10._enum.exer2;

/**
 * ClassName:EnumTest
 * Package:com.atguigu10._enum.exer2
 * Description:
 *
 * @Author QF
 * Create 2024/1/4 15:28
 * @Version 1.0
 */
public class EnumTest {
    public static void main(String[] args) {
        System.out.println(Season1.SPRING.getClass());
        System.out.println(Season1.SPRING.getClass().getSuperclass());
        System.out.println(Season1.SPRING.getClass().getSuperclass().getSuperclass());
    }
}

enum Season1{
    //1.必须在枚举类开头声明多个变量，变量之间使用","隔开
    SPRING("春天","春意盎然"),
    SUMMER("夏天","夏日炎炎"),
    AUTUMN("秋天","春华秋实"),
    WINTER("冬天","白雪皑皑");

    //2.声明当前类的对象的实例变量，需要使用private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //3.私有化类的构造器
    private Season1(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    //4.提供实例变量的get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }

//    @Override
//    public String toString() {
//        return "Season{" +
//                "seasonName='" + seasonName + '\'' +
//                ", seasonDesc='" + seasonDesc + '\'' +
//                '}';
//    }
}
