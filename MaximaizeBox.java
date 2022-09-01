import java.util.Scanner;

public class MaximaizeBox {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int f_a = sc.nextInt();
                int f_b = sc.nextInt();
                int f_c = sc.nextInt();
                if (Math.min(f_a, f_b) <= f_c) {
                    System.out.println(Math.min(f_a, f_b));
                } else {
                    int sum = (f_a + f_b + f_c) / 3;
                    System.out.println(Math.min(sum, Math.min(f_a, f_b)));
                }
            }
        }
    }

}
