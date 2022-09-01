import java.util.Scanner;

public class MinAndMax {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int i, min, max;
                for (i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                min = a[0];
                max = a[0];
                for (i = 0; i < n; i++) {
                    if (a[i] < min) {
                        min = a[i];
                    }
                    if (a[i] > max) {
                        max = a[i];
                    }
                }
                System.out.println(min + " " + max);
            }
        }
    }
}
