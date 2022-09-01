import java.util.Scanner;

public class SumOfString {
    
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while (t-- > 0) {
                String sum="";
               // int n = sc.nextInt();
                String str1 = sc.next();
                String str2[] = str1.trim().split(" ");
                for (int i = 0; i < str2.length; i++) {
                    sum= sum+str2[i];
                }
                System.out.println(sum);
            }
        }
    }
  }
