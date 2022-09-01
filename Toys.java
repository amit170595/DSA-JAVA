// Chrish and Mike have 1 toy each. They are entering into an amusement park but it is not allowed to take the toys inside, 
// so they have to keep it in the boxes provided by the park management. They want to keep the toys together in one box. 
// There are 'N' boxes in total, at this moment there are 't' toys present in 'i' box and the maximum capacity of the box
// is denoted by 'c'. Rahul and Tina want to know in how many boxes can they keep their toys such that both the toys are in 
// the same box.

import java.util.*;

public class Toys {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int n = sc.nextInt();
            int count =0;
            while(n-->0){
                int t= sc.nextInt();
                int c = sc.nextInt();
                if(c-t>1){
                   count++;
                }
            }
            System.out.println(count);
        }
    }
    
}
