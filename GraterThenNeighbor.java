import java.util.Scanner;

public class GraterThenNeighbor {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int i, count = 0;
                for (i = 0; i <= n - 1; i++) {
                    a[i] = sc.nextInt();
                }
                for (i = 0; i <= n - 1; i++) {
                    if (i == 0) {
                        if (a[i] > a[i + 1]) {
                            count = 1;
                            System.out.print(i + " ");
                        }
                    } else if (i == (n - 1)) {
                        if (a[i] > a[i - 1]) {
                            count = 1;
                            System.out.print(i + " ");
                        }
                    } else if (i >= 2 && i <= n - 2) {
                        if (a[i] > a[i - 1] && a[i] > a[i + 1]) {
                            count = 1;
                            System.out.print(i + " ");
                        }
                    }
                }
                if (count == 0) {
                    System.out.print(-1);
                }
                System.out.println();
            }
        }
    }
}
