import java.util.Scanner;

public class FindTheMissing {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n - 1];
                long total = ((long) n * (n + 1)) / 2;
                int sum = 0;
                for (int i = 0; i < n - 1; i++) {
                    a[i] = sc.nextInt();
                    sum = sum + a[i];
                }
                System.out.println(total - sum);
            }
        }
    }
}
