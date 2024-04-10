package com.atguigu03.field_method.exer5;

/**
 * ClassName:StudentTest
 * Package:com.java.atguigu03.field_method.exer5
 * Description:
 *
 * @Author QF
 * Create 2023/12/17 17:26
 * @Version 1.0
 */
public class StudentTest {
    public static void main(String[] args){
        Student[] students=new Student[20];
        for(int i=0;i<20;i++){
            //数组中的每个元素都是Student类型
            students[i]=new Student();
            students[i].number=i+1;
            //产生随机数
            students[i].score=(int)(Math.random()*101);
            students[i].state=(int)(Math.random()*6+1);
        }
        //打印出3年级的学生信息
//        for(int i=0;i<20;i++){
//            if(students[i].state==3){
//                System.out.println("学生编号:"+students[i].number+
//                        " 学生年级:"+students[i].state+" 学生成绩:"+students[i].score);
//                System.out.println(students[i].show());
//            }
//        }
        StudentUtil util=new StudentUtil();
        util.printStudentsWithState(students,3);
        System.out.println("*************************");
        //使用冒泡排序按学生成绩排序，并遍历所有学生信息 冒泡排序
        util.printStudents(students);
        System.out.println("*************************");
        util.sortStudents(students);
        util.printStudents(students);
//        for(int i=0;i<students.length;i++){
//            for(int j=0;j<students.length-1-i;j++){
//                if(students[j].score>students[j+1].score){
//                    Student tmp=students[j];
//                    students[j]=students[j+1];
//                    students[j+1]=tmp;
//                }
//            }
//        }
//        for(int i=0;i<students.length;i++) System.out.println(students[i].show());
    }
}
