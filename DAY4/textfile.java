
package ClassTasks;

import java.io.*;

public class T2_TextFile {
    public static void main(String[] args) {
        try (BufferedReader reader = new BufferedReader(new FileReader("results.txt"))) {
            String line;
            while ((line = reader.readLine()) != null)
                System.out.println(line);
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
