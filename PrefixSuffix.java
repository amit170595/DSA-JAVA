import java.util.Scanner;

public class PrefixSuffix {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            char arr[] = sc.next().toCharArray();
            int n = arr.length;
            for (int i = 0; i < n; i++) {
                for (int j = 0; j <= i; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
            for (int i = n; i > 0; i--) {
                for (int j = i - 1; j < n; j++) {
                    System.out.print(arr[j]);
                }
                System.out.println();
            }
        }
    }
}
