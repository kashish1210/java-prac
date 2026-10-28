package kashish;
import java.util.Scanner;
class One{
	public void add(int a) {
		int b=10;
		System.out.println(a+b);
	}
	public void sub(float d) {
		
		int b=10;
		System.out.println(d-b);
	}
}
class Two{
	public void con(char x) {
		System.out.println(x);
	}
	public void div(float c) {
		int b=10;
		System.out.println(c/b);	}
}
public class method {
	public static void main(String[] args) {
		int a;
		float d;
		char ch;
		float c;
		One one=new One();
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your choice(1-2) :");
		int ch=scanner.nextInt();
		if(ch==1) {
			System.out.println("Enter the value of a and d:");
			int a=scanner.nextInt();
			float d=scanner.nextFloat();
			one.add(a);
			one.sub(d);
		}else if(ch==2) {
			Two two=new Two();
			Scanner scanner=new Scanner(System.in);
			System.out.println("Enter the character:");
			char ch=scanner.
			}
	}
	

}
