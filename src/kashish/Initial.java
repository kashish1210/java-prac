package kashish;
import java.util.Scanner;

class Info{
	public int age(int a) {
		return a;
		
	}
	public String nam(String name) {
			return name;
	}
	public float fees(float fees) {
		return fees;
	}
	public String initial(String first) {
		return first;
	}
}

public class Initial {
	public static void main(String[] args) {
		Info info=new Info();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter the age:");
		int age=scanner.nextInt();
		info.age(age);
		System.out.println("Enter the name:");
		String nme=scanner.next();
		info.name(nme);
		System.out.println("Enter the fees:");
		float amt=scanner.nextFloat();
		info.fees(amt);
		System.out.println("Enter the initial:");
		String init=scanner.next();
		info.initial(init);
		
		
		
	}

}
