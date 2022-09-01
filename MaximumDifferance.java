import java.util.Scanner;

public class MaximumDifferance {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int i, max, min;
                for (i = 0; i <= n - 1; i++) {
                    a[i] = sc.nextInt();
                }
                int b[] = new int[n];
                int c[] = new int[n];
                for (i = 0; i <= n - 1; i++) {
                    b[i] = a[i] + i;
                    c[i] = a[i] - i;
                }
                max = b[0];
                min = b[0];
                for (i = 0; i < n; i++) {
                    if (b[i] > max)
                        max = b[i];
                    if (b[i] < min)
                        min = b[i];
                }
                int ans1 = (max - min);
                max = c[0];
                min = c[0];
                for (i = 0; i < n; i++) {
                    if (c[i] > max)
                        max = c[i];
                    if (c[i] < min)
                        min = c[i];
                }
                int ans2 = (max - min);
                System.out.println(Math.max(ans1, ans2));
            }
        }
    }
}
