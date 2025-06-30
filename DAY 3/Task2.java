

package Day3;

public class Task2 {
    private int id;
    private String name;
    private double basicSalary;

    // Corrected constructor name to match the class name 'Task2'
    public Task2(int id, String name, double basicSalary) {
        this.id = id;
        this.name = name;
        this.basicSalary = basicSalary;
    }

    public double calculateTotalSalary() {
        double hra = 0.20 * basicSalary;
        double da = 0.10 * basicSalary;
        double pf = 0.05 * basicSalary;
        double totalSalary = basicSalary + hra + da - pf;
        return totalSalary;
    }

    public void displayDetails() {
        System.out.println("Employee ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Basic Salary: $" + basicSalary);
        System.out.println("Total Salary: $" + calculateTotalSalary());
    }

    public static void main(String[] args) {
        // Corrected to use Task2 instead of Employee
        Task2 emp = new Task2(101, "Alice", 50000);
        emp.displayDetails();
    }
}
