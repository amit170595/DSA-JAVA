import java.util.Scanner;

public class FactoriesRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int p = 2;
                String str = "1 ";
                Solve(n, p, str);
            }
        }
    }

    public static void Solve(int n, int p, String str) {
        if (n == 1)
            System.out.println(str);
        else {
            for (int i = p; i <= n; i++) {
                if (n % i == 0) {
                    Solve(n / i, i, str + i);
                }
            }
        }
    }
}
