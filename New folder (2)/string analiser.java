
package ClassTasks;



import java.util.Scanner;



public class T4_StringAnalyzer {



    

    public static void StrAnalyzer(String str) {

        

       

		String[] words = str.split("\\s+");



        int wordCount = words.length;

        int charCount = 0;

        String longestWord = "";

        

        for (String word : words) {

            charCount += word.length();

            if (word.length() > longestWord.length()) {

                longestWord = word;

            }

        }



        String reversedString = new StringBuilder(str).reverse().toString();



        System.out.println("Word Count: " + wordCount);

        System.out.println("Character Count: " + charCount);

        System.out.println("Reversed String: " + reversedString);

        System.out.println("Longest Word: " + longestWord);

    }



    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        

      

        System.out.print("Enter a string to analyze: ");

        String str = s.nextLine();

        

       

		StrAnalyzer(str);

        

       

    }

}
