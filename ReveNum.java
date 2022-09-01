import java.util.Scanner;

public class ReveNum {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int rem = 0, rev = 0;
            int n = sc.nextInt();
            while (n > 0) {
                rem = n % 10;
                n = n / 10;
                rev = rev * 10 + rem;
            }
            System.out.println(rev);
        }

    }
}
