import java.util.Scanner;

public class SquareRoot {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                System.out.println(FindSquareRoot(n));
            }
        }
    }

    private static long FindSquareRoot(long n) {
        if (n == 0 || n == 1)
            return n;
        long start = 1;
        long end = n / 2;
        long ans = 0;
        while (start <= end) {
            long mid = (start + end) / 2;
            if (mid * mid == n)
                return mid;
            if (mid * mid < n) {
                ans = mid;
                start = mid + 1;
            } else
                end = mid - 1;
        }
        return ans;
    }
}
