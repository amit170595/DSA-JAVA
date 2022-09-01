// Tina is preparing a shopping list containing N items. She knows the quantity and price of each item on the list. 
// The shop is offering a 20% discount on the items with a quantity of more than 100 units. Given the quantity and
// price of each of the N items, your task is to calculate how much each item will cost.



import java.util.Scanner;

public class Shopping {
    public static void main(String[] args) {
        double Total, Final;
        try (Scanner sc = new Scanner(System.in)) {
            int t = sc.nextInt();
            while(t-->0){
                int q = sc.nextInt();
                int p = sc.nextInt();
                Total = q*p;
                if(q>100){
                    Final = (Total * 20)/100;
                    System.out.println(Total - Final);
                }
                else{
                    System.out.println(Total);
                }
            }
        }
    }
}
