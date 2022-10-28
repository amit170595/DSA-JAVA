import java.util.Arrays;
import java.util.Scanner;

public class NumberOfChocolates {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int arr[] = new int[n];
            for (int i = 0; i < n; i++)
                arr[i] = sc.nextInt();
            Arrays.sort(arr);
            int q = sc.nextInt();
            while (q-- > 0) {
                int a = sc.nextInt();
                int c = 0;
                if (a < arr[0]) {
                    c = 0;
                } else if (a > arr[n - 1]) {
                    c = n;
                } else {
                    for (int i = 0; i < n; i++) {
                        if (arr[i] <= a) {
                            c++;
                        } else {
                            break;
                        }
                    }
                }
                System.out.println(c);
            }
        }
    }
}