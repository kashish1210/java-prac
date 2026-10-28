package kashish;
import java.util.Scanner;
class Num{
	public void num(int n) {
		System.out.println("Number entered by the user:"+n);
		}
	}
public class Pro3 {
	public static void main(String[] args) {
		Num no=new Num();
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number:");
		int a=sc.nextInt();
		no.num(a);
		sc.close();
	}
}
