import java.util.Scanner;

public class ScalerMultiplecation {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int k = sc.nextInt();
        int a[][] = new int[m][n];
        int i, j;
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                a[i][j] = sc.nextInt();
            }
        }
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                a[i][j] = a[i][j] * k;
            }
        }
        for (i = 0; i <= m - 1; i++) {
            for (j = 0; j <= n - 1; j++) {
                System.out.print(a[i][j] + " ");
            }
            System.out.println();
        }
    }
}
