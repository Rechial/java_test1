import java.util.Scanner;
class ScannerTest{
	public static void main(String[] args){
	Scanner scan=new Scanner(System.in);
	System.out.print("请输入你的网名：");
	String name=scan.next();
	System.out.println("name="+name);
	}
}