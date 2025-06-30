
package Day3;

public class Main {
	public class Student {
	    private int rollNo;
	    private String name;
	    private int[] marks;

	    public Student(int rollNo, String name) {
	        this.rollNo = rollNo;
	        this.name = name;
	        this.marks = new int[3];  // Assuming 3 subjects
	    }

	    public void assignMarks(int m1, int m2, int m3) {
	        marks[0] = m1;
	        marks[1] = m2;
	        marks[2] = m3;
	    }

	    public void displayResult() {
	        int total = marks[0] + marks[1] + marks[2];
	        double average = total / 3.0;

	        System.out.println("Student Roll No: " + rollNo);
	        System.out.println("Name: " + name);
	        System.out.println("Marks: ");
	        System.out.println("  Subject 1: " + marks[0]);
	        System.out.println("  Subject 2: " + marks[1]);
	        System.out.println("  Subject 3: " + marks[2]);
	        System.out.println("Total Marks: " + total);
	        System.out.println("Average: " + average);
	    }

	    public static void main(String[] args) {
	        Student s1 = new Student(101, "Alice");
	        s1.assignMarks(85, 90, 78);
	        s1.displayResult();
	    }
	}

}
