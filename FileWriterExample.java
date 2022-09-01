import java.io.FileWriter;
import java.io.IOException;

public class FileWriterExample {
    public static void main(String[] args) throws IOException {
        FileWriter fw = new FileWriter("C:\\Users\\amitr\\Desktop\\DSA JAVA\\Test1\\text1.text");
        fw.write(103);
        fw.write("\n");
        fw.write('r' + "\n");
        fw.write("We are learning FileHandling in Java");
        fw.write("\n");
        char ch[] = { 'a', 'b', 'c', 'd' };
        fw.write(ch);
        fw.write("\n");
        fw.append("abcde");
        fw.flush();
        fw.close();
    }
}
