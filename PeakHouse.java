import java.util.Scanner;

public class PeakHouse {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int arr[] = new int[n];
                for (int i = 0; i < n; i++)
                    arr[i] = sc.nextInt();
                int max = arr[0];
                int j = 0;
                for (int i = 1; i < n; i++) {
                    if (arr[i] > max) {
                        max = arr[i];
                        j = i;
                    }
                }
                System.out.println(j);
            }
        }
    }
}
