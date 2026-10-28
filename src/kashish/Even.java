package kashish;
import java.util.Scanner;

public class Even {
	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		int num=sc.nextInt();		if(num==0){
			System.out.println("Neither even nor odd");
		}
		else if(num%2==0) {
			System.out.println("Number is even");
		}
		else if(num%2!=0) {
			System.out.println("Number is odd");
		}else {
			System.out.println("Invalid choice");
		}
				}

}
