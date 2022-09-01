import java.util.Scanner;

public class SumOfElement {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int size = sc.nextInt();
                int myArray[] = new int[size];
                int sum = 0;
                for (int i = 0; i < size; i++) {
                    myArray[i] = sc.nextInt();
                    sum = sum + myArray[i];
                }
                System.out.println(sum);
            }
        }
    }
}
