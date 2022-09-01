import java.util.Scanner;

public class SumOfDigitRecursion {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                System.out.println(SumDig(n));
            }
        }
    }

    public static int SumDig(int n) {
        if (n == 0) {
            return 0;
        }
        return (n % 10 + SumDig(n / 10));
    }
}
