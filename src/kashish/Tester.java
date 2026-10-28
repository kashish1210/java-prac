package kashish;
import java.util.Scanner;
class one{
	public static void mt1() {
		System.out.println("Hii from class 1");
	}
}
class two{
	public static void mt2() {
		System.out.println("Hii from second class");
	} 
}

public class Tester {
	public static void main(String[] args){
		Scanner scanner=new Scanner(System.in);
		int choice=scanner.nextInt();
		if(choice==1) {
			one.mt1();
		}
		else if(choice==2) {
			two.mt2();
			
		}
		else{
			Tester.main(args);
		}
	}
}

		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
		
	
