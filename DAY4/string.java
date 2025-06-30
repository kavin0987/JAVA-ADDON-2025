
package ClassTasks;
import java.io.*;
import java.util.Scanner;

public class T3_String {
	

	public class WriteToFile {
	    public static void main(String[] args) {
	        try (BufferedWriter writer = new BufferedWriter(new FileWriter("output.txt"))) {
	            Scanner sc = new Scanner(System.in);
	            System.out.println("Enter 3 lines to write to the file:");
	            for (int i = 0; i < 3; i++) {
	                String line = sc.nextLine();
	                writer.write(line);
	                writer.newLine();
	            }
	            System.out.println("File written successfully.");
	        } catch (IOException e) {
	            System.out.println("Error: " + e.getMessage());
	        }
	    }
	}


}
