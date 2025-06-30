import java.util.Scanner;

public class Leapyear {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the year");
		int year = scanner.nextInt();
		scanner.close();
		
		boolean isLeap =(year % 4 == 0 && year % 100 != 0 || year % 400 == 0) ;
		System.out.println(year + "is a leap year:" + isLeap);
		
	}	
}
