import java.util.Scanner;

public class SolutionOfEquation {

    static int nCr(int n, int r) {
        int fac[] = new int[100];
        for (int i = 0; i < n; i++)
            fac[i] = 1;
        for (int i = 1; i < n + 1; i++) {
            fac[i] = fac[i - 1] * i;
        }
        int ans = fac[n] / (fac[n - r] * fac[r]);
        return ans;
    }

    // Driver Code
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int k = sc.nextInt();
                int ans = nCr(n + k - 1, k);
                System.out.println(ans);
            }
        }
    }
}
