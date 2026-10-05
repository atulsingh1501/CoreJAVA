package FileHandling;

import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class Write {

    public static void main(String[] args) throws IOException {

        File file = new File("data.txt");

        try {
            FileWriter writer = new FileWriter(file);

            writer.write("hello i am Atul");

            writer.close();

            System.out.println("File has been written");
        }
        catch (IOException e) {
            System.out.println("File error");
        }

        System.out.println(file.exists());
        System.out.println(file.getName());
        System.out.println(file.length());

        FileReader reader = new FileReader("data.txt");

        int ch;

        while ((ch = reader.read()) != -1) {
            System.out.print((char) ch);
        }

        reader.close();
    }
}
