import java.util.Scanner;

public class Pettern5Recursion {
    public static void PrintNum(int n) {
        System.out.print(n + " ");
        if (n <= 0)
            return;
        PrintNum(n - 5);
        System.out.print(n + " ");
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                PrintNum(n);
                System.out.println();
            }
        }
    }
}
