import java.util.Arrays;
import java.util.Scanner;

public class GFGFittingTheArrays {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int[] arr = new int[n];
                int brr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                for (int i = 0; i < n; i++)
                    brr[i] = sc.nextInt();
                if (FitArray(arr, brr, n))
                    System.out.println("YES");
                else
                    System.out.println("NO");
            }
        }
    }

    private static boolean FitArray(int[] arr, int[] brr, int n) {
        Arrays.sort(arr);
        Arrays.sort(brr);
        for (int i = 0; i < n; i++) {
            if (arr[i] > brr[i]) {
                return false;
            }
        }
        return true;
    }
}
