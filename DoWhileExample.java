
import java.util.Scanner;

public class DoWhileExample {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char ch;
            int operationNumber;
            do {
                System.out.println("List of operation do you want?\n1. Addition\n2. Substruction");
                System.out.println("Enter the operation number?");
                operationNumber = sc.nextInt();
                switch (operationNumber) {
                    case 1:
                        int a, b;
                        System.out.println("Enter two number for addition ?");
                        a = sc.nextInt();
                        b = sc.nextInt();
                        System.out.println("Addition is: " + (a + b));
                        break;
                    case 2:
                        int x, y;
                        System.out.println("Enter two number for substruction ?");
                        x = sc.nextInt();
                        y = sc.nextInt();
                        System.out.println("Substruction is: " + (x - y));
                        break;
                    default:
                        System.out.println("invalid operation number");
                }
                System.out.println("Do you want opration again? (Y/N) :");
                ch = sc.next().charAt(0);
            } while (ch == 'Y');
        }

    }
}
