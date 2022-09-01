import java.util.Scanner;

public class TriangularMatrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i < j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                if (i > j) {
                    System.out.print(0 + " ");
                } else {
                    System.out.print(a[i][j] + " ");
                }
                System.out.println();
            }
        }
    }
}
