import java.util.Scanner;

public class PrefixWithOne {
    static void printRec(String number, int extraOnes, int remainingPlaces) {
        if (0 == remainingPlaces) {
            System.out.print(number + " ");
            return;
        }
        printRec(number + "1", extraOnes + 1, remainingPlaces - 1);
        if (0 < extraOnes)
            printRec(number + "0", extraOnes - 1, remainingPlaces - 1);
    }

    static void printNums(int n) {
        String str = "";
        printRec(str, 0, n);
    }

    // Driver code
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int n = sc.nextInt();
                printNums(n);
                System.out.println();
            }
        }
    }
}
