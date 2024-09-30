import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

//Write a program that reads from a text file and writes the contents to another file, line by line
public class SimpleFileReadWrite {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("input.txt");
            FileWriter writer = new FileWriter("output.txt");

            int character;

            while ((character = reader.read()) != -1) {
                writer.write(character);
            }


            reader.close();
            writer.close();

            System.out.println("File copy completed.");
        } catch (IOException e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
