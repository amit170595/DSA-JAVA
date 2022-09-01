import java.util.Scanner;

public class BankManager {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                long count = 0;
                long i;
                for (i = 2; i <= n;) {
                    if (n % i == 0) {
                        count = count + i;
                        n = n / i;
                    } else
                        i++;
                    if (n == 1)
                        break;
                }
                System.out.println(count);
            }
        }
    }
}
