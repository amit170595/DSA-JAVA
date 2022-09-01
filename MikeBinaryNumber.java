import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class MikeBinaryNumber {
    static void permutation(int no_ones, int no_zeroes, String accum, ArrayList<String> perm) {
        if (no_ones == 0) {
            for (int i = 0; i < no_zeroes; i++) {
                accum += "0";
            }
            perm.add(accum);
            return;
        } else if (no_zeroes == 0) {
            for (int j = 0; j < no_ones; j++) {
                accum += "1";
            }
            perm.add(accum);
            return;
        }
        permutation(no_ones - 1, no_zeroes, accum + "1", perm);
        permutation(no_ones, no_zeroes - 1, accum + "0", perm);
    }

    public static void main(String args[]) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                int ones = 0, zeros = 0;
                while (n > 0) {
                    if (n % 2 == 0)
                        zeros++;
                    else
                        ones++;
                    n /= 2;
                }
                String append = "";
                ArrayList<String> perm = new ArrayList<String>();
                permutation(ones, zeros, append, perm);
                Collections.sort(perm);
                for (int i = 0; i < perm.size(); i++)
                    System.out.print(perm.get(i) + " ");
                System.out.println();
            }
        }
    }
}
