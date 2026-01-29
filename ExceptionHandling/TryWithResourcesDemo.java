package ExceptionHandling;

import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class TryWithResourcesDemo {
    public static void main(String[] args) {

        try (BufferedReader br = new BufferedReader(new FileReader("test.txt"))) {

            String line;
            while ((line = br.readLine()) != null) {
                System.out.println(line);
            }

        } catch (IOException e) {
            System.out.println("File error: " + e.getMessage());
        }
    }
}

