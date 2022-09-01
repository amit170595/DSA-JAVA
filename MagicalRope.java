import java.util.Scanner;

public class MagicalRope {
    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            long N = sc.nextLong();
            long X = sc.nextLong();
            long K = sc.nextLong();
            long height[] = new long[(int) N];
            long rate[] = new long[(int) N];
            for (int i = 0; i < N; i++)
                height[i] = sc.nextLong();
            for (int i = 0; i < N; i++)
                rate[i] = sc.nextLong();
            long low = 0;
            long high = 1000000000000000000L;
            long min_days = 0;
            while (low <= high) {
                long mid = (low + high) / 2;
                long sum = 0, flag = 0;
                for (int i = 0; i < N; i++) {
                    if (K <= (mid * rate[i] + height[i])) {
                        sum += (mid * rate[i] + height[i]);
                        if (sum >= X) {
                            flag = 1;
                            break;
                        }
                    }
                }
                if (flag == 1) {
                    min_days = mid;
                    high = mid - 1;
                } else
                    low = mid + 1;
            }
            System.out.print(min_days);
        }
    }
}
