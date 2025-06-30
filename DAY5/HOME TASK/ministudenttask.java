
package HomeTasks;


import java.io.*;
import java.util.*;

public class MiniStudentApp {
    static ArrayList<String> studentNames = new ArrayList<>();
    static HashMap<Integer, ArrayList<String>> studentCourses = new HashMap<>();
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        int choice;
        do {
            menu();
            choice = Integer.parseInt(sc.nextLine());

            if (choice == 1) {
                addStudent();
            } else if (choice == 2) {
                searchStudent();
            } else if (choice == 3) {
                deleteStudent();
            } else if (choice == 4) {
                addCourse();
            } else if (choice == 5) {
                deleteCourse();
            } else if (choice == 6) {
                showAll();
            } else if (choice == 7) {
                saveCoursesToFile();
            } else if (choice != 8) {
                System.out.println("Invalid option.");
            }
        } while (choice != 8);
    }

    static void menu() {
        System.out.println("\n--- Menu ---");
        System.out.println("1. Add Student");
        System.out.println("2. Search Student");
        System.out.println("3. Delete Student");
        System.out.println("4. Add Course to Student");
        System.out.println("5. Delete Course from Student");
        System.out.println("6. Display All");
        System.out.println("7. Save Courses to File");
        System.out.println("8. Exit");
        System.out.print("Choose: ");
    }

    static void addStudent() {
        System.out.print("Enter name: ");
        String name = sc.nextLine();
        studentNames.add(name);
        System.out.println("Added.");
    }

    static void searchStudent() {
        System.out.print("Search by name: ");
        String target = sc.nextLine();
        boolean found = false;
        for (int i = 0; i < studentNames.size(); i++) {
            if (studentNames.get(i).equalsIgnoreCase(target)) {
                System.out.println("Found at index " + i);
                found = true;
                break;
            }
        }
        if (!found) {
            System.out.println("Not found.");
        }
    }

    static void deleteStudent() {
        System.out.print("Enter name to delete: ");
        String name = sc.nextLine();
        int index = studentNames.indexOf(name);
        if (index >= 0) {
            studentNames.remove(index);
            studentCourses.remove(index);
            System.out.println("Deleted.");
        } else {
            System.out.println("Student not found.");
        }
    }

    static void addCourse() {
        System.out.print("Student index: ");
        int idx = Integer.parseInt(sc.nextLine());
        if (idx < 0 || idx >= studentNames.size()) {
            System.out.println("Invalid student index.");
            return;
        }
        System.out.print("Course name: ");
        String course = sc.nextLine();
        ArrayList<String> list = studentCourses.getOrDefault(idx, new ArrayList<>());
        list.add(course);
        studentCourses.put(idx, list);
        System.out.println("Course added.");
    }

    static void deleteCourse() {
        System.out.print("Student index: ");
        int idx = Integer.parseInt(sc.nextLine());
        if (!studentCourses.containsKey(idx)) {
            System.out.println("No courses for this student.");
            return;
        }
        System.out.print("Course name to remove: ");
        String course = sc.nextLine();
        ArrayList<String> list = studentCourses.get(idx);
        if (list.remove(course)) {
            System.out.println("Course removed.");
        } else {
            System.out.println("Course not found.");
        }
    }

    static void showAll() {
        System.out.println("\n--- All Students ---");
        for (int i = 0; i < studentNames.size(); i++) {
            System.out.print(i + ": " + studentNames.get(i) + " → ");
            ArrayList<String> courses = studentCourses.getOrDefault(i, new ArrayList<>());
            System.out.println(courses);
        }
    }

    static void saveCoursesToFile() {
        try {
            BufferedWriter bw = new BufferedWriter(new FileWriter("course_data.txt"));
            for (int i = 0; i < studentNames.size(); i++) {
                bw.write(i + "," + studentNames.get(i));
                ArrayList<String> list = studentCourses.getOrDefault(i, new ArrayList<>());
                for (String course : list) {
                    bw.write("," + course);
                }
                bw.newLine();
            }
            bw.close();
            System.out.println("Saved to course_data.txt");
        } catch (IOException e) {
            System.out.println("File error.");
        }
    }
}
