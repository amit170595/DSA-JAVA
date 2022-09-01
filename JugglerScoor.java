// import java.util.Scanner;

// public class JugglerScoor {
//     static void printJuggler(int n) {
//         long a = n;
//         System.out.print(a + " ");
//         while (a != 1) {
//             int b = 0;
//             if (a % 2 == 0)
//                 b = (int) Math.floor(Math.sqrt(a));
//             else
//                 b = (int) Math.floor(Math.sqrt(a) * Math.sqrt(a) * Math.sqrt(a));

//             System.out.print(b + " ");

//         }
//     }

//     public static void main(String[] args) {
//         Scanner sc=new Scanner(System.in);
//         int t= sc.nextInt();
//         while(t-->0){
//         int n= sc.nextInt();
//         printJuggler(n);
//         System.out.println();
//         }
//     }
// }

import java.util.*;
import java.io.*;

public class JugglerScoor {
    public static void main(String args[]) throws IOException {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                long n = sc.nextInt();
                jum_sequence(n);
                System.out.println();
            }
        }
    }

    public static void jum_sequence(long n) {

        long a = n;
        System.out.print(a + " ");
        while (a != 1) {
            long b = 0;
            if (a % 2 == 0)
                b = (long) Math.floor(Math.sqrt(a));
            else
                b = (long) Math.floor(Math.sqrt(a) * Math.sqrt(a) * Math.sqrt(a));

            System.out.print(b + " ");
            a = b;

        }
    }
}