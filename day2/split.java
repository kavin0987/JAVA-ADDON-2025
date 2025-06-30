
package ClassTasks;





import java.util.Scanner;



public class T3_SplitSentence {

	

	public static void main(String[] args) {

		

		Scanner s = new Scanner(System.in);

		System.out.println("Enter a sentence:");

		String str = s.nextLine();

		String[]words = str.split("\\s+");

		System.out.println("Words in the sentence:");

		for(String word:words) {

			

			System.out.println(word);

		}

	}



}
