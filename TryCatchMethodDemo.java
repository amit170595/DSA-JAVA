import java.util.Scanner;

public class TryCatchMethodDemo {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            try {
                int n = sc.nextInt();
                int c[] = { 1, 2, 3, 4 };
                System.out.println(25 / n);
                System.out.println(c[n]);
            } catch (ArithmeticException e) {
                System.out.println("Arithmatic Error");
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Array Bound Error");
            }
        }
        System.out.println("Program End");
    }
}
