import java.util.Scanner;

public class FebonacciSeriesRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                System.out.println(Febonacci(n));
            }
        }
    }

    public static int Febonacci(int n) {
        if (n <= 1) {
            return n;
        }
        return (Febonacci(n - 1) + Febonacci(n - 2));
    }
}
