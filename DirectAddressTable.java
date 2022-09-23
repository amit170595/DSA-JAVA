public class DirectAddressTable {
    public static void main(String[] args) {
        int arr[] = { 1, 2, 3, 4, 5, 4, 3, 2, 1 };
        int freq[] = new int[9];
        for (int i = 0; i < 9; i++)
            freq[arr[i]]++;
        for (int i = 0; i < 9; i++) {
            if (freq[i] != 0) {
                System.out.println(i + " " + freq[i]);
            }
        }
    }
}
