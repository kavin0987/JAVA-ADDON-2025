
package ClassTask;

import java.util.HashSet;
import java.util.Scanner;

public class EmailSet {
    public static void main(String[] args) {
        HashSet<String> emails = new HashSet<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter emails (blank to stop):");
        while (true) {
            String email = sc.nextLine().trim();
            if (email.isEmpty()) break;
            boolean added = emails.add(email.toLowerCase());
            System.out.println(added ? "Added." : "Duplicate — ignored.");
        }
        System.out.println("\nUnique emails:");
        for (String e : emails) {
            System.out.println(e);
        }
       
    }
}
