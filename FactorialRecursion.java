import java.util.Scanner;

public class FactorialRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                System.out.println(Fact(n));
            }
        }
    }

    public static int Fact(int n) {
        if (n == 1) {
            return 1;
        }
        return n * Fact(n - 1);
    }
}
