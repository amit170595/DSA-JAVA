import java.util.Scanner;

public class RearrangAraay {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int a[] = new int[n];
                int b[] = new int[n];
                int i;
                for (i = 0; i < n; i++) {
                    a[i] = sc.nextInt();
                }
                if (n % 2 != 0) {
                    int j = 0, min = 0, max = n - 1;
                    i = 0;
                    while (i < n / 2) {
                        if (max == min) {
                            b[j] = a[max];
                            break;
                        }
                        b[j] = a[max];
                        j++;
                        b[j] = a[min];
                        max--;
                        min++;
                        j++;
                        i++;
                    }
                } else {
                    int j = 0, min = 0, max = n - 1;
                    i = 0;
                    while (i < n / 2) {
                        b[j] = a[max];
                        j++;
                        b[j] = a[min];
                        max--;
                        min--;
                        j++;
                        i++;
                    }
                }
                for (i = 0; i < n; i++) {
                    System.out.print(b[i] + " ");
                }
                System.out.println();
            }
        }
    }
}
