import java.util.Scanner;

public class FindMaximum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int a[] = new int[n];
            int i;
            for (i = 0; i <= n - 1; i++) {
                a[i] = sc.nextInt();
            }
            int maxDiff = -1;
            int j;

            for (i = 0; i < n; ++i) {
                for (j = n - 1; j > i; --j) {
                    if (a[j] > a[i] && maxDiff < (j - i))
                        maxDiff = j - i;
                }
            }

            System.out.println(maxDiff);
        }
    }

    public int maxIndexDiff(int[] a, int n) {
        return 0;
    }
}
