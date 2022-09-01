import java.util.Scanner;

public class FascinatingNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                n = n + 1;
                while (true) {
                    int a = n % 10;
                    int b = (n / 10) % 10;
                    int c = (n / 100) % 10;
                    int d = (n / 1000) % 10;
                    if (a != b && a != c && a != d && b != c && b != d && c != d) {
                        break;
                    } else {
                        n = n + 1;
                    }
                }
                System.out.println(n);
            }
        }
    }
}
