import java.util.Scanner;

public class LeapYear {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                int year = sc.nextInt();
                boolean leap = false;
                if (year % 4 == 0) {
                    if (year % 100 == 0) {
                        if (year % 400 == 0)
                            leap = true;
                        else
                            leap = false;
                    } else
                        leap = true;
                } else
                    leap = false;
                if (leap)
                    System.out.println("Yes");
                else
                    System.out.println("No");
            }
        }
    }
}
