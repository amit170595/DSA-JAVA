import java.util.Arrays;
import java.util.Scanner;

public class MaximumChocolate {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                long arr[] = new long[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextLong();
                Arrays.sort(arr);
                int sum1 = 0;
                int sum2 = 0;
                for (int i = 0; i < n; i++) {
                    if (i % 2 != 0) {
                        sum1 += arr[i];
                    } else {
                        sum2 += arr[i];
                    }
                }
                if (sum1 > sum2) {
                    System.out.println(sum1);
                } else {
                    System.out.println(sum2);
                }
            }
        }
    }
}
