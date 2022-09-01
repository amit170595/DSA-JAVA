import java.util.Scanner;

public class ArrayZigzag {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int i;
            int a[] = new int[n];
            for (i = 0; i <= n - 1; i++) {
                a[i] = sc.nextInt();
            }
            int even = 0, odd = 0;
            int b[] = new int[n];
            for (i = 0; i <= n - 1; i++) {
                b[i] = a[i];
            }
            for (i = 0; i <= n - 1; i++) {
                if (i + 1 < n) {
                    if (i % 2 == 0) {
                        if (a[i] <= a[i + 1]) {
                            int diff = a[i + 1] - a[i];
                            even = even + (diff + 1);
                            a[i + 1] = a[i + 1] - (diff + 1);
                        }
                    } else {
                        if (a[i] >= a[i + 1]) {
                            int diff = a[i] - a[i + 1];
                            even = even + (diff + 1);
                            a[i] = a[i] - (diff + 1);
                        }
                    }
                }
            }
            for (i = 0; i <= n - 1; i++) {
                if (i + 1 < n) {
                    if (i % 2 == 0) {
                        if (b[i] >= b[i + 1]) {
                            int diff = b[i] - b[i + 1];
                            odd = odd + (diff + 1);
                            b[i] = b[i] - (diff + 1);
                        }
                    } else {
                        if (b[i] <= b[i + 1]) {
                            int diff = b[i + 1] - b[i];
                            odd = odd + (diff + 1);
                            b[i + 1] = b[i + 1] - (diff + 1);
                        }
                    }
                }
            }
            System.out.println(Math.min(even, odd));
        }
    }
}
