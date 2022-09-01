import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1\\BW.txt");
        BufferedWriter bw = new BufferedWriter(fw);
        bw.write(120);
        bw.newLine();
        bw.write('a');
        bw.newLine();
        bw.write("We are learning File Handling in Java");
        bw.newLine();
        char ch[] = { 'a', 'b', 'c', 'd' };
        bw.write(ch);
        bw.newLine();
        bw.flush();
        bw.close();
    }
}
