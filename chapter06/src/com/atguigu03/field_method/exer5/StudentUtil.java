package com.atguigu03.field_method.exer5;

/**
 * ClassName:StudentUtil
 * Package:com.java.atguigu03.field_method.exer5
 * Description:
 *
 * @Author QF
 * Create 2023/12/18 12:03
 * @Version 1.0
 */
public class StudentUtil {
    public void printStudentsWithState(Student[] students, int state) {
        for (int i = 0; i < students.length; i++) {
            if (students[i].state == state) {
                Student stu = students[i];
                System.out.println(stu.show());
            }
        }
    }
/**
 * 打印学生信息
 * */
    public void printStudents(Student[] students) {
        for (int i = 0; i < students.length; i++) {
            System.out.println(students[i].show());
        }
    }
    public void sortStudents(Student[] students){
        for(int i=0;i<students.length;i++){
            for(int j=0;j<students.length-i-1;j++){
                if(students[j].score>students[j+1].score){
//                    Student tmp=students[j];
//                    students[j]=students[j+1];
//                    students[j+1]=tmp;
                    sort(students,j,j+1);
                }
            }
        }
    }
    public void sort(Student[] students,int i,int j){
        Student tmp=students[i];
        students[i]=students[j];
        students[j]=tmp;
    }
}
