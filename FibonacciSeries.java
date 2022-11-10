import java.util.Scanner;

public class FibonacciSeries {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a = 0, b = 1, c;
                if (n == 0)
                    System.out.println(a);
                for (int i = 2; i <= n; i++) {
                    c = a + b;
                    a = b;
                    b = c;
                }
                System.out.println(b);
            }
        }
    }
}
