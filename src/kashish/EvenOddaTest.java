package kashish;
import java.util.Scanner;
class Impl{
	public String logictoReturn(int num) {
		if(num%2==0) {
			return "Even";
		}
		else {
			return "Odd";
		}
		
	}
}

public class EvenOddaTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter your number:");
		int a=scanner.nextInt();
		Impl i=new Impl();
		System.out.println(i.logictoReturn(a));
		scanner.close();
		}

}
