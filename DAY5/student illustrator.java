
package ClassTask;

import java.util.ArrayList;
import java.util.Iterator;

public class StudentIllustrator {
    public static void main(String[] args) {
        ArrayList<String> students = new ArrayList<>();
        students.add("Keerthi");
        students.add("Dhanu");
        students.add("Nandhu");

        System.out.println("Students (via Iterator):");
        Iterator<String> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }
}