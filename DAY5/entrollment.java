
package ClassTask;

import java.util.Arrays;

public class Enrollment {
    public static void main(String[] args) {

        /* ---------- students & marks ---------- */
        StudentManager studentManager = new StudentManager();
        studentManager.addStudent(new Student("Keerthi", "keerthismsk@gmail.com"));
        studentManager.addStudent(new Student("Dhanu",   "dhanu2345@gmail.com"));
        studentManager.addStudent(new Student("Nandhu",  "nand husri223@gmail.com"));

        studentManager.displayStudents();
        studentManager.displayEmails();

        studentManager.addMarks("Keerthi", Arrays.asList(85, 90, 80));
        studentManager.addMarks("Dhanu",   Arrays.asList(70, 75, 65));
        studentManager.addMarks("Nandhu",  Arrays.asList(95, 88, 92));

        System.out.println();
        studentManager.displayStudentAverages();

        /* ---------- course enrollments ---------- */
        EnrollmentManager enrollmentManager = new EnrollmentManager();
        enrollmentManager.addStudent("Keerthi", Arrays.asList("Math",      "Physics"));
        enrollmentManager.addStudent("Dhanu",   Arrays.asList("Chemistry", "Biology"));
        enrollmentManager.addStudent("Nandhu",  Arrays.asList("English",   "History"));

        System.out.println();
        enrollmentManager.displayEnrollments();

        enrollmentManager.removeStudent("Dhanu");
        System.out.println("\n=== After Removing Dhanu ===");
        enrollmentManager.displayEnrollments();
    }
}
