import java.util.Scanner;

public class OperationOnMtrix {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int m = sc.nextInt();
        int n = sc.nextInt();
        int a[][] = new int[m][n];
        int b[][] = new int[m][n];
        int add[][] = new int[m][n];
        int pro[][] = new int[m][n];
        int i, j;
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                a[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                b[i][j] = sc.nextInt();
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                add[i][j] = a[i][j] + b[i][j];
                System.out.print(add[i][j] + " ");
            }
            System.out.println();
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                pro[i][j] = 0;
                for (int k = 0; k < n; k++) {
                    pro[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        for (i = 0; i < m; i++) {
            for (j = 0; j < n; j++) {
                System.out.print(pro[i][j] + " ");
            }
            System.out.println();
        }

    }
}