package com.atguigu10._enum.exer1;

/**
 * ClassName:SeasonTest
 * Package:com.atguigu10._enum.exer1
 * Description:
 *
 * @Author QF
 * Create 2024/1/4 14:50
 * @Version 1.0
 */
public class SeasonTest {
    public static void main(String[] args) {
        System.out.println(Season.AUTUMN.toString());
    }
}

//JDK5.0之前定义枚举类的方式
//单例模式
class Season{
    //2.声明当前类的对象的实例变量，需要使用private final修饰
    private final String seasonName;
    private final String seasonDesc;
    //1.私有化类的构造器
    private Season(String seasonName,String seasonDesc){
        this.seasonName=seasonName;
        this.seasonDesc=seasonDesc;
    }
    //3.提供实例变量的get方法
    public String getSeasonName() {
        return seasonName;
    }

    public String getSeasonDesc() {
        return seasonDesc;
    }
    //4.创建当前类的实例，需要使用public static final修饰
    public static final Season SPRING=new Season("春天","春意盎然");
    public static final Season SUMMER=new Season("夏天","夏日炎炎");
    public static final Season AUTUMN=new Season("秋天","春华秋实");
    public static final Season WINTER=new Season("冬天","白雪皑皑");

    @Override
    public String toString() {
        return "Season{" +
                "seasonName='" + seasonName + '\'' +
                ", seasonDesc='" + seasonDesc + '\'' +
                '}';
    }
}