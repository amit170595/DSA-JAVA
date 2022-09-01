import java.util.Scanner;

public class BinaryRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                a[0] = 0;
                Binary(a, 1, n);
                a[0] = 1;
                Binary(a, 1, n);
            }
        }
    }

    public static void Binary(int a[], int k, int n) {
        if (k == n) {
            for (int i = 0; i < n; i++) {
                System.out.print(a[i]);
            }
            System.out.println();
            return;
        }
        if (a[k - 1] == 0) {
            a[k] = 0;
            Binary(a, k + 1, n);
            a[k] = 1;
            Binary(a, k + 1, n);
        } else {
            a[k] = 0;
            Binary(a, k + 1, n);
        }
    }
}