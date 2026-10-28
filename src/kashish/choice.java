package kashish;
import java.util.Scanner;
public class choice{

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        System.out.println("Which program do you want to run?");
        System.out.println("1. Tester");
        System.out.println("2. Odd Even");

        int choice = sc.nextInt();

        if (choice == 1) {
            Tester.main(args);
        }
        else if (choice == 2) {
            Even.main(args);
        }
        else {
            System.out.println("Invalid choice");
        }
    }
}
