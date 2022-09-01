public class Vpettern {
    public static void main(String[] args) {
        int Space = 8;
        for (int i = 1; i <= 5; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j);
            }
            for (int k = 1; k <= Space; k++) {
                System.out.print(" ");
            }
            Space = Space - 2;
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            System.out.println();
        }
    }

}
