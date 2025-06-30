
package ClassTask;


import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

public class NameMarks {
    public static void main(String[] args) {
        HashMap<String, Integer> marks = new HashMap<>();
        Scanner sc = new Scanner(System.in);
        System.out.println("Name and marks (empty name to end):");
        while (true) {
            String name = sc.next();
            if (name.isBlank()) break;
            int score = sc.nextInt();
            marks.put(name, score);
        }
       

        int total = 0;
        for (int m : marks.values()) total += m;
        double average = marks.isEmpty() ? 0 : total / (double) marks.size();

        System.out.println("\nMarks:");
        for (Map.Entry<String, Integer> e : marks.entrySet()) {
            System.out.printf("%s → %d%n", e.getKey(), e.getValue());
        }
        System.out.printf("Average = %.2f%n", average);
    }
}
