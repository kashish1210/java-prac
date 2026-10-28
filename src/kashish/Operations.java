package kashish;
import java.util.Scanner;
class Calculation{
	public void calculator(int a,int b) {
		System.out.println("Addition:"+(a+b));
		System.out.println("Subtraction:"+(a-b));
		System.out.println("Multiplication:"+(a*b));
		System.out.println("Division:"+(a/b));
	}
	
}

public class Operations {
	public static void main(String[] args) {
		Calculation calc=new Calculation();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter the value of a:");
		int a=sc.nextInt();
		System.out.println("Enter the value of b:");
		int b=sc.nextInt();
		calc.calculator(a, b);
		sc.close();
		}

}
