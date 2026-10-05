package FileHandling;

import java.io.*;

public class bufferReaderWritter {
    static void main() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("data.txt", true));
        bw.newLine();
        bw.write("Java");
        bw.newLine();
        bw.write("DSA");

        bw.close();
        BufferedReader br = new BufferedReader(new FileReader("data.txt"));

        String line;

        while ((line = br.readLine()) != null) {
            System.out.println(line);
        }

        br.close();
    }
}
