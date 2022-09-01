import java.util.Scanner;

public class EnqueueAndDequeue {
    public static void main(String[] args) {
        try (Scanner myObj = new Scanner(System.in)) {
            int n = myObj.nextInt();
            int a[] = new int[n];
            for (int i = 0; i < n; ++i)
                a[i] = myObj.nextInt();
            for (int i = 0; i < n; ++i) {
                for (int j = 0; j <= i; ++j) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
            for (int i = n - 1; i >= 0; i--) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(a[j] + " ");
                }
                System.out.println();
            }
        }

    }
}
