import java.util.Scanner;

public class SumSubset {
    static void subsetSums(int arr[], int n) {
        int total = 1 << n;
        int x = 0;
        int sum = 0;
        for (int i = 0; i < total; i++) {
            for (int j = 0; j < n; j++)
                if ((i & (1 << j)) != 0)
                    sum += arr[j];
        }
        x = x + sum;
        System.out.println(x);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                subsetSums(arr, n);
            }
        }
    }
}
