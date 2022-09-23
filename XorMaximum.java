import java.util.Scanner;

public class XorMaximum {
    static int max_xor(int arr[], int n) {
        int maxXor = 0;
        for (int i = 0; i < n; i++) {
            for (int j = i + 1; j < n; j++) {
                maxXor = Math.max(maxXor, arr[i] ^ arr[j]);
            }
        }
        return maxXor;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(max_xor(arr, n));
            }
        }
    }
}