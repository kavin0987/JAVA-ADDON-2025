
package Day3;
import java.util.*;
public class Post {
	    static HashMap<String, Boolean> books = new HashMap<>();

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        while (true) {
	            System.out.println("\n1.Add  2.Issue  3.Show  4.Exit");
	            int choice = sc.nextInt(); sc.nextLine();
	            if (choice == 1) {
	                System.out.print("Book title: ");
	                String title = sc.nextLine();
	                books.put(title, false);
	                System.out.println("Added: " + title);
	            } else if (choice == 2) {
	                System.out.print("Book title to issue: ");
	                String title = sc.nextLine();
	                if (books.containsKey(title)) {
	                    if (!books.get(title)) {
	                        books.put(title, true);
	                        System.out.println("Issued: " + title);
	                    } else {
	                        System.out.println("Already issued.");
	                    }
	                } else {
	                    System.out.println("Not found.");
	                }
	            } else if (choice == 3) {
	                if (books.isEmpty()) System.out.println("No books.");
	                else for (String title : books.keySet())
	                    System.out.println(title + (books.get(title) ? " (Issued)" : " (Available)"));
	            } else if (choice == 4) break;
	            else System.out.println("Invalid.");
	        }
	        sc.close();
	    }
	}
