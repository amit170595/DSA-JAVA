import java.util.Scanner;

public class FullName {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Your Name: ");
        String fname = sc.next();
        System.out.println("Enter Your Surname: ");
        String sname = sc.next();
        System.out.println("Your Name is: " + fname + " " + sname);
        sc.close();
    }
}
