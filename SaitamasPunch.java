import java.util.Scanner;

public class SaitamasPunch {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int a[] = new int[n];
                int i;
                for (i = 0; i <= n - 1; i++) {
                    a[i] = sc.nextInt();
                }
                long paralyze_till = a[0] + k;
                long total_time = 0;
                for (i = 1; i < n; i++) {
                    if (paralyze_till <= a[i]) {
                        total_time = total_time + k;
                        paralyze_till = a[i] + k;
                    } else {
                        total_time = total_time + (Math.abs(a[i] - a[i - 1]));
                        paralyze_till = a[i] + k;
                    }
                }
                System.out.println((total_time + k));
            }
        }
    }
}
