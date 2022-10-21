import java.util.Scanner;

public class MaximumSubArraySum1 {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int max_sum = Integer.MIN_VALUE;
                for (int i = 0; i < n; i++) {
                    int sum = 0;
                    for (int j = i; j < n; j++) {
                        sum += arr[j];
                        if (sum > max_sum)
                            max_sum = sum;
                    }
                }
                System.out.println(max_sum);
            }
        }
    }
}
