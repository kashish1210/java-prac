package kashish;
import java.util.Scanner;
class Per{
	public void display(String name,int age) {
		System.out.println("Name entered by the user:"+name);
		System.out.println("Age entered by the user:"+age);

	}
}

public class Data {
	public static void main(String[] args) {
		Per pr=new Per();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the name:");
		String name=sc.nextLine();
		System.out.println("Enter the age:");
		int age=sc.nextInt();
		pr.display(name,age);
		sc.close();
	}

}
