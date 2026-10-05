package FileHandling;
import java.io.FileWriter;
import java.io.IOException;
import java.util.*;
public class Exception {
    public static void readFile() throws IOException {
        FileWriter writer = new FileWriter("C:\\invalid\\abc\\data.txt");
    }
    public static void main(String[] args) {

        try {
            readFile();
        }
        catch (IOException e) {
            System.out.println("File error");
        }
    }
}
