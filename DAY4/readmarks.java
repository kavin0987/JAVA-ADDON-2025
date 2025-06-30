
package ClassTasks;

import java.io.*;

public class T4_ReadMarks {
    public static void main(String[] args) {
        try (
            BufferedReader reader = new BufferedReader(new FileReader("marks.txt"));
            BufferedWriter writer = new BufferedWriter(new FileWriter("results.txt"))
        ) {
            String line;
            while ((line = reader.readLine()) != null) {
                String[] parts = line.split(",");
                String name = parts[0];
                int total = 0;
                for (int i = 1; i < parts.length; i++) {
                    total += Integer.parseInt(parts[i]);
                }
                int avg = total / (parts.length - 1);
                String result = avg >= 40 ? "PASS" : "FAIL";
                writer.write(name + " - Total: " + total + ", Average: " + avg + ", Result: " + result);
                writer.newLine();
            }
            System.out.println("Result file written successfully.");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        }
    }
}
