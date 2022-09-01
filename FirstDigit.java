import java.util.Scanner;

public class FirstDigit {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            int rem = 0;
            while (t-- > 0) {
                int n = sc.nextInt();
                while (n > 0) {
                    rem = n % 10;
                    n = n / 10;
                }
                System.out.println(rem);
            }
        }
    }
}
