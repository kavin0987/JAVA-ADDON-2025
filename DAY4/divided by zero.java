
package ClassTasks;

import java.util.Scanner;

public class T1_DivideByZeroExample {
	
    public static void main(String[] args) {
    	
    	int numerator, denominator;
    	
       Scanner s = new Scanner(System.in);
       System.out.println("Enter a Numerator:");
       numerator = s.nextInt();
       System.out.println("Enter a Denominator:");
       denominator = s.nextInt();
       

        try {
            int result = numerator / denominator; // This will throw ArithmeticException
            System.out.println("Result: " + result);
        } catch (ArithmeticException e) {
            System.out.println("Error: Division by zero is not allowed.");
        } finally {
            System.out.println("Execution completed.");
        }
    }
}
