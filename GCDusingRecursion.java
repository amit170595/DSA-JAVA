import java.util.Scanner;

public class GCDusingRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int p = sc.nextInt();
                System.out.println(GCD(n, p));
            }
        }
    }

    public static int GCD(int a, int b) {
        if (a == 0 || b == 0)
            return 0;
        else if (a == b)
            return a;
        else if (a > b)
            return GCD(a - b, b);
        else
            return GCD(a, b - a);
    }
}
