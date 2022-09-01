
import java.util.Scanner;

public class PerfectNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int sum = 0;
                for (int i = 1; i <= n / 2; i++) {
                    if (n % i == 0)
                        sum += i;
                }
                if (sum == n)
                    System.out.println("true");
                else
                    System.out.println("false");
            }
        }
    }
}
