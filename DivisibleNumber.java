import java.util.Scanner;

public class DivisibleNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long a = sc.nextLong();
                long b = sc.nextLong();
                long k = sc.nextLong();
                long low = 0;
                long high = Long.MAX_VALUE;
                long lcm = (a * b / gcd(a, b));
                long ans = 0;
                while (low < high) {
                    long mid = (low + high) / 2;
                    ans = (mid / a) + (mid / b) - (mid / lcm);
                    if (ans < k)
                        low = mid + 1;
                    else
                        high = mid;
                }
                System.out.println(low);
            }
        }
    }

    private static long gcd(long a, long b) {
        if (b == 0)
            return a;
        return gcd(b, a % b);
    }
}
