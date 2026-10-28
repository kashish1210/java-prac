package kashish;

import java.util.Scanner;

public class ScopeTest {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter value");
		int a=scanner.nextInt();
		if(a>10) {
			System.out.println("a is greater than 10");
		}
		else {
			System.out.println("a is less than 10");
		}
	}

}
