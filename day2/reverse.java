
package ClassTasks;



import java.util.Scanner;



public class T1_ReverseArray {

	

	public static void main(String[] args) {

		

		int i;

		Scanner s = new Scanner(System.in);

		System.out.println("Enter  the no of elements:"); 

		

		int size = s.nextInt();

		int[]numbers = new int[size];

		System.out.println("Enter the number:");

		

		for( i =0; i <size; i++) {

		numbers[i] = s.nextInt();

		}

	

	System.out.println("Array in reverse :");

	

	

	for(i =size-1; i >=0; i--) {

		System.out.println(numbers[i]+"");

		

	}

	}

}
