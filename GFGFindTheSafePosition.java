import java.util.Scanner;

public class GFGFindTheSafePosition {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int result = SafePos(n, k);
                System.out.println(result);
            }
        }
    }

    // private static int SafePos(int n, int k) {
    // if(n==1)
    // return 1;
    // return(SafePos(n-1, k)+k-1)%n+1;
    // }

    private static int SafePos(int n, int k) {
        int ans = 1;
        for (int i = 2; i <= n; i++) {
            ans = (ans + k - 1) % i + 1;
        }
        return ans;
    }
}
