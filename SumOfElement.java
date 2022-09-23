import java.math.BigInteger;
import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int size = sc.nextInt();
                String arr[] = new String[size];
                for (int i = 0; i < size; i++)
                    arr[i] = sc.next();
                BigInteger sum = new BigInteger("0");
                for (int i = 0; i < size; i++) {
                    BigInteger j = new BigInteger(arr[i]);
                    sum = sum.add(j);
                }
                System.out.println(sum);
            }
        }
    }
}
