/*Rahul is living in a colony containing N houses. He needs to label each house with a number from 1 to N.
Each house will be labelled with a distinct number. Rahul wants to know how many digits he will have to write 
down as he labels the houses. */

import java.util.Scanner;

public class HouseNumber {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t;
            t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextLong();
                long number = 0;
                for (int i = 1; i <= n; i *= 10)
                    number += (n - i + 1);
                System.out.println(number);
            }
        }
    }
}
