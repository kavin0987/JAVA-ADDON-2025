import java.util.Scanner;
public class Menudrivencalculator {
	
	//method for addition
	public static int add(int a , int b) {
		return a +b;
	}
	public static int subraction(int a , int b) {
		return a -b;
	}
	
	public static int multiplication(int a , int b) {
		return a *b;
	}
	
	public static int division(int a,int b) {
		if (b == 0){
			System.out.println("cannot divided by zero");
			return 0;
			
		}
		return a / b;
		
	}
	//main method
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int choice, num1,num2;
		
		System.out.println("1.addition");
		System.out.println("2.subraction");
	System.out.println("3.multiplication");
	System.out.println("4.division");
	System.out.println("5.exit");
	System.out.println("enter your choice (1-5):");
	choice = scan.nextInt();
	System.out.println("enter the first number:");
	num1 = scan.nextInt();
	System.out.println("enter the second number:");
	num2 = scan.nextInt();
	
	
	switch (choice) {
	case 1:
		System.out.println("result:" + add(num1, num2));
		break;
		
	case 2:
		System.out.println("result:" + subraction(num1, num2));
		break;
		
	case 3 :
		System.out.println("result:" + multiplication(num1, num2));
		break;
		
	case 4:
		System.out.println("result:" + division(num1, num2));
		break;
		
		default:
			System.out.println("invalid choice please try again.");
	}
	 scan.close();
	
	}
	
	
	
	
	
	
}
