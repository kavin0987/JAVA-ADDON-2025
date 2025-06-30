
package ClassTasks;



import java.util.Scanner;



public class T2_VowelsConsonants {

	

	public static void main(String[] args) {

		

		Scanner s = new Scanner(System.in);

		System.out.println("Enter String:");

		String str = s.nextLine();

		str = str.toLowerCase();

		int vowels = 0, consonants = 0;

		

		for(int i =0; i <str.length(); i++) {

			

			char ch = str.charAt(i);

			if(Character.isLetter(ch)) {

			   if(ch=='a'||ch=='e'||ch=='i'||ch=='o'||ch=='u') {

					vowels++;

			}

		    else {

				    consonants++;

			}

		}

	}

		System.out.println("Vowels:" +vowels);

		System.out.println("Consonants:" +consonants);

	}



}
