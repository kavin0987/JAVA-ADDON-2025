
package ClassTask;

import java.util.*;

public class StudentManager {
    private ArrayList<Student> students = new ArrayList<>();
    private HashSet<String> emailSet = new HashSet<>();
    private HashMap<String, ArrayList<Integer>> studentMarks = new HashMap<>();

    public void addStudent(Student student) {
        students.add(student);
        emailSet.add(student.getEmail());
    }

    public void displayStudents() {
        System.out.println("=== Student List using Iterator ===");
        Iterator<Student> it = students.iterator();
        while (it.hasNext()) {
            System.out.println(it.next());
        }
    }

    public void displayEmails() {
        System.out.println("=== Unique Email Addresses ===");
        for (String email : emailSet) {
            System.out.println(email);
        }
    }

    public void addMarks(String studentName, List<Integer> marks) {
        studentMarks.put(studentName, new ArrayList<>(marks));
    }

    public void displayStudentAverages() {
        System.out.println("=== Student Marks and Averages ===");
        for (Map.Entry<String, ArrayList<Integer>> entry : studentMarks.entrySet()) {
            String name = entry.getKey();
            ArrayList<Integer> marks = entry.getValue();
            double avg = marks.stream().mapToInt(i -> i).average().orElse(0.0);
            System.out.println(name + " → " + marks + " | Average: " + avg);
        }
    }
}
