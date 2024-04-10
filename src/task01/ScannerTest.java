package task01;
import java.util.Scanner;
/**
 * ClassName:ScannerTest
 * Package:task01
 * Description:
 *
 * @Author QF
 * Create 2023/12/13 14:54
 * @Version 1.0
 */
public class ScannerTest {
    public static void main(String[] args){
        Scanner scan=new Scanner(System.in);
        System.out.print("请输入你的网名：");
        String name=scan.next();
        System.out.println("name="+name);
    }
}
