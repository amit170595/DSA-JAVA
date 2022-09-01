/* PrepBuddy provided you with a rectangular board of M*N dimension. Also, he provided an unlimited number of small
blocks of 2*1 size. You are allowed to rotate the block. You are asked to place as many blocks as possible on 
the board to meet the following conditions:
1. Each block completely covers two squares.
2. No two blocks overlap.
3. Each block lies entirely inside the board. It is allowed to touch the edges of the board.
Find the maximum number of blocks, which can be placed under these restrictions. */

import java.util.Scanner;

public class FitSquare {
    public static void main(String[] args) {
        try (Scanner sc = new Scanner(System.in)) {
            int t= sc.nextInt();
            while(t-->0){
                int m = sc.nextInt();
                int n = sc.nextInt();
                System.out.println((m*n)/2);
            }
        }
    }
}
