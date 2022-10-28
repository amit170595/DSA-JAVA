import java.util.Scanner;

public class RotateAndFind {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long arr[] = new long[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextLong();
                long k = sc.nextLong();
                int ans = -1;
                for (int i = 0; i < n; i++) {
                    if (arr[i] == k) {
                        ans = i;
                    }
                }
                System.out.println(ans);
            }
        }
    }
}
