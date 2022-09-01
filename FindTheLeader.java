import java.util.Scanner;

public class FindTheLeader {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int i;
                for (i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                int max = a[n - 1];
                for (i = (n - 1); i >= 0; i--) {
                    if (i == (n - 1)) {
                        System.out.print(a[i] + " ");
                        continue;
                    }
                    if (a[i] > a[i + 1] && max <= a[i]) {
                        max = a[i];
                        System.out.print(a[i] + " ");
                    }
                }
                System.out.println();
            }
        }
    }
}
