import java.util.Scanner;

public class BuildingSun {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                for (int i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                System.out.println(countBuildings(a, n));
            }
        }

    }

    static int countBuildings(int arr[], int n) {
        int count = 1;
        int curr_max = arr[0];
        for (int i = 1; i < n; i++) {
            if (arr[i] > curr_max || arr[i] == curr_max) {
                count++;
                curr_max = arr[i];
            }
        }

        return count;
    }
}
