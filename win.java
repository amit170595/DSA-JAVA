import java.util.Scanner;

public class win {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int k = sc.nextInt();
        for (int i = 0;; i++) {
            if (i % 2 == 0) {
                if (i > k) {
                    System.out.println("Vlarea");
                    break;
                } else {
                    k -= i;
                }
            } else {
                if (i < n) {
                    System.out.println("vladik");
                    break;
                } else {
                    n -= i;
                }
            }
        }
        sc.close();
        ;
    }
}
