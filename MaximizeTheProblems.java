import java.util.Scanner;

public class MaximizeTheProblems {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int k = sc.nextInt();
            int ans = 0;
            int t = 240 - k;
            for (int i = 1; i <= n; i++) {
                if (t > i * 5) {
                    ans++;
                }
                t -= 5 * (i);
            }
            System.out.println(ans);
        }
    }
}
