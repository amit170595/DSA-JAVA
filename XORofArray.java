import java.util.Scanner;

public class XORofArray {
    static int xorOfArray(int arr[], int n) {
        int xor_arr = 0;
        for (int i = 0; i < n; i++) {
            xor_arr = xor_arr ^ arr[i];
        }
        return xor_arr;
    }

    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                System.out.println(xorOfArray(arr, n));
            }
        }
    }
}