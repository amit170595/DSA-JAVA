// You are given a number 'n' and you are asked to make 'n' divisible by 10. The only operation you can do on 'n' is 
// to multiply 'n' by 2. Given 'n' find out how many operations are required to make 'n' divisible by 10.


import java.util.*;
public class Devi {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0){
              int n= sc.nextInt();
              int rem=n%10;
              switch(rem){
                case 0:
                  System.out.println("0");
                  break;
                case 5:
                  System.out.println("1");
                  break;
                default:
                  System.out.println("-1");
              }
            }
        }
    }
}
