import java.util.Scanner;

public class CombinationRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++) {
                arr[i] = sc.nextInt();
            }
            int k = sc.nextInt();
            Combination(arr, "", 0, n, k);
        }
    }

    public static void Combination(int A[], String out, int i, int n, int k) {
        if (k == 0) {
            System.out.println(out);
        }
        for (int j = i; j < n; j++) {
            Combination(A, out + (A[j]) + " ", j + 1, n, k - 1);
        }
    }
}
