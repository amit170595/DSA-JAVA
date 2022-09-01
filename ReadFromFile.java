import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadFromFile {
    public static void main(String[] args) throws IOException {
        FileReader fr = new FileReader("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1\\text1.text");
        try (BufferedReader br = new BufferedReader(fr)) {
            int val = Integer.parseInt(br.readLine());
            double d = Double.parseDouble(br.readLine());
            String str = br.readLine();
            System.out.println(val + " " + d + " " + str);
            String str1 = br.readLine();
            String str2[] = str1.trim().split(" ");
            int arr[] = new int[str2.length];
            for (int i = 0; i < str2.length; i++) {
                arr[i] = Integer.parseInt(str2[i]);
                System.out.println(arr[i] + " ");
            }
        } catch (NumberFormatException e) {
            e.printStackTrace();
        }
    }
}
